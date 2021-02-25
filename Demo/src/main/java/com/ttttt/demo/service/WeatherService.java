package com.ttttt.demo.service;

import com.ttttt.demo.pojo.CityMoreWeather;
import com.ttttt.demo.pojo.CityNowWeather;

import java.util.List;

public interface WeatherService {

    public void getWeather();

    public void updataGetWeather();

    public void SetWeather(CityNowWeather cityNowWeather, List<CityMoreWeather> list);

    public void updataSetWeather(List<CityMoreWeather> list, CityNowWeather cityNowWeather);
}
