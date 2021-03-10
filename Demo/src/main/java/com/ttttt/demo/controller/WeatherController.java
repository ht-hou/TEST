package com.ttttt.demo.controller;

import com.ttttt.demo.service.WeatherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "获取天气数据")
@RestController
public class WeatherController {
    @Resource
    WeatherService weatherService;

    @ApiOperation(value = "立即开始获取天气数据", notes = "立即开始获取天气数据", httpMethod = "GET")
    @RequestMapping("/getWeather")
    public void getWeather() {

        weatherService.getWeather();

    }
}
