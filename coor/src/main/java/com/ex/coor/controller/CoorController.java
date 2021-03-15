package com.ex.coor.controller;

import com.ex.coor.entity.ResourceCoor;
import com.ex.coor.entity.ResourceData;
import com.ex.coor.entity.pojo.ParamData;
import com.ex.coor.entity.pojo.ResourceDataAndCoor;
import com.ex.coor.entity.pojo.ResultData;
import com.ex.coor.service.CoorService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/coor")
@Api(tags = "获取指定点范围内的数据")
public class CoorController {

    @Resource
    CoorService coorService;

    @ApiOperation(value = "查询范围内数据", notes = "查询范围内数据", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页数", defaultValue = "10"),
    })
    @RequestMapping("/selectDataAndCoor")
    public ResultData selectDataAndCoor(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize,
                             @ModelAttribute ParamData paramData) {
        long start = System.currentTimeMillis();
        PageInfo<ResourceDataAndCoor> closeData = coorService.getCloseData(pageNum, pageSize, paramData);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        if (closeData == null) {
            return new ResultData("5001", "请输入正确的参数");
        } else {
            return new ResultData("200", closeData);
        }
    }
    @ApiOperation(value = "查询范围内数据1", notes = "查询范围内数据1", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页数", defaultValue = "10"),
    })
    @RequestMapping("/selectData")
    public ResultData selectData(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize,
                             @ModelAttribute ParamData paramData) {
        long start = System.currentTimeMillis();
        PageInfo<ResourceData> closeData = coorService.getCloseData1(pageNum, pageSize, paramData);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        if (closeData == null) {
            return new ResultData("5001", "请输入正确的参数");
        } else {
            return new ResultData("200", closeData);
        }
    }
    @ApiOperation(value = "查询范围内数据坐标1", notes = "查询范围内数据坐标1", httpMethod = "POST")
    @RequestMapping("/selectCoor")
    public ResultData selectCoor( @RequestParam(required = true) String resourceDataId){
        List<ResourceCoor> resourceCoors = coorService.selectCoorByResourceDataId(resourceDataId);
        if (resourceCoors == null) {
            return new ResultData("5001", "请输入正确的参数");
        } else {
            return new ResultData("200", resourceCoors);
        }
    }

}
