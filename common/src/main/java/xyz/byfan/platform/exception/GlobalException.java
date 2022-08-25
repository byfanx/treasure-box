package xyz.byfan.platform.exception;

import xyz.byfan.platform.common.BaseResponseEnum;

/**
 * @ClassName: GlobalException
 * @Description: 通用全局异常类
 * @Author: byfan
 * @Date: 2022/8/25 15:55
 */
public class GlobalException extends Exception {
    private Integer errorCode;

    public GlobalException(BaseResponseEnum baseResponseEnum) {
        super(baseResponseEnum.msg);
        this.errorCode = baseResponseEnum.code;
    }

    public GlobalException(String message) {
        super(message);
        this.errorCode = BaseResponseEnum.UNKNOWN_ERROR.code;
    }

    public GlobalException(BaseResponseEnum baseResponseEnum, String message) {
        super(message);
        this.errorCode = baseResponseEnum.code;
    }

    public GlobalException(Integer errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
    
}
