package com.ex.user.Controller;

import com.ex.user.Service.UserService;
import com.ex.user.entity.DTO.MohuDto;
import com.ex.user.entity.DTO.ResultData;
import com.ex.user.entity.DTO.UserDto;
import com.ex.user.entity.OrgUser;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@Api(tags = "角色管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/getAll")
    @ApiOperation(value = "获取用户列表",notes = "获取用户列表",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum",value = "页码",defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize",value = "分页数",defaultValue = "10")
    })
    public ResultData getAll(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize){
        PageInfo all = userService.getAll(pageNum, pageSize);
        return new ResultData("200",all);
    }

    @PostMapping("/getSome")
    public void getSome(@RequestBody MohuDto mohuDto){

        userService.getSome(mohuDto);

    }

    @PostMapping("/insertOne")
    @ApiOperation(value = "新增一个用户",notes = "新增用户")
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public ResultData insertOne(@RequestBody UserDto user) {
        userService.insertOne(user);
        ResultData resultData = new ResultData();
        resultData.setCode("200");
        resultData.setData("操作成功");
        return resultData;
    }

    @PutMapping("/updateOne")
    @ApiOperation(value = "修改一个用户",notes = "修改用户")
    public ResultData updateOne(@RequestBody UserDto user) {

        userService.updateOne(user);

        ResultData resultData = new ResultData();
        resultData.setCode("200");
        resultData.setData("操作成功");
        return resultData;
    }

    @DeleteMapping("/deleteOne")
    @ApiOperation(value = " 删除一个用户",notes = "删除用户")
    @ApiImplicitParam(name = "userid",value = "用户编号",required = true)
    public ResultData deleteOne(String userid) {

        userService.deleteOne(userid);

        ResultData resultData = new ResultData();
        resultData.setCode("200");
        resultData.setData("操作成功");
        return resultData;
    }
}
