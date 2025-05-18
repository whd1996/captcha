package cool.whd.captcha;

import cool.whd.captcha.DO.TestTabDO;
import cool.whd.captcha.mapper.TestTabMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class ApplicationTests {
    @Autowired
    private TestTabMapper testTabMapper;
    @Test
    void testMapper() {
        List<TestTabDO> testTabDOS = testTabMapper.selectList(null);
        log.info("testTabDOS: {}", testTabDOS);
    }


}
