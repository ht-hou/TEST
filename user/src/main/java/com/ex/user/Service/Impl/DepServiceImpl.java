package com.ex.user.Service.Impl;

import com.ex.user.Service.DepService;
import com.ex.user.entity.OrgDepartment;
import com.ex.user.mapper.OrgDepartmentMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepServiceImpl implements DepService {

    @Resource
    OrgDepartmentMapper orgDepartmentMapper;

    @Override
    public PageInfo<OrgDepartment> getAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OrgDepartment> orgDepartments = orgDepartmentMapper.selectByExample(null);
        return new PageInfo<>(orgDepartments);
    }
}
