package com.ex.user.entity.DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("响应数据")
public class ResultData implements Serializable {
    @ApiModelProperty("响应代码")
    private String code;
    @ApiModelProperty("响应内容")
    private Object data;
}
