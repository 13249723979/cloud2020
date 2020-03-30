package com.zht.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/zk/get")
    public String consumer(){
        String a=restTemplate.getForObject("http://cloud-provider-payment/payment/zk",String.class);
        return a;
    }
}
