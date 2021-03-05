package com.ex.coor.mapper;

import com.ex.coor.entity.ResourceCoor;
import com.ex.coor.entity.ResourceCoorExample;
import com.ex.coor.entity.pojo.ParamData;
import com.ex.coor.entity.pojo.ParamDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ResourceCoorMapper {
    long countByExample(ResourceCoorExample example);

    int deleteByExample(ResourceCoorExample example);

    int deleteByPrimaryKey(String coorid);

    int insert(ResourceCoor record);

    int insertSelective(ResourceCoor record);

    List<ResourceCoor> selectByExample(ResourceCoorExample example);

    ResourceCoor selectByPrimaryKey(String coorid);

    int updateByExampleSelective(@Param("record") ResourceCoor record, @Param("example") ResourceCoorExample example);

    int updateByExample(@Param("record") ResourceCoor record, @Param("example") ResourceCoorExample example);

    int updateByPrimaryKeySelective(ResourceCoor record);

    int updateByPrimaryKey(ResourceCoor record);

    List<String> gpsAndGd(ParamDto doubles);

    List<String> selectByChengYun(ParamData paramData);

    List<String> gpsAndGd2(ParamDto doubles);


//    List<String> selectByChengYun();
//
//    List<String> GPSAndGd();
}