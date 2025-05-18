package cool.whd.captcha.controller;

import cool.whd.captcha.result.Result;
import cool.whd.captcha.service.TestTabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestTabService testTabService;

    @GetMapping("/test")
    public Result test() {
        return Result.success(testTabService.list());
    }
}
