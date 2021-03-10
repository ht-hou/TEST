package com.ex.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class User {
    @ApiModelProperty
    private Integer userId;
    @ApiModelProperty
    private String userName;
    @ApiModelProperty
    private String userPwd;
    private String uToken;
    private Date uTokenCreatetime;
    private Date uTokenOvertime;
}
