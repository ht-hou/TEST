package com.ex.user.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("用户关联部门")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrgUserVsDep implements Serializable {
    @ApiModelProperty("用户关联部门编码")
    private String udId;
    @ApiModelProperty("部门分组编码")
    private String dId;
    @ApiModelProperty("用户编码")
    private String uId;
    @ApiModelProperty("科室编码")
    private String keshiid;
    @ApiModelProperty("职务")
    private String udPosition;
    @ApiModelProperty("联络顺序 (0不是联系人 1 A角 2 B角)")
    private Integer depconntactindex;
    @ApiModelProperty("角色编码")
    private String roleid;

    public String getUdId() {
        return udId;
    }

    public void setUdId(String udId) {
        this.udId = udId == null ? null : udId.trim();
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getKeshiid() {
        return keshiid;
    }

    public void setKeshiid(String keshiid) {
        this.keshiid = keshiid == null ? null : keshiid.trim();
    }

    public String getUdPosition() {
        return udPosition;
    }

    public void setUdPosition(String udPosition) {
        this.udPosition = udPosition == null ? null : udPosition.trim();
    }

    public Integer getDepconntactindex() {
        return depconntactindex;
    }

    public void setDepconntactindex(Integer depconntactindex) {
        this.depconntactindex = depconntactindex;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }
}