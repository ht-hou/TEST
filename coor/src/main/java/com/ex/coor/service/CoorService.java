package com.ex.coor.service;

import com.ex.coor.entity.ResourceCoor;
import com.ex.coor.entity.ResourceData;
import com.ex.coor.entity.pojo.ParamData;
import com.ex.coor.entity.pojo.ResourceDataAndCoor;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CoorService {
    PageInfo<ResourceDataAndCoor> getCloseData(int pageNum, int pageSize, ParamData paramData);

    PageInfo<ResourceData> getCloseData1(int pageNum, int pageSize, ParamData paramData);

    List<ResourceCoor> selectCoorByResourceDataId(String resourceDataId);
}
