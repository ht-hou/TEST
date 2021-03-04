package com.ex.coor.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("资源坐标")
public class ResourceCoor implements Serializable {
    @ApiModelProperty(value = "坐标编码",hidden = true)
    private String coorid;
    @ApiModelProperty("资源主键")
    private String resourceid;
    @ApiModelProperty("坐标类别")
    private String ctId;
    @ApiModelProperty("X坐标（经度）")
    private String x;
    @ApiModelProperty("Y坐标（纬度）")
    private String y;

    public String getCoorid() {
        return coorid;
    }

    public void setCoorid(String coorid) {
        this.coorid = coorid == null ? null : coorid.trim();
    }

    public String getResourceid() {
        return resourceid;
    }

    public void setResourceid(String resourceid) {
        this.resourceid = resourceid == null ? null : resourceid.trim();
    }

    public String getCtId() {
        return ctId;
    }

    public void setCtId(String ctId) {
        this.ctId = ctId == null ? null : ctId.trim();
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}