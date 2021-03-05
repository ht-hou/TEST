package com.ex.coor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ex.coor.mapper")
@SpringBootApplication
public class CoorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoorApplication.class, args);
    }

}
