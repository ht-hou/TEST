package com.ttttt.demo.mapper;

import com.ttttt.demo.pojo.CityNowWeather;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface CityNowWeatherMapper {
  //  @Insert({"INSERT INTO CITY_NOW_WEATHER (ID,SHIDU,PM25,PM10,QUALITY,WENDU,GANMAO)\n" +
   //         "  values (#{id},#{shidu},#{pm25},#{pm10},#{quality},#{wendu},#{ganmao})"})
    public void insertWeather(CityNowWeather cityNowWeather);
  //  @Delete("DELETE FROM CITY_More_WEATHER")
    public void clean();

    void updataWeather(CityNowWeather cityNowWeather);
}
