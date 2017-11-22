package com.suncm.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.suncm.dao")
public class GeneralServiceApplication {

    public static void main(String[] args) {
        // 程序启动入口
        SpringApplication.run(GeneralServiceApplication.class,args);
    }
}
