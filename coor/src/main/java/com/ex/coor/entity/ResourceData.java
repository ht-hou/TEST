package com.ex.coor.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel("资源数据")
public class ResourceData implements Serializable {
    @ApiModelProperty(value = "资源主键",hidden = true)
    private String resourceid;
    @ApiModelProperty("资源类别编码")
    private String rescateid;
    @ApiModelProperty("资源名称")
    private String resourcename;
    @ApiModelProperty("地址")
    private String resourceaddress;
    @ApiModelProperty("数量，物资装备专用字段")
    private Integer count;
    @ApiModelProperty("所属单位名称，专家专用")
    private String fromunit;
    @ApiModelProperty("研究领域，专家专用")
    private String goodat;
    @ApiModelProperty("人数，队伍专用")
    private Integer peoplenum;
    @ApiModelProperty("容纳人数，避难场所专用")
    private Integer holdnum;
    @ApiModelProperty("联系人，除了专家都有这个字段")
    private String contacts;
    @ApiModelProperty("联系电话")
    private String telphone;
    @ApiModelProperty("联系电话区号")
    private String areanum;
    @ApiModelProperty("联系电话分机号，可以为空")
    private String subnum;
    @ApiModelProperty("联系人手机号")
    private String mobilephone;
    @ApiModelProperty("所属市")
    private String citycode;
    @ApiModelProperty("所属区")
    private String districtcode;
    @ApiModelProperty("所属街道")
    private String streetcode;
    @ApiModelProperty("所属居委")
    private String committeecode;
    @ApiModelProperty("创建用户主键")
    private String createuserid;
    @ApiModelProperty(value = "创建时间",hidden = true)
    private Date createtime;
    @ApiModelProperty("创建部门")
    private String createdep;
    @ApiModelProperty("更新用户主键")
    private String updateuserid;
    @ApiModelProperty(value = "更新时间",hidden = true)
    private Date updatetime;
    @ApiModelProperty("更新部门")
    private String updatedep;
    @ApiModelProperty("是导入的数据 （1是 0不是）")
    private Integer isimport;
    @ApiModelProperty("地址解析是否失败（0未失败 1失败）")
    private Integer addressfail;

    private String f1;

    private String f2;

    private String f3;

    private String f4;

    private String f5;

    private String f6;

    private String f7;

    private String f8;

    private String f9;

    private String f10;

    private String f11;

    private String f12;

    private String f13;

    private String f14;

    private String f15;

    private String f16;

    private String f17;

    private String f18;

    private String f19;

    private String f20;

    public String getResourceid() {
        return resourceid;
    }

    public void setResourceid(String resourceid) {
        this.resourceid = resourceid == null ? null : resourceid.trim();
    }

    public String getRescateid() {
        return rescateid;
    }

    public void setRescateid(String rescateid) {
        this.rescateid = rescateid == null ? null : rescateid.trim();
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename == null ? null : resourcename.trim();
    }

    public String getResourceaddress() {
        return resourceaddress;
    }

