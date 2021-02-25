package com.ex.yh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class YHController {

    @Autowired
    private RedisTemplate redisTemplate;


}
