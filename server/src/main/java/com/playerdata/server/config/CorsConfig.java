package com.playerdata.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// To enable the request from backend to frontend through API calls
@Configuration
public class CorsConfig {
    @Value("${cors.allowedOrigins}")
    private String allowedOrigins;
    private static final Logger logger = LoggerFactory.getLogger(CorsConfig.class);

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        logger.info("Configuring CORS with allowed origins: {}", allowedOrigins);

        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/players") // Apply CORS to the endpoint
                        .allowedOrigins(allowedOrigins) // Allow localhost:3000 for dev and real domain for prod
                        .allowedMethods("GET") // Allowed methods
                        .allowCredentials(false); // Credentials not needed such as cookies and http authorization
                        //.allowedHeaders("Authorization", "Content-Type") not needed for this application since no headers are being sent
            }
        };
    }
}
