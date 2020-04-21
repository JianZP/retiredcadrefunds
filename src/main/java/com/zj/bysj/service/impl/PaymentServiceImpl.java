package com.zj.bysj.service.impl;

import com.zj.bysj.mapper.PaymentMapper;
import com.zj.bysj.mapper.UserMapper;
import com.zj.bysj.pojo.Payment;
import com.zj.bysj.pojo.User;
import com.zj.bysj.service.OptionUser;
import com.zj.bysj.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;
    @Override
    public List<Payment> selPayment(int currPage, int pageSize) {
        //查询全部数据
        List<Payment> paymentList = paymentMapper.selAll();
        //从第几条数据开始
        int firstIndex = (currPage - 1) * pageSize;
        //到第几条数据结束
        int lastIndex = currPage * pageSize;
        if(currPage * pageSize>=paymentList.size()){
            lastIndex=paymentList.size();
        }
        return paymentList.subList(firstIndex, lastIndex); //直接在list中截取
    }

    @Override
    public int selPaymentCount() {
        return paymentMapper.selPaymentCount();
    }

    @Override
    public int addPayments(Payment payment) {
        return paymentMapper.addPayment(payment);
    }

    @Override
    public int updPayments(String expenditurename, String expendituretype, int canmoney, int id) {
        return paymentMapper.updPayment(expenditurename, expendituretype, canmoney, id);
    }

    @Override
    public int delPayment(int id) {
        return paymentMapper.delAll(id);
    }

    @Override
    public List<Payment> selPaymentType() {
        return paymentMapper.selAll();
    }

    @Override
    public List<Payment> selMoneyById(int id) {
        return paymentMapper.selMoney(id);
    }
}
