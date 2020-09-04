package com.mooc.meetingfilm.backend.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mooc.meetingfilm")
@MapperScan(basePackages = {"com.mooc.meetingfilm.backend.user.dao.mapper"})
public class BackendUserApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        application.setBannerMode(Banner.Mode.OFF);
        application.run(BackendUserApplication.class, args);
    }

}
