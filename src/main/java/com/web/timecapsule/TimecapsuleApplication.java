package com.web.timecapsule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class TimecapsuleApplication {
    public static void main(String[] args) {
        SpringApplication.run(TimecapsuleApplication.class, args);
    }

}
