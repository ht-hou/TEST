package com.ex.user.Controller;

import com.ex.user.Service.DepService;
import com.ex.user.entity.DTO.ResultData;
import com.ex.user.entity.OrgDepartment;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@Api("部门管理")
@RestController
@RequestMapping("/dep")
public class DepController {

    @Resource
    DepService depService;

    @GetMapping("/getAll")
    @ApiOperation(value = "获取部门列表",notes = "获取部门列表",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum",value = "页码",defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize",value = "分页数",defaultValue = "10")
    })
    public ResultData getAll(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize){

        PageInfo<OrgDepartment> all = depService.getAll(pageNum, pageSize);
        return new ResultData("200",all);
    }
}
