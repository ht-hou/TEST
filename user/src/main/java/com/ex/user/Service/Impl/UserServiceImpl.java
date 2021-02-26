package com.ex.user.Service.Impl;

import com.ex.user.Service.UserService;
import com.ex.user.common.UUIDUtils;
import com.ex.user.entity.*;
import com.ex.user.entity.DTO.MohuDto;
import com.ex.user.entity.DTO.UserDto;
import com.ex.user.mapper.OrgDepartmentMapper;
import com.ex.user.mapper.OrgUserMapper;
import com.ex.user.mapper.OrgUserVsDepMapper;
import com.ex.user.mapper.RoleMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    OrgUserMapper orgUserMapper;

    @Resource
    OrgUserVsDepMapper orgUserVsDepMapper;

    @Resource
    OrgDepartmentMapper orgDepartmentMapper;

    @Override
    public PageInfo getAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        OrgUserExample exp = new OrgUserExample();
        exp.createCriteria().andUIsstopEqualTo(0);
        List<OrgUser> orgUsers = orgUserMapper.selectByExample(exp);
        PageInfo pageInfo = new PageInfo(orgUsers);
        return pageInfo;
    }

    @Override
    public void insertOne(UserDto user) {
        OrgUser orgUser = user.getUser();
        orgUser.setuId(UUIDUtils.get32UUID());

        OrgDepartment department = user.getDepartment();

        Role role = user.getRole();

        OrgUserVsDep orgUserVsDep = user.getOrgUserVsDep();
        orgUserVsDep.setdId(department.getdId());
        orgUserVsDep.setuId(orgUser.getuId());
        orgUserVsDep.setUdId(UUIDUtils.get32UUID());
        orgUserVsDep.setRoleid(role.getRoleid());

        orgUserMapper.insertSelective(orgUser);

        orgUserVsDepMapper.insertSelective(orgUserVsDep);

    }

    @Override
    public void updateOne(UserDto user) {
        OrgUser orgUser = user.getUser();

        OrgDepartment department = user.getDepartment();

        Role role = user.getRole();
        OrgUserVsDep orgUserVsDep = user.getOrgUserVsDep();
        orgUserVsDep.setdId(department.getdId());
        orgUserVsDep.setRoleid(role.getRoleid());

        orgUserMapper.updateByPrimaryKeySelective(orgUser);

        orgUserVsDepMapper.updateByPrimaryKeySelective(orgUserVsDep);
    }

    @Override
    public void deleteOne(String userid) {


        orgUserMapper.FakeDeleteByPrimaryKey(userid);
    }

    @Override
    public void getSome(MohuDto mohuDto) {
        String roleid = mohuDto.getRoleid();
        String muhu = mohuDto.getMuhu();
        if (roleid == "1" && roleid == "2" && roleid == "3") {

        }else {
            mohuDto.setRoleid(null);
        }
            if (muhu != null && "".equals(muhu)) {
                boolean result = muhu.matches("[0-9]+");
                if (result == true) {
                    mohuDto.setUUsername(muhu);
                } else {
                    mohuDto.setUTrueName(muhu);
                }
                orgUserMapper.selectByRoleAndMohu(mohuDto);
            }

    }

}


