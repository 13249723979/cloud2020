package com.zht.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    public String OK(Integer id){
        return "线程池:"+Thread.currentThread().getName()+"OK^_^"+id;


    }

    @HystrixCommand(fallbackMethod = "Handler",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value="true"),
    })
    public String Fail(Integer id){
        int timeNumber=5;
        int age=10/0;
        try{

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "线程池:"+Thread.currentThread().getName()+"Fail::>_<::"+id;


    }
    public String Handler(Integer id){
        return "请稍后重试"+id;
    }
}
