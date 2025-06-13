package cool.whd.captcha.DO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test_tab")
public class TestTabDO {
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "age")
    private String age;
}
