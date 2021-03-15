package com.ex.yh.Service.impl;

import com.ex.yh.Service.YHService;
import com.ex.yh.dao.YHMapper;
import com.ex.yh.pojo.TResourceData;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class YHServiceImpl implements YHService {
    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private YHMapper yhMapper;

    private String redisKey = "AllResource";

    @Override
    public List<TResourceData> setAll() {
        List<TResourceData> resourceData = yhMapper.getAll();
        for (TResourceData tResourceData :
                resourceData) {
            redisTemplate.opsForValue().set(tResourceData.getRdId(), tResourceData);
        }
        redisTemplate.opsForValue().set(redisKey, resourceData);
        return resourceData;
    }

    @Override
    public List<TResourceData> getAll() {
        if (redisTemplate.hasKey(redisKey)) {
            return (List<TResourceData>) redisTemplate.opsForValue().get(redisKey);
        } else {
            return setAll();
        }

    }

    @Override
    public TResourceData getOne(String rdid) {

        if (redisTemplate.hasKey(rdid)){
            return (TResourceData) redisTemplate.opsForValue().get(rdid);
        } else{
            return setOne(rdid);
        }

    }

    public TResourceData setOne(String rdid) {
        TResourceData tResourceData = yhMapper.getOne(rdid);
        redisTemplate.opsForValue().set(tResourceData.getRdId(), tResourceData);


        return tResourceData;
    }

}


