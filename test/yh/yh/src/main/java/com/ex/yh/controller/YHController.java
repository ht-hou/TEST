package com.ex.yh.controller;

import com.ex.yh.Service.YHService;
import com.ex.yh.pojo.TResourceData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "查询优化")
@RestController
public class YHController {

    @Resource
    YHService yhService;

    @ApiOperation(value = "获取全部数据", notes = "获取全部数据", httpMethod = "GET")
    @GetMapping("getAll")
    public Object getAll(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        List<TResourceData> all = yhService.getAll();
        int startNum = (pageNum - 1) * pageSize;
        int endNum = (pageNum * pageSize) - 1;
        List<TResourceData> page = all.subList(startNum, endNum);
//        System.out.println(endNum + "-----------" + startNum);
        return page;
    }

    @ApiOperation(value = "根据rdid获取某个数据", notes = "根据rdid获取某个数据", httpMethod = "GET")
    @GetMapping("getOne")
    public TResourceData getOne(String rdid) {
        TResourceData tResourceData = yhService.getOne(rdid);
        return tResourceData;
    }
}
