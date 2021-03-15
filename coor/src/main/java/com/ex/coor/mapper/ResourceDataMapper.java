package com.ex.coor.mapper;

import com.ex.coor.entity.ResourceData;
import com.ex.coor.entity.ResourceDataExample;
import com.ex.coor.entity.pojo.ParamData;
import com.ex.coor.entity.pojo.ParamDto;
import com.ex.coor.entity.pojo.ResourceDataAndCoor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ResourceDataMapper {

    long countByExample(ResourceDataExample example);

    int deleteByExample(ResourceDataExample example);

    int deleteByPrimaryKey(String resourceid);

    int insert(ResourceData record);

    int insertSelective(ResourceData record);

    List<ResourceData> selectByExample(ResourceDataExample example);

    ResourceData selectByPrimaryKey(String resourceid);

    int updateByExampleSelective(@Param("record") ResourceData record, @Param("example") ResourceDataExample example);

    int updateByExample(@Param("record") ResourceData record, @Param("example") ResourceDataExample example);

    int updateByPrimaryKeySelective(ResourceData record);

    int updateByPrimaryKey(ResourceData record);

    List<ResourceDataAndCoor> selectByChengYun(ParamData paramData);

     List<ResourceDataAndCoor> gpsAndGd( ParamDto doubles);

}