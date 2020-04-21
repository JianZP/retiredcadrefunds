package com.zj.bysj.service.impl;

import com.zj.bysj.mapper.PaymentstandardMapper;
import com.zj.bysj.pojo.Paymentstandard;
import com.zj.bysj.service.PaymentstandardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class PaymentstandardServiceImpl implements PaymentstandardService {

    @Resource
    private PaymentstandardMapper paymentstandardMapper;

    @Override
    public List<Paymentstandard> selPayment(int currPage, int pageSize) {
        //查询全部数据
        List<Paymentstandard> paymentstandardList = paymentstandardMapper.selAll();
        //从第几条数据开始
        int firstIndex = (currPage - 1) * pageSize;
        //到第几条数据结束
        int lastIndex = currPage * pageSize;
        if(currPage * pageSize>=paymentstandardList.size()){
            lastIndex=paymentstandardList.size();
        }
        return paymentstandardList.subList(firstIndex, lastIndex); //直接在list中截取
    }

    @Override
    public int total() {
        return paymentstandardMapper.selTotal();
    }

    @Override
    public int delSelect(int id) {
        return paymentstandardMapper.delAll(id);
    }

    @Override
    public int addPaymentstandard(Paymentstandard paymentstandard) {
        return paymentstandardMapper.addPayment(paymentstandard);
    }

    @Override
    public int updPaymentstandard(String title, String detail, String editpeople, String edittime,int id) {
        return paymentstandardMapper.updPayment(title, detail, editpeople, edittime,id);
    }

    @Override
    public List<Paymentstandard> findPaymentstandard(String title, String isnowstandrad,int currPage, int pageSize) {
        //查询全部数据
        List<Paymentstandard> paymentstandardList = paymentstandardMapper.findPayment(title, isnowstandrad);
        //从第几条数据开始
        int firstIndex = (currPage - 1) * pageSize;
        //到第几条数据结束
        int lastIndex = currPage * pageSize;
        if(currPage * pageSize>=paymentstandardList.size()){
            lastIndex=paymentstandardList.size();
        }
        return paymentstandardList.subList(firstIndex, lastIndex); //直接在list中截取
    }

    @Override
    public int findCo(String title, String isnowstandrad) {
        return paymentstandardMapper.findCount(title, isnowstandrad);
    }

    @Override
    public int setPayStandradNo(String isnowstandrad,int id) {
        return paymentstandardMapper.setStandradNo(isnowstandrad,id);
    }

    @Override
    public int setPayStandradYes(String isnowstandrad,int id) {
        return paymentstandardMapper.setStandradYes(isnowstandrad,id);
    }

    @Override
    public List<Paymentstandard> selStandradP() {
        return paymentstandardMapper.selStandrad("是");
    }
}
