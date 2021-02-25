package com.ex.yh.dao;

import com.ex.yh.pojo.TResourceData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YHMapper {
    List<TResourceData> getAll();
 }
