package InfiniteMusic.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@TableName(value = "user")
public class User {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String password;
    private String sex;
    private int age;
    private String nickname;
    private Date createTime;
    @TableField("likelist_id")
    private Long likelistId;

    public User(){}

}
