package com.ex.user.Service.Impl;

import com.ex.user.Service.RoleService;
import com.ex.user.entity.Role;
import com.ex.user.entity.RoleExample;
import com.ex.user.mapper.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    RoleMapper roleMapper;

    @Override
    public List<Role> getAllByDepId(String createdepid) {
        RoleExample exp = new RoleExample();
        exp.createCriteria().andCreatedepidEqualTo(createdepid);
        return roleMapper.selectByExample(exp);

    }
}
