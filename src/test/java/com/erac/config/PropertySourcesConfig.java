package com.erac.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;


@Configuration
public class PropertySourcesConfig {

    @Configuration
    @Profile("desktop")
    @PropertySource("classpath:application-desktop.properties")
    public static class DesktopConfig {
    }
    @Configuration
    @Profile("dev")
    @PropertySource("classpath:application-dev.properties")
    public static class DevConfig {
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}