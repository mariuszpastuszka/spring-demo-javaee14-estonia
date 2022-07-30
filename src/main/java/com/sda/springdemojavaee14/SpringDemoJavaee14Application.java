package com.sda.springdemojavaee14;

import com.sda.springdemojavaee14.controller.rest.DummyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDemoJavaee14Application {

    @Bean
    DummyController dummyController() {
        return new DummyController();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoJavaee14Application.class, args);
    }

}
