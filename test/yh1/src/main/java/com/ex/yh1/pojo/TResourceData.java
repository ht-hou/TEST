package com.ex.yh1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TResourceData implements Serializable {
    private Long rdId;
    private Long rcId;
    private String streetCode;
    private Integer createUserId;
    private String createUserName;
    private Date createTime;
    private Long createDep;
    private Integer updateUserId;
    private String updateUserName;
    private Date updateTime;
    private String x;
    private String y;
    private String rdAddress;
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
    private Integer fromDep;
    private String committeeCode;
    private Integer isImport;
    private Integer rdFail;
    private String keyword;
    private String tempId;
    private String houseId;
}
