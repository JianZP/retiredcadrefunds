package com.zj.bysj.controller;

import com.zj.bysj.pojo.Payment;
import com.zj.bysj.service.ExcelService;
import com.zj.bysj.service.PaymentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private ExcelService excelService;
    @Resource
    private PaymentService paymentService;


    @RequestMapping("test")
    public List<Payment> test(){
        return paymentService.selPayment(1,5);
    }
}
