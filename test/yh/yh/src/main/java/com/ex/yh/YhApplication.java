package com.ex.yh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.ex.yh.dao")
@SpringBootApplication
@EnableCaching
public class YhApplication {

    public static void main(String[] args) {
        SpringApplication.run(YhApplication.class, args);
    }

}
