package com.ex.user.Controller;

import com.ex.user.Service.RoleService;
import com.ex.user.entity.DTO.ResultData;
import com.ex.user.entity.Role;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@Api(tags = "角色管理")
@RestController
@RequestMapping("/role")
public class RoleController {

    @Resource
    RoleService roleService;

    @GetMapping("/getAllByDepId")
    @ApiOperation(value = "获取角色列表",notes = "获取角色列表",httpMethod = "GET")
    public ResultData getAllByDepId(@RequestParam String createdepid){

        List<Role> allByDepId = roleService.getAllByDepId(createdepid);
        return new ResultData("200",allByDepId);
    }

}
