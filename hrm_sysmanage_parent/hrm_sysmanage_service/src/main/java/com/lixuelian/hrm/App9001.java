package com.lixuelian.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.lixuelian.hrm.mapper")
public class App9001 {
    public static void main(String[] args) {
        SpringApplication.run(App9001.class, args);
    }
}
