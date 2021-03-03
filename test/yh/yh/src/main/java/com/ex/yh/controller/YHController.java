package com.ex.yh.controller;

import com.ex.yh.Service.YHService;
import com.ex.yh.pojo.TResourceData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class YHController {

    @Resource
    YHService yhService;

    @GetMapping("getAll")
    public Object getAll() {
        List<TResourceData> all = yhService.getAll();
        System.out.println(all.get(0).getCreateUserName());
        return all;
    }
    @GetMapping("getOne")
    public TResourceData getOne(String rdid){
        TResourceData tResourceData = yhService.getOne(rdid);

        return tResourceData;
    }
}
