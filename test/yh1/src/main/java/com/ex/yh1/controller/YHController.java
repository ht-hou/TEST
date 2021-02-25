package com.ex.yh1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

public class YHController {

    @Resource
    RedisTemplate redisTemplate;

    @Test
    public void  test(){
        redisTemplate.opsForValue().set("asd","sd");
    }
}
