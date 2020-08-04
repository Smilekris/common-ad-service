package ad.zebra.sponsor.service.impl;

import ad.zebra.common.exception.ZebraException;
import ad.zebra.sponsor.common.Constants;
import ad.zebra.sponsor.dao.AdUserDao;
import ad.zebra.sponsor.entity.AdUser;
import ad.zebra.sponsor.service.IUserService;
import ad.zebra.sponsor.util.CommonUtils;
import ad.zebra.sponsor.vo.AdUserVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.Instant;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Author kris
 * @Date 2020/7/31
 **/
@Service
public class UserServiceImpl extends ServiceImpl<AdUserDao, AdUser> implements IUserService {
    @Override
    public AdUserVO createUser(AdUserVO userParam) {
        //检查参数，查询数据库
        if(!userParam.volidate()){
            throw new ZebraException(Constants.ErrorMsg.QEQUEST_PARAM_ERROR);
        }
        List<AdUser> users = this.baseMapper.selectList(new QueryWrapper<AdUser>().eq("username", userParam.getUsername()));
        if (!CollectionUtils.isEmpty(users)){
            throw new ZebraException(Constants.ErrorMsg.DUPLICATE_USERNAME_ERROR);
        }

        //插入数据库
        Integer currentTime = (int)Instant.now().getEpochSecond();
        AdUser user = new AdUser();
        BeanUtils.copyProperties(userParam,user);
        user.setCreateTime(currentTime).setUpdateTime(currentTime).setToken(CommonUtils.md5(user.getUsername()));
        this.save(user);
        return userParam.setId(user.getId());
    }
}
