package cool.whd.captcha.strategy;

import cloud.tianai.captcha.application.ImageCaptchaApplication;
import cloud.tianai.captcha.application.vo.CaptchaResponse;
import cloud.tianai.captcha.application.vo.ImageCaptchaVO;

import java.util.Map;

public interface CaptchaStrategy {
    /**
     * 生成验证码
     *
     * @param imageCaptchaApplication imageCaptchaApplication
     * @param paramMap                额外的业务逻辑动态处理参数
     *
     * @return 验证码
     */
    CaptchaResponse<ImageCaptchaVO>  generateCaptcha(ImageCaptchaApplication imageCaptchaApplication, Map<String,  Object> paramMap);

    /**
     * 默认使用默认的生成方式
     *
     * @param type                    验证码类型
     * @param imageCaptchaApplication imageCaptchaApplication
     * @return 验证码
     */
    default  CaptchaResponse<ImageCaptchaVO> generateCaptcha(String type,ImageCaptchaApplication imageCaptchaApplication){
        return imageCaptchaApplication.generateCaptcha(type);
    }
}
