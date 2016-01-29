package com.erac.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.SeleniumServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.PostConstruct;
import java.net.URL;

@Configuration
@ComponentScan(basePackages = { "com.erac" })
public class Config {

    @Value("${selenium.url}")
    private String url;

    @Autowired
    private SeleniumServer seleniumServer;

    @PostConstruct
    @Profile("desktop")
    public void startServer() throws Exception {
        seleniumServer.start();
    }

    @Bean
    public WebDriver getFireFoxDriver() throws Exception {
        return new RemoteWebDriver(new URL(url), DesiredCapabilities.firefox());
    }

}
