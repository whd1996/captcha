package cool.whd.captcha.service.impl;

import cool.whd.captcha.DO.TestTabDO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cool.whd.captcha.mapper.TestTabMapper;
import cool.whd.captcha.service.TestTabService;
@Service
public class TestTabServiceImpl extends ServiceImpl<TestTabMapper, TestTabDO> implements TestTabService{

}
