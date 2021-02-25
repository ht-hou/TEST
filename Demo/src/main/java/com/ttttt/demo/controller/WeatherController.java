package com.ttttt.demo.controller;

import com.ttttt.demo.service.WeatherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class WeatherController {
    @Resource
    WeatherService weatherService;

    @RequestMapping("/getWeather")
    public void getWeather() {

        weatherService.getWeather();

    }
}
