package com.fengwenyi.javalib.result;

/**
 * 返回码封装类
 * @author Wenyi Feng.
 */
public class Result {

    /** 返回码 */
    private int code;

    /** 返回码说明 */
    private String msg;

    /** 数据 */
    private Object data;

    /**
     * 实例化
     */
    public Result() {
    }

    /**
     * 创建对象
     * @param code 返回码
     * @param msg  信息
     * @param data 数据
     */
    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // [common]
    private void common(IReturnCode iReturnCode) {
        this.code = iReturnCode.getCode();
        this.msg = iReturnCode.getMsg();
    }

    /**
     * 设置返回码
     * @param iReturnCode 自定义枚举类，需要实现或继承IReturnCode
     */
    public void setResult(IReturnCode iReturnCode) {
        common(iReturnCode);
    }

    /**
     * 添加数据
     * @param iReturnCode 自定义枚举类，需要实现或继承IReturnCode
     * @param data 自定义数据对象
     */
    public void setResult(IReturnCode iReturnCode, Object data) {
        common(iReturnCode);

        this.data = data;
    }

    /**
     * 添加数据
     * @param iReturnCode 自定义枚举类，需要实现或继承IReturnCode
     * @param data 自定义数据对象
     */
    public void setData(IReturnCode iReturnCode, Object data) {
        common(iReturnCode);

        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
