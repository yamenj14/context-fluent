package com.heycar.de;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.heycar.de")
@EnableAutoConfiguration
@PropertySource("classpath:de.properties")
public class DeConfig {
    // No overriding of the service
    // the german context will inherit the parent service
}
