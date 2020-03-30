package com.zht.springcloud.controller;

import com.zht.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @GetMapping("/payment/ok/get/{id}")
        public String getOK(@PathVariable("id") Integer id){
        return paymentService.OK(id);

    }

    @GetMapping("/payment/Fail/get/{id}")
    public String getFail(@PathVariable("id") Integer id){
        return paymentService.Fail(id);

    }
}
