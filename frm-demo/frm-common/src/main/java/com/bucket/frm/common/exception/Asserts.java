package com.bucket.frm.common.exception;


import com.bucket.frm.common.api.IErrorCode;

/**
 * @program: bucket
 * @description: 断言处理类，用于抛出各种API异常
 * @author: liu.baohe
 * @create: 2020-05-09 16:23
 **/
public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
