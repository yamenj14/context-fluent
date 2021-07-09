package com.heycar.fr;

import com.heycar.parent.IParentService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.heycar.fr")
@PropertySource("classpath:fr.properties")
@EnableAutoConfiguration
public class FrConfig {

    // override the parent service with french service
    @Bean
    public IParentService childService() {
        return new FrenchService();
    }

}
