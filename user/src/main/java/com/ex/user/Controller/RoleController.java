package com.ex.user.Controller;

import com.ex.user.Service.RoleService;
import com.ex.user.entity.DTO.ResultData;
import com.ex.user.entity.Role;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/role")
@Api(tags = "角色管理")
public class RoleController {

    @Resource
    RoleService roleService;

    @GetMapping("/getAllByDepId")
    @ApiOperation(value = "获取角色列表", notes = "获取角色列表", httpMethod = "GET")
    public ResultData getAllByDepId(@RequestParam String createdepid) {

        List<Role> allByDepId = roleService.getAllByDepId(createdepid);
        return new ResultData("200", allByDepId);
    }

}
