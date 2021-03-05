package com.ex.coor.service;

import com.ex.coor.entity.ResourceData;
import com.ex.coor.entity.pojo.ParamData;
import com.github.pagehelper.PageInfo;

public interface CoorService {
    PageInfo<ResourceData> getCloseData(int pageNum, int pageSize, ParamData paramData);
}
