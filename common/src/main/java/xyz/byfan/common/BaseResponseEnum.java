package xyz.byfan.common;

/**
 * @ClassName: BaseResponseEnum
 * @Description: 通用返回状态码枚举
 * @Author: byfan
 * @Date: 2022/8/25 15:28
 */
public enum BaseResponseEnum {

    SUCCESS(200, "success"),
    UNKNOWN_ERROR(901, "未知错误"),
    PARAM_ERROR(902, "参数错误"),
    RESOURCE_NOT_EXIST(903, "资源不存在"),
    SAVE_OR_UPDATE_EXCEPTION(904, "保存或更新异常"),
    SELECT_EXCEPTION(905, "查询数据异常"),
    DELETE_EXCEPTION(906, "删除数据异常"),
    REPEATED_RESOURCE_NAME(907, "资源名称已存在"),
    FILE_FORMAT_ERROR(908, "文件格式不支持"),
    FILE_TOO_LARGE(909, "文件大小超出限制"),
    WRONG_FORMAT(910, "格式错误"),
    OUT_OF_LENGTH(911, "超出长度");


    public Integer code;
    public String msg;

    BaseResponseEnum(Integer code, String msg) {
        this.msg = msg;
        this.code = code;
    }
}
