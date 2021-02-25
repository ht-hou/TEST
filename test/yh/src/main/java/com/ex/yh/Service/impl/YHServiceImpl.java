package com.ex.yh.Service.impl;

@Service
public class YHServiceImpl implements YHService {
    @Autowired
    private RedisTemplate redisTemplate;


    public void  test(){
        redisTemplate.opsForValue().set("asd","sd");
    }
}
