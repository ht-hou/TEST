package com.ex.user.mapper;

import com.ex.user.entity.OrgDepartment;
import com.ex.user.entity.OrgDepartmentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OrgDepartmentMapper {
    long countByExample(OrgDepartmentExample example);

    int deleteByExample(OrgDepartmentExample example);

    int deleteByPrimaryKey(String dId);

    int insert(OrgDepartment record);

    int insertSelective(OrgDepartment record);

    List<OrgDepartment> selectByExample(OrgDepartmentExample example);

    OrgDepartment selectByPrimaryKey(String dId);

    int updateByExampleSelective(@Param("record") OrgDepartment record, @Param("example") OrgDepartmentExample example);

    int updateByExample(@Param("record") OrgDepartment record, @Param("example") OrgDepartmentExample example);

    int updateByPrimaryKeySelective(OrgDepartment record);

    int updateByPrimaryKey(OrgDepartment record);
}