package com.ttttt.demo.mapper;

import com.ttttt.demo.pojo.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface CityMapper {

//    @Select("select * from CITY where city_code like '10%'")
//    @Results(id="cityResults", value={
//            @Result(property="id",   column="ID"),
//            @Result(property="pid",  column="PID"),
//            @Result(property="cityCode", column="CITY_CODE"),
//            @Result(property="cityName", column="CITY_NAME"),
//    })
    List<City> selectAllCityCode();
}
