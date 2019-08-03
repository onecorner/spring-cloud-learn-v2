package com.jzone.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author htj
 * @since 2019/8/1 21:38
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LoadBalanceApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(LoadBalanceApplication.class).web(true).run(args);
    }
}
