package com.ex.user.entity.DTO;

import com.ex.user.entity.OrgDepartment;
import com.ex.user.entity.OrgUser;
import com.ex.user.entity.OrgUserVsDep;
import com.ex.user.entity.Role;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@ApiModel("编辑用户专用")
public class UserDto implements Serializable {
   // @ApiModelProperty("用户信息")
    private OrgUser user;
  //  @ApiModelProperty("用户所处部门信息")
    private OrgDepartment department;
 //   @ApiModelProperty("用户角色信息")
    private Role role;
 //   @ApiModelProperty("用户和部门关联信息")
    private OrgUserVsDep orgUserVsDep;
}
