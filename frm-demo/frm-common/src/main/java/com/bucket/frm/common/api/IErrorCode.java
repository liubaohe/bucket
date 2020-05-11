package com.bucket.frm.common.api;

/**
* @program: bucket
*
* @description: 封装错误码
*
* @author: liu.baohe
*
* @create: 2020-05-09 16:19
**/
public interface IErrorCode {
    long getCode();

    String getMessage();
}
