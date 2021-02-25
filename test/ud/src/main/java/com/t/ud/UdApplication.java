package com.t.ud;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.t.ud.mapper")
@SpringBootApplication
public class UdApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdApplication.class, args);
    }

}
