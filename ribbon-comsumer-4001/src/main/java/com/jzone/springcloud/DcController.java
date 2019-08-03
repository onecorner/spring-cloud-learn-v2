package com.jzone.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

    @Autowired RestTemplate restTemplate;

    /**
     * 大小写敏感
     * */
    @GetMapping("/consumer")
    public String dc() {
        return restTemplate.getForObject("http://eureka-service/dc", String.class);
    }

}