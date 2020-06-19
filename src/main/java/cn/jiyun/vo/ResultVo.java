package cn.jiyun.vo;

import cn.jiyun.enums.ErrorCode;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) //非空参数不显示
public class ResultVo {
    /*
    *
    *后端是否处理成功
    *
    * */
    private boolean success;

    /*
    *错误码
    * */
    private String code;

    /*
    错误消息
    * */
    private String msg;
    /*
    * 给前端的返回值
    * */
    private Object data;

    public static ResultVo success(){
        ResultVo resultVo = new ResultVo();
        resultVo.setSuccess(true);

        return  resultVo;

    }

    public static ResultVo success(Object data){
        ResultVo resultVo = new ResultVo();
        resultVo.setSuccess(true);
        resultVo.setData(data);
        return  resultVo;

    }
    public static ResultVo fail(ErrorCode errorCode,Object data){
        ResultVo resultVo = new ResultVo();
        resultVo.setSuccess(false);
        resultVo.setData(data);
        resultVo.setCode(errorCode.getCode());
        resultVo.setMsg(errorCode.getMsg());
        return  resultVo;

    }
    public static ResultVo fail(ErrorCode errorCode){
        ResultVo resultVo = new ResultVo();
        resultVo.setSuccess(false);
        resultVo.setCode(errorCode.getCode());
        resultVo.setMsg(errorCode.getMsg());
        return  resultVo;

    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
