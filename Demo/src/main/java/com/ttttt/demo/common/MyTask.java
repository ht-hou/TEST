package com.ttttt.demo.common;
import com.ttttt.demo.service.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MyTask {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private int i;

    @Resource
    WeatherService weatherService;

    @Scheduled(cron = "0 0 0/2 * * ? ")
    public void execute() {
        weatherService.updataGetWeather();
    }

}