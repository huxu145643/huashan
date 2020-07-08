package com.ruanyuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ruanyuan.dao")
@SpringBootApplication
public class Thymeleaf1Application {

    public static void main(String[] args) {
        SpringApplication.run(Thymeleaf1Application.class, args);
    }

}
