package cool.whd.captcha.constant;

import cloud.tianai.captcha.common.constant.CaptchaTypeConstant;
import lombok.Getter;

@Getter
public enum StrategyTypeNum {
    SLIDER(CaptchaTypeConstant.SLIDER,  "滑块验证码","sliderCaptchaStrategy"),
    ROTATE(CaptchaTypeConstant.ROTATE,  "旋转验证码","rotateCaptchaStrategy"),
    WORD_IMAGE_CLICK(CaptchaTypeConstant.WORD_IMAGE_CLICK,  "文字图片点击验证码","wordImageClickCaptchaStrategy"),
    CONCAT(CaptchaTypeConstant.CONCAT,  "拼图验证码","concatCaptchaStrategy");

    private final String code;
    private final String desc;
    private final String strategyName;

    StrategyTypeNum(String code, String desc, String strategyName) {
        this.code = code;
        this.desc = desc;
        this.strategyName = strategyName;
    }
    /**
     * 根据code获取枚举
     * @param code
     * @return
     */
    public static StrategyTypeNum getByCode(String code) {
        for (StrategyTypeNum item : StrategyTypeNum.values()) {
            if (item.code.equals(code)) {
                return item;
            }
        }
        return null;
    }
}
