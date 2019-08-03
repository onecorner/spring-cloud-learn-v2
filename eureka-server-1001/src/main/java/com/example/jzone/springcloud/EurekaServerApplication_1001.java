package com.example.jzone.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author htj
 * @since 2019/8/1 20:16
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication_1001 {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication_1001.class)
            .web(true).run(args);
    }
}
