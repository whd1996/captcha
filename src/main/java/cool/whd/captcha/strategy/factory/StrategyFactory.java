package cool.whd.captcha.strategy.factory;

import cool.whd.captcha.strategy.CaptchaStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Slf4j
@Lazy
public class StrategyFactory {

    @Autowired
    private Map<String, CaptchaStrategy> captchaStrategyMap=new ConcurrentHashMap<>();

    public CaptchaStrategy getStrategy(String strategyName) {
        return captchaStrategyMap.get(strategyName);
    }

}
