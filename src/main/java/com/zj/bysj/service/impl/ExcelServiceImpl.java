package com.zj.bysj.service.impl;

import com.zj.bysj.mapper.ApplicationMapper;
import com.zj.bysj.mapper.PaymentMapper;
import com.zj.bysj.pojo.Application;
import com.zj.bysj.pojo.Payment;
import com.zj.bysj.service.ExcelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ExcelServiceImpl implements ExcelService {
    @Resource
    private ApplicationMapper applicationMapper;
    @Resource
    private PaymentMapper paymentMapper;
    @Override
    public List<Application> selByWait() {
        return applicationMapper.selWait("是");
    }

    @Override
    public List<Payment> selByAll() {
        return paymentMapper.selAll();
    }

    @Override
    public List<Application> selByEx(int expenditureid,String apptime) {
        return applicationMapper.selById(expenditureid,apptime);
    }
}
