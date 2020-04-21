package com.zj.bysj.service;


import com.zj.bysj.pojo.Payment;

import java.util.List;

public interface PaymentService {

    List<Payment> selPayment(int currPage, int pageSize);

    int selPaymentCount();

    int addPayments(Payment payment);

    int updPayments(String expenditurename,String expendituretype,int canmoney,int id);

    int delPayment(int id);

    List<Payment> selPaymentType();

    List<Payment> selMoneyById(int id);
}
