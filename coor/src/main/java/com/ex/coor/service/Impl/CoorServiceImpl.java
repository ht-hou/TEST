package com.ex.coor.service.Impl;

import com.ex.coor.common.CoorUtils;
import com.ex.coor.entity.ResourceData;
import com.ex.coor.entity.ResourceDataExample;
import com.ex.coor.entity.pojo.ParamData;
import com.ex.coor.entity.pojo.ParamDto;
import com.ex.coor.mapper.ResourceCoorMapper;
import com.ex.coor.mapper.ResourceDataMapper;
import com.ex.coor.service.CoorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CoorServiceImpl implements CoorService {

    @Resource
    ResourceDataMapper resourceDataMapper;

    @Resource
    ResourceCoorMapper resourceCoorMapper;

    @Override
    public PageInfo<ResourceData> getCloseData(int pageNum, int pageSize, ParamData paramData) {
        PageHelper.startPage(pageNum, pageSize);
        if (paramData.getCtId() == 0) {
            return null;
        } else if (paramData.getCtId() == 1) {
            List<String> list = resourceCoorMapper.selectByChengYun(paramData);
            ResourceDataExample exp = new ResourceDataExample();
            exp.createCriteria().andResourceidIn(list);
            List<ResourceData> resourceData = resourceDataMapper.selectByExample(exp);
            PageInfo<ResourceData> resourceDataPageInfo = new PageInfo<>(resourceData);
            return resourceDataPageInfo;
        } else {
            ParamDto doubles = CoorUtils.GPSAndGd(paramData);
           // List<String> list = resourceCoorMapper.gpsAndGd(doubles);
            List<String> list1 = resourceCoorMapper.gpsAndGd2(doubles);
            ResourceDataExample exp = new ResourceDataExample();
            exp.createCriteria().andResourceidIn(list1);
            List<ResourceData> resourceData = resourceDataMapper.selectByExample(exp);
            PageInfo<ResourceData> resourceDataPageInfo = new PageInfo<>(resourceData);
            return resourceDataPageInfo;
        }


    }
}
