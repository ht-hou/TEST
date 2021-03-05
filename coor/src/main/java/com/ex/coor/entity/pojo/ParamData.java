package com.ex.coor.entity.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel("查询范围内数据入参")
public class ParamData implements Serializable {
    @ApiModelProperty("经度")
    private double x;
    @ApiModelProperty("纬度")
    private double y;
    @ApiModelProperty("坐标类型 1.城运 ，2.高德，3.GPS")
    private int ctId;
    @ApiModelProperty("范围大小 单位：米")
    private int raidus;

}
