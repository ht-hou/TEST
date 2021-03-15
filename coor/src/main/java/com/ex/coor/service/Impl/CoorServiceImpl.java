package com.ex.coor.service.Impl;

import com.ex.coor.common.CoorUtils;
import com.ex.coor.entity.ResourceCoor;
import com.ex.coor.entity.ResourceCoorExample;
import com.ex.coor.entity.ResourceData;
import com.ex.coor.entity.ResourceDataExample;
import com.ex.coor.entity.pojo.ParamData;
import com.ex.coor.entity.pojo.ParamDto;
import com.ex.coor.entity.pojo.ResourceDataAndCoor;
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
    public PageInfo<ResourceDataAndCoor> getCloseData(int pageNum, int pageSize, ParamData paramData) {
        PageHelper.startPage(pageNum, pageSize);
        if (paramData.getCtId() == 0) {
            return null;
        } else if (paramData.getCtId() == 1) {
            long start = System.currentTimeMillis();
            List<ResourceDataAndCoor> resourceDataAndCoors = resourceDataMapper.selectByChengYun(paramData);

            PageInfo<ResourceDataAndCoor> resourceDataPageInfo = new PageInfo<>(resourceDataAndCoors);
            long end = System.currentTimeMillis();
            System.out.println(end - start);

            return resourceDataPageInfo;
        } else {

            ParamDto doubles = CoorUtils.GPSAndGd(paramData);
            // List<String> list = resourceCoorMapper.gpsAndGd(doubles);
            long start = System.currentTimeMillis();
            List<ResourceDataAndCoor> list1 = resourceDataMapper.gpsAndGd(doubles);

            long end = System.currentTimeMillis();
            System.out.println(end - start);
            return new PageInfo<>(list1);
        }
    }

    @Override
    public PageInfo<ResourceData> getCloseData1(int pageNum, int pageSize, ParamData paramData) {
        PageHelper.startPage(pageNum, pageSize);
        if (paramData.getCtId() == 0) {
            return null;
        } else if (paramData.getCtId() == 1) {
            List<String> list = resourceCoorMapper.selectByChengYun(paramData);
            ResourceDataExample exp = new ResourceDataExample();
            exp.createCriteria().andResourceidIn(list);
            List<ResourceData> resourceData = resourceDataMapper.selectByExample(exp);
            return new PageInfo<>(resourceData);
        } else {
            ParamDto doubles = CoorUtils.GPSAndGd(paramData);
            // List<String> list = resourceCoorMapper.gpsAndGd(doubles);
            List<String> list1 = resourceCoorMapper.gpsAndGd2(doubles);
            ResourceDataExample exp = new ResourceDataExample();
            exp.createCriteria().andResourceidIn(list1);
            List<ResourceData> resourceData = resourceDataMapper.selectByExample(exp);
            return new PageInfo<>(resourceData);
        }
    }

    @Override
    public List<ResourceCoor> selectCoorByResourceDataId(String resourceDataId) {

        ResourceCoorExample exp = new ResourceCoorExample();
        exp.createCriteria().andResourceidEqualTo(resourceDataId);

        return resourceCoorMapper.selectByExample(exp);
    }
}
