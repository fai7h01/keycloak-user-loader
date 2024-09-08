package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KeycloakUserLoaderApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(KeycloakUserLoaderApplication.class, args);
        context.close();
    }

}
