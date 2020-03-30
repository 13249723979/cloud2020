package com.zht.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class paymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(paymentMain8004.class,args);
    }
}
