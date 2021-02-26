package com.ex.user.mapper;

import com.ex.user.entity.OrgUserVsDep;
import com.ex.user.entity.OrgUserVsDepExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OrgUserVsDepMapper {
    long countByExample(OrgUserVsDepExample example);

    int deleteByExample(OrgUserVsDepExample example);

    int deleteByPrimaryKey(String udId);

    int insert(OrgUserVsDep record);

    int insertSelective(OrgUserVsDep record);

    List<OrgUserVsDep> selectByExample(OrgUserVsDepExample example);

    OrgUserVsDep selectByPrimaryKey(String udId);

    int updateByExampleSelective(@Param("record") OrgUserVsDep record, @Param("example") OrgUserVsDepExample example);

    int updateByExample(@Param("record") OrgUserVsDep record, @Param("example") OrgUserVsDepExample example);

    int updateByPrimaryKeySelective(OrgUserVsDep record);

    int updateByPrimaryKey(OrgUserVsDep record);
}