package ad.zebra.sponsor.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @ClassName AdUser
 * @Author kris
 * @Date 2020/7/22
 **/
@Data
@TableName("ad_user")
@Accessors(chain = true)
public class AdUser {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String username;

    private String token;

    private Integer userStatus;

    private Integer createTime;

    private Integer updateTime;
}
