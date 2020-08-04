package ad.zebra.sponsor.service;

import ad.zebra.sponsor.entity.AdUser;
import ad.zebra.sponsor.vo.AdUserVO;

public interface IUserService {

    public AdUserVO createUser(AdUserVO adUserVO);
}
