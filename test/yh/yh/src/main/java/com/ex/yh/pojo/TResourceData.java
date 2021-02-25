package com.ex.yh.pojo;

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
    private Long createDep;
    private Integer updateUserId;
    private String rdAddress;
    private Integer fromDep;
    private String committeeCode;
    private String keyword;
    private String tempId;
    private String houseId;
}
