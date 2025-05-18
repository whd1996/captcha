package cool.whd.captcha.service.impl;

import cloud.tianai.captcha.application.ImageCaptchaApplication;
import cloud.tianai.captcha.application.vo.CaptchaResponse;
import cloud.tianai.captcha.application.vo.ImageCaptchaVO;
import cool.whd.captcha.constant.StrategyTypeNum;
import cool.whd.captcha.service.CaptchaService;
import cool.whd.captcha.strategy.factory.StrategyFactory;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Service
@Slf4j
public class CaptchaServiceImpl implements CaptchaService {
    @Autowired
    private StrategyFactory strategyFactory;
    @Autowired
    private ImageCaptchaApplication imageCaptchaApplication;

    @Override
    public CaptchaResponse<ImageCaptchaVO> generateCaptcha(String type, Map<String, Object> paramMap) {
        StrategyTypeNum strategyTypeNum;
        if (StringUtils.endsWithIgnoreCase("random", type)) {
            strategyTypeNum = StrategyTypeNum.values()[ThreadLocalRandom.current().nextInt(0, 4)];
        } else {
            strategyTypeNum = StrategyTypeNum.getByCode(type);
            if (strategyTypeNum == null) {
                log.info("未找到对应的验证码类型{}，使用默认{}", type, StrategyTypeNum.SLIDER);
                strategyTypeNum = StrategyTypeNum.SLIDER;
            }
        }
        //没有额外参数处理 调用这个
        if(CollectionUtils.isEmpty(paramMap)){
            return strategyFactory.getStrategy(strategyTypeNum.getStrategyName()).generateCaptcha(strategyTypeNum.name(), imageCaptchaApplication);
        }
        //如果需要额外参数处理 调用这个
        return strategyFactory.getStrategy(strategyTypeNum.getStrategyName()).generateCaptcha(imageCaptchaApplication,paramMap);
    }
}
