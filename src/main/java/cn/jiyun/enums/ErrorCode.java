package cn.jiyun.enums;

public enum ErrorCode {

    PARAM_ERROR("1000","参数不正确"),
    System_ERROR("0000","意外参数异常");

    private String code;
    private String msg;


    ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
