package com.example.liveplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.liveplatform.mapper")
public class LiveplatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiveplatformApplication.class, args);
    }

}
