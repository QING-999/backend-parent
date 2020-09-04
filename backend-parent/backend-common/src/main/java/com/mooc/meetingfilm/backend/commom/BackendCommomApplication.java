package com.mooc.meetingfilm.backend.commom;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendCommomApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        application.setBannerMode(Banner.Mode.OFF);

        application.run(BackendCommomApplication.class, args);
    }

}
