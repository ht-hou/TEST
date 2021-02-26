package com.ex.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
@ApiModel("用户ORG_USER")
public class OrgUser implements Serializable {
    @ApiModelProperty("用户编码")
    private String uId;
    @ApiModelProperty("职级编码")
    private String ulId;
    @ApiModelProperty("账号；可为空")
    private String uUsername;
    @ApiModelProperty("密码，加密保存，不可逆；账号为空时密码为空")
    private String uPass;
    @ApiModelProperty("姓名")
    private String uTruename;
    @ApiModelProperty("性别。性别。0表示未定义，1表示男性，2表示女性")
    private Integer uSex;
    @ApiModelProperty("手机，非对称加密")
    private String uMobile;
    @ApiModelProperty("办公电话，非对称加密")
    private String uOfficetel;
    @ApiModelProperty("办公电话区号")
    private String uOfficeareanum;
    @ApiModelProperty("办公电话分机号")
    private String uOfficetelsub;
    @ApiModelProperty("家庭电话区号")
    private String uHomeareanum;
    @ApiModelProperty("家庭电话，非对称加密")
    private String uHometel;
    @ApiModelProperty("邮箱")
    private String uEmail;
    @ApiModelProperty("微信用户ID，加密保存")
    private String uWeixinid;
    @ApiModelProperty("用户头像，加密保存")
    private String uHeadicon;
    @ApiModelProperty("是否停用(0:未停用,1:停用)")
    private Integer uIsstop;
    @ApiModelProperty("是否是超级管理员(0不是 1是)")
    private Integer uIsadmin;
    @ApiModelProperty("电话保密(0不保密 1保密)")
    private Integer uSecret;
    @ApiModelProperty("用户排序")
    private Integer uIndex;
    @ApiModelProperty("是否系统外部人员，比如企业专家( 0不是 1是 )")
    private Integer uOutside;
    @ApiModelProperty("创建时间")
    private Date uCreatetime;
    @ApiModelProperty("创建部门")
    private String uCreatedepid;
    @ApiModelProperty("创建人")
    private String uCreateuserid;
    @ApiModelProperty("更新时间")
    private Date uUpdatetime;
    @ApiModelProperty("更新部门")
    private String uUpdatedepid;
    @ApiModelProperty("更新人")
    private String uUpdateuserid;
    @ApiModelProperty("停用时间")
    private Date uStoptime;
    @ApiModelProperty("停用部门")
    private String uStopdepid;
    @ApiModelProperty("停用人")
    private String uStopuserid;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getUlId() {
        return ulId;
    }

    public void setUlId(String ulId) {
        this.ulId = ulId == null ? null : ulId.trim();
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass == null ? null : uPass.trim();
    }

    public String getuTruename() {
        return uTruename;
    }

    public void setuTruename(String uTruename) {
        this.uTruename = uTruename == null ? null : uTruename.trim();
    }

    public Integer getuSex() {
        return uSex;
    }

    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }

    public String getuMobile() {
        return uMobile;
    }

    public void setuMobile(String uMobile) {
        this.uMobile = uMobile == null ? null : uMobile.trim();
    }

    public String getuOfficetel() {
        return uOfficetel;
    }

    public void setuOfficetel(String uOfficetel) {
        this.uOfficetel = uOfficetel == null ? null : uOfficetel.trim();
    }

    public String getuOfficeareanum() {
        return uOfficeareanum;
    }

    public void setuOfficeareanum(String uOfficeareanum) {
        this.uOfficeareanum = uOfficeareanum == null ? null : uOfficeareanum.trim();
    }

    public String getuOfficetelsub() {
        return uOfficetelsub;
    }

    public void setuOfficetelsub(String uOfficetelsub) {
        this.uOfficetelsub = uOfficetelsub == null ? null : uOfficetelsub.trim();
    }

    public String getuHomeareanum() {
        return uHomeareanum;
    }

    public void setuHomeareanum(String uHomeareanum) {
        this.uHomeareanum = uHomeareanum == null ? null : uHomeareanum.trim();
    }

    public String getuHometel() {
        return uHometel;
    }

    public void setuHometel(String uHometel) {
        this.uHometel = uHometel == null ? null : uHometel.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuWeixinid() {
        return uWeixinid;
    }

    public void setuWeixinid(String uWeixinid) {
        this.uWeixinid = uWeixinid == null ? null : uWeixinid.trim();
    }

    public String getuHeadicon() {
        return uHeadicon;
    }

    public void setuHeadicon(String uHeadicon) {
        this.uHeadicon = uHeadicon == null ? null : uHeadicon.trim();
    }

    public Integer getuIsstop() {
        return uIsstop;
    }

    public void setuIsstop(Integer uIsstop) {
        this.uIsstop = uIsstop;
    }

    public Integer getuIsadmin() {
        return uIsadmin;
    }

    public void setuIsadmin(Integer uIsadmin) {
        this.uIsadmin = uIsadmin;
    }

    public Integer getuSecret() {
        return uSecret;
    }

    public void setuSecret(Integer uSecret) {
        this.uSecret = uSecret;
    }

    public Integer getuIndex() {
        return uIndex;
    }

    public void setuIndex(Integer uIndex) {
        this.uIndex = uIndex;
    }

    public Integer getuOutside() {
        return uOutside;
    }

    public void setuOutside(Integer uOutside) {
        this.uOutside = uOutside;
    }

    public Date getuCreatetime() {
        return uCreatetime;
    }

    public void setuCreatetime(Date uCreatetime) {
        this.uCreatetime = uCreatetime;
    }

    public String getuCreatedepid() {
        return uCreatedepid;
    }

    public void setuCreatedepid(String uCreatedepid) {
        this.uCreatedepid = uCreatedepid == null ? null : uCreatedepid.trim();
    }

    public String getuCreateuserid() {
        return uCreateuserid;
    }

    public void setuCreateuserid(String uCreateuserid) {
        this.uCreateuserid = uCreateuserid == null ? null : uCreateuserid.trim();
    }

    public Date getuUpdatetime() {
        return uUpdatetime;
    }

    public void setuUpdatetime(Date uUpdatetime) {
        this.uUpdatetime = uUpdatetime;
    }

    public String getuUpdatedepid() {
        return uUpdatedepid;
    }

    public void setuUpdatedepid(String uUpdatedepid) {
        this.uUpdatedepid = uUpdatedepid == null ? null : uUpdatedepid.trim();
    }

    public String getuUpdateuserid() {
        return uUpdateuserid;
    }

    public void setuUpdateuserid(String uUpdateuserid) {
        this.uUpdateuserid = uUpdateuserid == null ? null : uUpdateuserid.trim();
    }

    public Date getuStoptime() {
        return uStoptime;
    }

    public void setuStoptime(Date uStoptime) {
        this.uStoptime = uStoptime;
    }

    public String getuStopdepid() {
        return uStopdepid;
    }

    public void setuStopdepid(String uStopdepid) {
        this.uStopdepid = uStopdepid == null ? null : uStopdepid.trim();
    }

    public String getuStopuserid() {
        return uStopuserid;
    }

    public void setuStopuserid(String uStopuserid) {
        this.uStopuserid = uStopuserid == null ? null : uStopuserid.trim();
    }
}