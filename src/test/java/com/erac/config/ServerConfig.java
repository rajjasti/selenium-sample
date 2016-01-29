package com.erac.config;

import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {

    @Bean
    public SeleniumServer seleniumServer() throws Exception {
        RemoteControlConfiguration rcc = new RemoteControlConfiguration();
        rcc.setPort(RemoteControlConfiguration.DEFAULT_PORT);
        return new SeleniumServer(rcc);

    }

}
