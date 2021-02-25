package com.ex.yh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class YhApplication {

    public static void main(String[] args) {
        SpringApplication.run(YhApplication.class, args);
    }

}
