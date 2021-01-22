package com.example.springmongock;

import io.changock.runner.spring.v5.config.EnableChangock;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableChangock
@SpringBootApplication
public class DemoMongoDataMigrationApplication {

    public static void main(String[] args) {
        DemoMongoDataMigrationApplication.createSpringAppBuilder().run(args);
    }

    public static SpringApplicationBuilder createSpringAppBuilder() {
        return new SpringApplicationBuilder().sources(DemoMongoDataMigrationApplication.class);
    }

}
