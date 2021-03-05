package com.ex.coor.controller;

import com.ex.coor.entity.ResourceData;
import com.ex.coor.entity.pojo.ParamData;
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
    @RequestMapping("/chaxun")
    public ResultData chaxun(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize,
                             @ModelAttribute ParamData paramData) {

        PageInfo<ResourceData> closeData = coorService.getCloseData(pageNum, pageSize, paramData);
        if (closeData == null) {
            return new ResultData("5001", "请输入正确的参数");
        } else {
            return new ResultData("200", closeData);
        }


    }

}
