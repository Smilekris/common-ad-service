package ad.zebra.common.entity;

public class R<T> {

    private final static Integer SUCCESS = 0;
    private final static Integer FAIL = -1;

    private Integer code;

    private String msg;

    private T result;

    private R(){
    }

    private R(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public R setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public R setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getResult() {
        return result;
    }

    public R setResult(T result) {
        this.result = result;
        return this;
    }

    public static Integer getSUCCESS() {
        return SUCCESS;
    }

    public static Integer getFAIL() {
        return FAIL;
    }

    public static class ResultHelper{
        public static R instance(){
           return  new R();
        }

        public static R successInstance(){
            return  new R(SUCCESS);
        }

        public static R failInstance(){
            return  new R(FAIL);
        }
    }

}
