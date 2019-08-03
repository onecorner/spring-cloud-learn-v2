package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author htj
 * @since 2019/8/1 20:45
 */
@Configuration
//@PropertySource("classpath:common.properties")
@ImportResource("classpath:common.properties")
public class MyConfiguration {
}
