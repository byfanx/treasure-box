package xyz.byfan.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @ClassName: BaseResponse
 * @Description: 统一返回对象
 * @Author: byfan
 * @Date: 2022/8/25 15:22
 */
@ApiModel("基础返回对象")
@Data
@ToString
public class BaseResponse<T> {
    @ApiModelProperty(name = "code", notes = "状态码")
    int code;

    @ApiModelProperty(name = "message", notes = "消息")
    String msg;

    @ApiModelProperty(name = "data", notes = "数据对象")
    T data;

    public BaseResponse() {
        this.code = BaseResponseEnum.SUCCESS.code;
        this.msg = BaseResponseEnum.SUCCESS.msg;
        this.data = null;
    }

    public BaseResponse(BaseResponseEnum response) {
        this.code = response.code;
        this.msg = response.msg;
        this.data = null;
    }

    public BaseResponse(BaseResponseEnum response, T data) {
        this.code = response.code;
        this.msg = response.msg;
        this.data = data;
    }

    public static <T> BaseResponse<T> success(T data) {
        final BaseResponse<T> response = new BaseResponse<>();
        response.setData(data);
        return response;
    }

    public static <Void> BaseResponse<Void> error() {
        final BaseResponse<Void> response = new BaseResponse<>();
        response.setCode(BaseResponseEnum.UNKNOWN_ERROR.code);
        response.setMsg(BaseResponseEnum.UNKNOWN_ERROR.msg);
        return response;
    }
}
