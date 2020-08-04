import ad.zebra.sponsor.entity.AdUser;
import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @ClassName jaspytTest
 * @Author yamei
 * @Date 2020/7/22
 **/
public class jaspytTest {
    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐),自定义
        textEncryptor.setPassword("ambition");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("123456");
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }
}
