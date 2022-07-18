package com.reactive.app.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

/**
 * Entry point for the application.
 */
@SpringBootApplication
@EnableReactiveMongoRepositories("com.reactive.app.App.infrastructure.persistence.repository")
public class AppApplication {

    /**
     * Main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
