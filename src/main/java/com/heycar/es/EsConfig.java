package com.heycar.es;

import com.heycar.parent.IParentService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.heycar.es")
@PropertySource("classpath:es.properties")
@EnableAutoConfiguration
public class EsConfig {

    // 1. Override the parent service with spanish service
    @Bean
    public IParentService homeService() {
        return new SpanishService();
    }

    // 2. Define your own independent beans
    @Bean
    public GreetingService independentService() {
        return new GreetingService();
    }

}
