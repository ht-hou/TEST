package com.ttttt.demo.service.impl;

import com.ttttt.demo.common.HourGet;
import com.ttttt.demo.mapper.CityMapper;
import com.ttttt.demo.mapper.CityMoreWeatherMapper;
import com.ttttt.demo.mapper.CityNowWeatherMapper;
import com.ttttt.demo.pojo.City;
import com.ttttt.demo.pojo.CityMoreWeather;
import com.ttttt.demo.pojo.CityNowWeather;
import com.ttttt.demo.service.WeatherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

    private List<City> cities = null;
    @Resource
    CityMapper cityMapper;
    @Resource
    CityNowWeatherMapper cityNowWeatherMapper;
    @Resource
    CityMoreWeatherMapper cityMoreWeatherMapper;

    @Resource
    HourGet hourGet;

    @Override
    public void getWeather() {
        cities = cityMapper.selectAllCityCode();

        try {
            hourGet.doGetWeather(cities);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    @Transactional
    public void SetWeather(CityNowWeather cityNowWeather, List<CityMoreWeather> list) {

        cityNowWeatherMapper.insertWeather(cityNowWeather);

        for (CityMoreWeather cityMoreWeather :
                list) {

            cityMoreWeatherMapper.insertWeather(cityMoreWeather);

        }
        System.out.println("==========================================");
    }
    @Override
    @Transactional
    public void updataGetWeather() {
        if (null==cities){
        cities = cityMapper.selectAllCityCode();}
        try {
            hourGet.doGetWeather(cities);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    @Transactional
    public void updataSetWeather(List<CityMoreWeather> list,CityNowWeather cityNowWeather) {

        cityNowWeatherMapper.updataWeather(cityNowWeather);

        for (CityMoreWeather cityMoreWeather :
                list) {

            cityMoreWeatherMapper.updataWeather(cityMoreWeather);

        }
        System.out.println("----------------------");
    }
}
