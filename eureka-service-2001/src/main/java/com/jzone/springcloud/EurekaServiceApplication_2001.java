package com.jzone.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author htj
 * @since 2019/8/1 21:28
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServiceApplication_2001 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServiceApplication_2001.class).web(true).run(args);
    }
}
