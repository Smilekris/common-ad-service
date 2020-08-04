package ad.zebra.sponsor.rest;

import ad.zebra.common.entity.R;
import ad.zebra.sponsor.service.IUserService;
import ad.zebra.sponsor.vo.AdUserVO;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName SponsorController
 * @Author kris
 * @Date 2020/7/31
 **/
@RestController
@RequestMapping("/api/sponsor")
public class SponsorController {

    private final IUserService userService;

    public SponsorController(IUserService userService){
        this.userService = userService;
    }


    @GetMapping("/add")
    public R createUser(@RequestBody AdUserVO userParam){
        AdUserVO user = userService.createUser(userParam);
        return R.ResultHelper.successInstance().setResult(user);
    }

}
