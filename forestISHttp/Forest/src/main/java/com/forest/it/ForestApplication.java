package com.forest.it;

import com.dtflys.forest.springboot.annotation.ForestScan;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@ForestScan(basePackages = "com.forest.it.forestIn")
@Slf4j
@SpringBootApplication
public class ForestApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ForestApplication.class, args);
        String serverPort = context.getEnvironment().getProperty("server.port");
        log.info("app started at http://localhost:" + serverPort);
    }

}
