package xyz.byfan.platform.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @ClassName: PageForm
 * @Description: 分页查询基础条件
 * @Author: byfan
 * @Date: 2022/8/25 16:10
 */
@ApiModel(value = "分页数据")
@Data
public class PageForm {
    @Min(value = 1, message = "页数必须大于1")
    @Digits(integer = 4, fraction = 0, message = "页数必须为整数，最大支持4位数")
    @ApiModelProperty(value = "当前页（默认第1页）")
    private Integer currentPage = 1;

    @Min(value = 1, message = "每页数量必须大于1")
    @Digits(integer = 3, fraction = 0, message = "每页数量必须为整数，最大支持3位数")
    @ApiModelProperty(value = "每页数量（默认每页20条）")
    private Integer pageSize = 20;

    public Integer getCurrentPage(){
        return currentPage <= 0 ? 1 : currentPage;
    }

    public Integer getPageSize() {
        return pageSize < 0 ? 20 : pageSize;
    }
}
