package com.ex.coor.controller;

import com.ex.coor.entity.pojo.ParamData;
import com.ex.coor.service.CoorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/coor")
public class CoorController {

    @Resource
    CoorService coorService;


    @RequestMapping("/chaxun")
    public void chaxun(ParamData paramData) {

        coorService.getCloseData(paramData);

    }

}
