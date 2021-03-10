package com.ex.coor.entity.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@ApiModel("sql查询用参")
public class ParamDto implements Serializable {
//    @ApiModelProperty("坐标类型 2-高德，3-GPS")
    private int ctId;
//    @ApiModelProperty("最小纬度")
//    private double minLat;
//    @ApiModelProperty("最小经度")
//    private double minLng;
//    @ApiModelProperty("最大纬度")
//    private double maxLat;
//    @ApiModelProperty("最大经度")
//    private double maxLng;
    private double a;//长轴
    private double b;//短轴
    private double x;//圆心x
    private double y;//圆心y

}
