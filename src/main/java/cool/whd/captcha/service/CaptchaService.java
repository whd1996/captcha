package cool.whd.captcha.service;

import cloud.tianai.captcha.application.vo.CaptchaResponse;
import cloud.tianai.captcha.application.vo.ImageCaptchaVO;

import java.util.Map;

public interface CaptchaService {
    /**
     * 生成验证码
     * @param type 验证码类型
     * @param paramMap 额外的处理参数
     * @return 验证码
     */
    CaptchaResponse<ImageCaptchaVO> generateCaptcha(String type, Map<String,Object> paramMap);
}
