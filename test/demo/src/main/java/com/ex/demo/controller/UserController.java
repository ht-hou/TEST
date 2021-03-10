package com.ex.demo.controller;

import com.ex.demo.annotation.PassToken;
import com.ex.demo.annotation.UserLoginToken;
import com.ex.demo.common.JwtUtil;
import com.ex.demo.pojo.User;
import com.ex.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import net.minidev.json.writer.MapperRemapped;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Api(tags = "注册登录")
@RestController
public class UserController {

    @Resource
    UserService userService;

    //    登录
//    查询数据库已有用户名
//    验证密码是否一致‘
//    创建token
//    校验token
    @ApiOperation(value = "登录",notes = "登录")
    @PassToken
    @PostMapping("/login")
    public Map login(@ModelAttribute User user) {
        Map map = new HashMap<>();
        boolean userDb = userService.eq(user);
        if(!userDb){
            map.put("code", "403");
            map.put("message", "用户名或密码错误");
            return map;
        }
        User sign = userService.getUser(user);
        String token = sign.getUToken();
        if (token != null) {
            map.put("code", "200");
            map.put("message", "认证成功");
            map.put("token", token);
            return map;
        }
        map.put("code", "403");
        map.put("message", "认证失败");
        return map;
    }

    @ApiOperation(value = "注册",notes = "注册")
    @PassToken
    @PostMapping("/register")
    public void register(@ModelAttribute User user) {
        userService.inster(user);
    }

    @ApiOperation(value = "测试用",notes = "测试",httpMethod = "GET")
    @ApiImplicitParam(name = "token",value = "token标记",dataType = "String",paramType = "header")
    @UserLoginToken
    @RequestMapping("test")
    public Map test(){
        Map map = new HashMap<>();
        map.put("asdasd", "aasdasd");
        map.put("message", "asdasd");
        boolean asdasd = map.containsKey("asdasd");
        return map;
    }
}
