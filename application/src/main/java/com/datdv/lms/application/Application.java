package com.datdv.lms.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.datdv.lms"})
@EnableJpaRepositories(basePackages = {"com.datdv.lms.repository"})
@EntityScan("com.datdv.lms.domains")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}