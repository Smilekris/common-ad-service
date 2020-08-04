package ad.zebra.sponsor.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @ClassName CommonUtils
 * @Author yamei
 * @Date 2020/7/31
 **/
public class CommonUtils {
    public static String md5(String value){
        return DigestUtils.md5Hex(value).toUpperCase();
    }
}
