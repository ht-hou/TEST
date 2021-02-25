package com.ttttt.demo.mapper;

import com.ttttt.demo.pojo.CityMoreWeather;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface CityMoreWeatherMapper {

   // @Insert({"INSERT INTO CITY_More_WEATHER (ID,WEATHER_DATE,HIGH,LOW,YMD,WEEK,SUNRISE,SUNSET,AQI,FX,FL,TYPE,NOTICE)\n" +
    //        "  values (#{id},#{weatherDate},#{high},#{low},#{ymd},#{week},#{sunrise},#{sunset},#{aqi},#{fx},#{fl},#{type},#{notice})"})

    public void insertWeather(CityMoreWeather cityMoreWeather);
   // @Delete("DELETE FROM CITY_More_WEATHER")
    public void clean();

    void updataWeather(CityMoreWeather cityMoreWeather);
}
