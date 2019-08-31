package com.lixuelian.hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //使用zuul代理
public class App9527 {
    public static void main(String[] args) {
        SpringApplication.run(App9527.class);
    }
}

