package com.zj.bysj.controller;

import com.zj.bysj.pojo.Payment;
import com.zj.bysj.service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @RequestMapping("selPayment")
    public List<Payment> selPayment(int currPage, int pageSize){
        return paymentService.selPayment(currPage, pageSize);
    }

    @RequestMapping("selPaymentTotal")
    public int selTotal(){
        return paymentService.selPaymentCount();
    }
    @RequestMapping("insPayment")
    public int insPayment(String expenditurename,String expendituretype,int canmoney){
        Payment payment=new Payment();
        payment.setExpenditurename(expenditurename);
        payment.setExpendituretype(expendituretype);
        payment.setUsecase(0);
        String s = (new java.text.SimpleDateFormat("yyyy年MM月dd hh:mm:ss")).format(new Date());
        payment.setAddtime(s);
        payment.setCanmoney(canmoney);
        paymentService.addPayments(payment);
        return 200;
    }
    @RequestMapping("updPayments")
    public int updPayments(String expenditurename, String expendituretype, int canmoney, int id){
        paymentService.updPayments(expenditurename,expendituretype,canmoney,id);
        return 202;
    }
    @RequestMapping("delPayments")
    public int delPayments(int id){
        paymentService.delPayment(id);
        return 203;
    }
    @RequestMapping("selPaymentType")
    public List<Payment> selPaymentType(){

        return paymentService.selPaymentType();
    }

    @RequestMapping("selMoney")
    public List<Payment> selMoney(int id){
        return paymentService.selMoneyById(id);
    }
}
