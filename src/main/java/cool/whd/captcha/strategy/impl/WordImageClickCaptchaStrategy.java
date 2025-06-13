package cool.whd.captcha.strategy.impl;

import cloud.tianai.captcha.application.ImageCaptchaApplication;
import cloud.tianai.captcha.application.vo.CaptchaResponse;
import cloud.tianai.captcha.application.vo.ImageCaptchaVO;
import com.alibaba.fastjson2.JSON;
import cool.whd.captcha.constant.StrategyTypeNum;
import cool.whd.captcha.strategy.CaptchaStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class WordImageClickCaptchaStrategy implements CaptchaStrategy {

    @Override
    public CaptchaResponse<ImageCaptchaVO> generateCaptcha(ImageCaptchaApplication imageCaptchaApplication, Map<String, Object> paramMap) {
        log.info("WordImageClickCaptchaStrategy generateCaptcha type:{}", StrategyTypeNum.WORD_IMAGE_CLICK);
        log.info("其他{}业务逻辑参数{}", StrategyTypeNum.WORD_IMAGE_CLICK.getDesc(), JSON.toJSONString(paramMap));
        //TO DO 不同的处理写在这里
        return generateCaptcha(StrategyTypeNum.WORD_IMAGE_CLICK.name(), imageCaptchaApplication);
    }
}
