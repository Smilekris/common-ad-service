package ad.zebra.sponsor.vo;

import com.alibaba.druid.util.StringUtils;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ClassName AdUserVO
 * @Author yamei
 * @Date 2020/7/31
 **/
@Data
@Accessors(chain = true)
public class AdUserVO {
    private Long id;

    private String username;

    private String token;

    private Integer userStatus;

    private Integer createTime;

    private Integer updateTime;

    public boolean volidate(){
        return !StringUtils.isEmpty(this.username);
    }
}
