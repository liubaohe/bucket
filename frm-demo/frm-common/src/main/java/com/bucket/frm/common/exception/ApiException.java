package com.bucket.frm.common.exception;


import com.bucket.frm.common.api.IErrorCode;

/**
 * @program: bucket
 * @description: 自定义异常
 * @author: liu.baohe
 * @create: 2020-05-09 16:22
 **/
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
