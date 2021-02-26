package com.ex.user.mapper;

import com.ex.user.entity.DTO.MohuDto;
import com.ex.user.entity.OrgUser;
import com.ex.user.entity.OrgUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OrgUserMapper {
    long countByExample(OrgUserExample example);

    int deleteByExample(OrgUserExample example);

    int deleteByPrimaryKey(String uId);

    int insert(OrgUser record);

    int insertSelective(OrgUser record);

    List<OrgUser> selectByExample(OrgUserExample example);

    OrgUser selectByPrimaryKey(String uId);

    int updateByExampleSelective(@Param("record") OrgUser record, @Param("example") OrgUserExample example);

    int updateByExample(@Param("record") OrgUser record, @Param("example") OrgUserExample example);

    int updateByPrimaryKeySelective(OrgUser record);

    int updateByPrimaryKey(OrgUser record);

    int FakeDeleteByPrimaryKey(String userid);

    List<OrgUser> selectByRoleAndMohu(MohuDto mohuDto);

}