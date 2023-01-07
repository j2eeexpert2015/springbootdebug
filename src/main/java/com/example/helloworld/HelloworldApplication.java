package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * SpringBootServletInitializer is an interface to run SpringApplication from a traditional WAR deployment.
 * It binds Servlet, Filter and ServletContextInitializer beans from the application context to the server.
 *
 * The HelloworldApplication sets up the Spring Boot application.
 * It extends from SpringBootServletInitializer so that it can be deployed as a WAR.
 *
 * The application can be run both by deploying the WAR on a Tomcat server and executing it as a self-executable web archive with embedded Tomcat.
 */
@SpringBootApplication
public class HelloworldApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(HelloworldApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
