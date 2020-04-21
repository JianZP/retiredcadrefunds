package com.zj.bysj.mapper;

import com.zj.bysj.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentMapper {
    List<Payment> selAll();

    int selPaymentCount();

    int addPayment(Payment payment);

    int updPayment(String expenditurename,String expendituretype,int canmoney,int id);

    int delAll(int id);

    List<Payment> selMoney(int id);
}
