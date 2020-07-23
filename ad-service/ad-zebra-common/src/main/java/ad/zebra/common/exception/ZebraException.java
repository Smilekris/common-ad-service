package ad.zebra.common.exception;

/**
 * @ClassName ZebraException
 * @Author kris
 * @Date 2019/8/14
 **/
public class ZebraException extends RuntimeException {
    public static int SUCCESS = 0;
    public static int FAIL = -1;

    private int Code;
    private String msg;

    public int getCode() {
        return Code;
    }

    public String getMsg() {
        return msg;
    }

    private ZebraException() {

    }

    public ZebraException(int code, String msg) {
        super(msg);
        Code = code;
        this.msg = msg;
    }

    public ZebraException(String msg) {
        super(msg);
        Code = FAIL;
        this.msg = msg;
    }

    public ZebraException(int code, String msg, Throwable cause) {
        super(msg, cause);
        Code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ZebraException{" +
                "Code=" + Code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
