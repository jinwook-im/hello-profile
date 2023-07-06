package com.gmarket.pipelinebluegreen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PipelineBluegreenApplication {

    public static void main(String[] args) {
        String profile = System.getProperty("spring.profiles.active");
        if(profile == null) {
            System.setProperty("spring.profiles.active", "blue");
        }
        SpringApplication.run(PipelineBluegreenApplication.class, args);
    }

}
