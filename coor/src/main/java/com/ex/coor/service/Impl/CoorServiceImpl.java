package com.ex.coor.service.Impl;

import com.ex.coor.common.CoorUtils;
import com.ex.coor.entity.pojo.ParamData;
import com.ex.coor.mapper.ResourceCoorMapper;
import com.ex.coor.mapper.ResourceDataMapper;
import com.ex.coor.service.CoorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

@Service
public class CoorServiceImpl implements CoorService {

    @Resource
    ResourceDataMapper resourceDataMapper;

    @Resource
    ResourceCoorMapper resourceCoorMapper;

    @Resource
    CoorUtils coorUtils;

    @Override
    public void getCloseData(ParamData paramData) {

        if(paramData.getCtId()==0){
            return;
        }else if(paramData.getCtId()==1){
            resourceDataMapper.selectByChengYun(paramData);
        }else {
            double[] doubles = coorUtils.GPSAndGd(paramData);

            ResourceDataMapper.gpsAndGd(paramData.getCtId(),doubles);
        }


    }
}
