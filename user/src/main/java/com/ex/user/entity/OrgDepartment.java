package com.ex.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel("部门和分组")
public class OrgDepartment implements Serializable {
    @ApiModelProperty("部门或分组编码")
    private String dId;
    @ApiModelProperty("部门图标编码")
    private String diId;
    @ApiModelProperty("应急局标识，LEFTJOIN标识表，标识表有值，该条数据不能删除，只能编辑")
    private String memid;
    @ApiModelProperty("部门分组父节点，顶级为-1")
    private String dPdid;
    @ApiModelProperty("部门分组父节点集合，格式：/1/2/3/")
    private String dPdidlist;
    @ApiModelProperty("部门分组父节点集合（中文），格式：/长宁区/应急局/")
    private String dPdidlistcn;
    @ApiModelProperty("是否有子部门(0没有 1有)")
    private Integer dHaschild;
    @ApiModelProperty("部门分组名称")
    private String dName;
    @ApiModelProperty("部门简称")
    private String dEasyname;
    @ApiModelProperty("部门地址")
    private String dAddress;
    @ApiModelProperty("邮政编码")
    private String dPostcard;
    @ApiModelProperty("是否发送值班短信 (0否 1是)")
    private Integer dSenddutysms;
    @ApiModelProperty("排序")
    private Integer dIndex;
    @ApiModelProperty("是否是分组 (0否 1是)")
    private Integer dIsgroup;
    @ApiModelProperty("是否停用(0:未停用,1:停用)")
    private Integer dIsstop;
    @ApiModelProperty("部门单位级别（1市 2区 3街道 4居委 5其他）")
    private Integer dLevel;
    @ApiModelProperty("所属市代码")
    private String dCity;
    @ApiModelProperty("所属区代码")
    private String dDistrict;
    @ApiModelProperty("所属街道代码")
    private String dStreet;
    @ApiModelProperty("所属居委代码")
    private String dCommittee;
    @ApiModelProperty("部门ICON")
    private String dIcon;
    @ApiModelProperty("部门个性化LOGO，为空的话默认LOGO")
    private String dLogo;
    @ApiModelProperty("部门个性化系统标题")
    private String dPrititle;
    @ApiModelProperty("部门分组创建时间")
    private Date dCreatetime;
    @ApiModelProperty("部门分组创建部门")
    private String dCreatedepid;
    @ApiModelProperty("部门分组创建人")
    private String dCreateuserid;
    @ApiModelProperty("部门分组更新时间")
    private Date dUpdatetime;
    @ApiModelProperty("部门分组更新部门")
    private String dUpdatedepid;
    @ApiModelProperty("部门分组更新人")
    private String dUpdateuserid;
    @ApiModelProperty("部门分组停用时间")
    private Date dStoptime;
    @ApiModelProperty("部门分组停用部门")
    private String dStopdepid;
    @ApiModelProperty("部门分组停用人")
    private String dStopuserid;

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }

    public String getDiId() {
        return diId;
    }

    public void setDiId(String diId) {
        this.diId = diId == null ? null : diId.trim();
    }

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid == null ? null : memid.trim();
    }

    public String getdPdid() {
        return dPdid;
    }

    public void setdPdid(String dPdid) {
        this.dPdid = dPdid == null ? null : dPdid.trim();
    }

    public String getdPdidlist() {
        return dPdidlist;
    }

    public void setdPdidlist(String dPdidlist) {
        this.dPdidlist = dPdidlist == null ? null : dPdidlist.trim();
    }

    public String getdPdidlistcn() {
        return dPdidlistcn;
    }

    public void setdPdidlistcn(String dPdidlistcn) {
        this.dPdidlistcn = dPdidlistcn == null ? null : dPdidlistcn.trim();
    }

    public Integer getdHaschild() {
        return dHaschild;
    }

    public void setdHaschild(Integer dHaschild) {
        this.dHaschild = dHaschild;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdEasyname() {
        return dEasyname;
    }

    public void setdEasyname(String dEasyname) {
        this.dEasyname = dEasyname == null ? null : dEasyname.trim();
    }

    public String getdAddress() {
        return dAddress;
    }

    public void setdAddress(String dAddress) {
        this.dAddress = dAddress == null ? null : dAddress.trim();
    }

    public String getdPostcard() {
        return dPostcard;
    }

    public void setdPostcard(String dPostcard) {
        this.dPostcard = dPostcard == null ? null : dPostcard.trim();
    }

    public Integer getdSenddutysms() {
        return dSenddutysms;
    }

    public void setdSenddutysms(Integer dSenddutysms) {
        this.dSenddutysms = dSenddutysms;
    }

    public Integer getdIndex() {
        return dIndex;
    }

    public void setdIndex(Integer dIndex) {
        this.dIndex = dIndex;
    }

    public Integer getdIsgroup() {
        return dIsgroup;
    }

    public void setdIsgroup(Integer dIsgroup) {
        this.dIsgroup = dIsgroup;
    }

    public Integer getdIsstop() {
        return dIsstop;
    }

    public void setdIsstop(Integer dIsstop) {
        this.dIsstop = dIsstop;
    }

    public Integer getdLevel() {
        return dLevel;
    }

    public void setdLevel(Integer dLevel) {
        this.dLevel = dLevel;
    }

    public String getdCity() {
        return dCity;
    }

    public void setdCity(String dCity) {
        this.dCity = dCity == null ? null : dCity.trim();
    }

    public String getdDistrict() {
        return dDistrict;
    }

    public void setdDistrict(String dDistrict) {
        this.dDistrict = dDistrict == null ? null : dDistrict.trim();
    }

    public String getdStreet() {
        return dStreet;
    }

    public void setdStreet(String dStreet) {
        this.dStreet = dStreet == null ? null : dStreet.trim();
    }

    public String getdCommittee() {
        return dCommittee;
    }

    public void setdCommittee(String dCommittee) {
        this.dCommittee = dCommittee == null ? null : dCommittee.trim();
    }

    public String getdIcon() {
        return dIcon;
    }

    public void setdIcon(String dIcon) {
        this.dIcon = dIcon == null ? null : dIcon.trim();
    }

    public String getdLogo() {
        return dLogo;
    }

    public void setdLogo(String dLogo) {
        this.dLogo = dLogo == null ? null : dLogo.trim();
    }

    public String getdPrititle() {
        return dPrititle;
    }

    public void setdPrititle(String dPrititle) {
        this.dPrititle = dPrititle == null ? null : dPrititle.trim();
    }

    public Date getdCreatetime() {
        return dCreatetime;
    }

    public void setdCreatetime(Date dCreatetime) {
        this.dCreatetime = dCreatetime;
    }

    public String getdCreatedepid() {
        return dCreatedepid;
    }

    public void setdCreatedepid(String dCreatedepid) {
        this.dCreatedepid = dCreatedepid == null ? null : dCreatedepid.trim();
    }

    public String getdCreateuserid() {
        return dCreateuserid;
    }

    public void setdCreateuserid(String dCreateuserid) {
        this.dCreateuserid = dCreateuserid == null ? null : dCreateuserid.trim();
    }

    public Date getdUpdatetime() {
        return dUpdatetime;
    }

    public void setdUpdatetime(Date dUpdatetime) {
        this.dUpdatetime = dUpdatetime;
    }

    public String getdUpdatedepid() {
        return dUpdatedepid;
    }

    public void setdUpdatedepid(String dUpdatedepid) {
        this.dUpdatedepid = dUpdatedepid == null ? null : dUpdatedepid.trim();
    }

    public String getdUpdateuserid() {
        return dUpdateuserid;
    }

    public void setdUpdateuserid(String dUpdateuserid) {
        this.dUpdateuserid = dUpdateuserid == null ? null : dUpdateuserid.trim();
    }

    public Date getdStoptime() {
        return dStoptime;
    }

    public void setdStoptime(Date dStoptime) {
        this.dStoptime = dStoptime;
    }

    public String getdStopdepid() {
        return dStopdepid;
    }

    public void setdStopdepid(String dStopdepid) {
        this.dStopdepid = dStopdepid == null ? null : dStopdepid.trim();
    }

    public String getdStopuserid() {
        return dStopuserid;
    }

    public void setdStopuserid(String dStopuserid) {
        this.dStopuserid = dStopuserid == null ? null : dStopuserid.trim();
    }
}