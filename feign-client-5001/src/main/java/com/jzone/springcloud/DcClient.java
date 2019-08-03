package com.jzone.springcloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-service")
public interface DcClient {

    /*服务方的路径*/
    @GetMapping("/dc")
    String consumer();

}