package com.ex.user.Service;

import com.ex.user.entity.OrgDepartment;
import com.github.pagehelper.PageInfo;

public interface DepService {
    PageInfo<OrgDepartment> getAll(int pageNum, int pageSize);
}
