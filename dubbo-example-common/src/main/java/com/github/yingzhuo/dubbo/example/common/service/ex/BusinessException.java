package com.github.yingzhuo.dubbo.example.common.service.ex;

/**
 * 业务异常
 *
 * @author 应卓
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 6824283356898537577L;

//    private final int code;

//    public BusinessException(int code) {
//        if (code < 10000 || code > 99999) {
//            throw new IllegalArgumentException();
//        }
//        this.code = code;
//    }
//
//    public BusinessException(String message, int code) {
//        super(message);
//        this.code = code;
//    }

//    public int getCode() {
//        return code;
//    }
//
//    public String getCodeString() {
//        return Integer.toString(getCode());
//    }
//
//    public int getStatus() {
//        return Math.abs(code % 100000 / 100);
//    }

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }
}
