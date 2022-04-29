package com.wjj.usercenter.common;

/**
 * 返回工具类
 *
 * @author Jie_744614347
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse success(T data){
        return new BaseResponse<>(0,data,"OK");
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static  BaseResponse error(ErrorCode errorCode){
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static  BaseResponse error(ErrorCode errorCode, String message, String description){
        return new BaseResponse<>(errorCode.getCode(),null,message,description);
    }

    /**
     * 失败
     *
     * @param code
     * @return
     */
    public static  BaseResponse error(int code, String message, String description){
        return new BaseResponse<>(code,null,message,description);
    }


    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static  BaseResponse error(ErrorCode errorCode, String description){
        return new BaseResponse<>(errorCode.getCode(),null,errorCode.getMessage(),description);
    }

}
