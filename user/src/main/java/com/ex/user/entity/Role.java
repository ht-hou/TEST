package com.ex.user.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
@ApiModel("角色")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Role implements Serializable {
    @ApiModelProperty("角色编码")
    private String roleid;
    @ApiModelProperty("角色名称")
    private String rolename;
    @ApiModelProperty("排序")
    private Integer roleindex;
    @ApiModelProperty("创建时间")
    private Date createtime;
    @ApiModelProperty("创建部门")
    private String createdepid;
    @ApiModelProperty("创建人")
    private String createuserid;
    @ApiModelProperty("更新时间")
    private Date updatetime;
    @ApiModelProperty("更新部门")
    private String updatedepid;
    @ApiModelProperty("更新人")
    private String updateuserid;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Integer getRoleindex() {
        return roleindex;
    }

    public void setRoleindex(Integer roleindex) {
        this.roleindex = roleindex;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatedepid() {
        return createdepid;
    }

    public void setCreatedepid(String createdepid) {
        this.createdepid = createdepid == null ? null : createdepid.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdatedepid() {
        return updatedepid;
    }

    public void setUpdatedepid(String updatedepid) {
        this.updatedepid = updatedepid == null ? null : updatedepid.trim();
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }
}