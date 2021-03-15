package com.ex.coor.entity.pojo;

import com.ex.coor.entity.ResourceCoor;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("资源返回数据")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ResourceDataAndCoor implements Serializable {
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


    @ApiModelProperty("当前事件列表当前坐标类型的坐标")
    private ResourceCoor resourceCoor;
}