    public void setResourceaddress(String resourceaddress) {
        this.resourceaddress = resourceaddress == null ? null : resourceaddress.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getFromunit() {
        return fromunit;
    }

    public void setFromunit(String fromunit) {
        this.fromunit = fromunit == null ? null : fromunit.trim();
    }

    public String getGoodat() {
        return goodat;
    }

    public void setGoodat(String goodat) {
        this.goodat = goodat == null ? null : goodat.trim();
    }

    public Integer getPeoplenum() {
        return peoplenum;
    }

    public void setPeoplenum(Integer peoplenum) {
        this.peoplenum = peoplenum;
    }

    public Integer getHoldnum() {
        return holdnum;
    }

    public void setHoldnum(Integer holdnum) {
        this.holdnum = holdnum;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getAreanum() {
        return areanum;
    }

    public void setAreanum(String areanum) {
        this.areanum = areanum == null ? null : areanum.trim();
    }

    public String getSubnum() {
        return subnum;
    }

    public void setSubnum(String subnum) {
        this.subnum = subnum == null ? null : subnum.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getDistrictcode() {
        return districtcode;
    }

    public void setDistrictcode(String districtcode) {
        this.districtcode = districtcode == null ? null : districtcode.trim();
    }

    public String getStreetcode() {
        return streetcode;
    }

    public void setStreetcode(String streetcode) {
        this.streetcode = streetcode == null ? null : streetcode.trim();
    }

    public String getCommitteecode() {
        return committeecode;
    }

    public void setCommitteecode(String committeecode) {
        this.committeecode = committeecode == null ? null : committeecode.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatedep() {
        return createdep;
    }

    public void setCreatedep(String createdep) {
        this.createdep = createdep == null ? null : createdep.trim();
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdatedep() {
        return updatedep;
    }

    public void setUpdatedep(String updatedep) {
        this.updatedep = updatedep == null ? null : updatedep.trim();
    }

    public Integer getIsimport() {
        return isimport;
    }

    public void setIsimport(Integer isimport) {
        this.isimport = isimport;
    }

    public Integer getAddressfail() {
        return addressfail;
    }

    public void setAddressfail(Integer addressfail) {
        this.addressfail = addressfail;
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1 == null ? null : f1.trim();
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2 == null ? null : f2.trim();
    }

    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        this.f3 = f3 == null ? null : f3.trim();
    }

    public String getF4() {
        return f4;
    }

    public void setF4(String f4) {
        this.f4 = f4 == null ? null : f4.trim();
    }

    public String getF5() {
        return f5;
    }

    public void setF5(String f5) {
        this.f5 = f5 == null ? null : f5.trim();
    }

    public String getF6() {
        return f6;
    }

    public void setF6(String f6) {
        this.f6 = f6 == null ? null : f6.trim();
    }

    public String getF7() {
        return f7;
    }

    public void setF7(String f7) {
        this.f7 = f7 == null ? null : f7.trim();
    }

    public String getF8() {
        return f8;
    }

    public void setF8(String f8) {
        this.f8 = f8 == null ? null : f8.trim();
    }

    public String getF9() {
        return f9;
    }

    public void setF9(String f9) {
        this.f9 = f9 == null ? null : f9.trim();
    }

    public String getF10() {
        return f10;
    }

    public void setF10(String f10) {
        this.f10 = f10 == null ? null : f10.trim();
    }

    public String getF11() {
        return f11;
    }

    public void setF11(String f11) {
        this.f11 = f11 == null ? null : f11.trim();
    }

    public String getF12() {
        return f12;
    }

    public void setF12(String f12) {
        this.f12 = f12 == null ? null : f12.trim();
    }

    public String getF13() {
        return f13;
    }

    public void setF13(String f13) {
        this.f13 = f13 == null ? null : f13.trim();
    }

    public String getF14() {
        return f14;
    }

    public void setF14(String f14) {
        this.f14 = f14 == null ? null : f14.trim();
    }

    public String getF15() {
        return f15;
    }

    public void setF15(String f15) {
        this.f15 = f15 == null ? null : f15.trim();
    }

    public String getF16() {
        return f16;
    }

    public void setF16(String f16) {
        this.f16 = f16 == null ? null : f16.trim();
    }

    public String getF17() {
        return f17;
    }

    public void setF17(String f17) {
        this.f17 = f17 == null ? null : f17.trim();
    }

    public String getF18() {
        return f18;
    }

    public void setF18(String f18) {
        this.f18 = f18 == null ? null : f18.trim();
    }

    public String getF19() {
        return f19;
    }

    public void setF19(String f19) {
        this.f19 = f19 == null ? null : f19.trim();
    }

    public String getF20() {
        return f20;
    }

    public void setF20(String f20) {
        this.f20 = f20 == null ? null : f20.trim();
    }
}