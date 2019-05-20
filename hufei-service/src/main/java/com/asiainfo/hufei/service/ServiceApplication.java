package com.asiainfo.hufei.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.asiainfo.hufei"})
@MapperScan("com.asiainfo.hufei.dao.mapper")
//@ComponentScan("com.asiainfo.hufei.service")
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
