package com.zj.bysj.service;

import com.zj.bysj.pojo.Paymentstandard;

import java.util.Date;
import java.util.List;

public interface PaymentstandardService {

    List<Paymentstandard> selPayment(int currPage, int pageSize);

    int total();

    int delSelect(int id);

    int addPaymentstandard(Paymentstandard paymentstandard);

    int updPaymentstandard(String title,String detail,String editpeople,String edittime,int id);

    List<Paymentstandard> findPaymentstandard(String title,String isnowstandrad,int currPage, int pageSize);

    int findCo(String title,String isnowstandrad);

    int setPayStandradNo(String isnowstandrad,int id);

    int setPayStandradYes(String isnowstandrad,int id);

    List<Paymentstandard> selStandradP();
}
