package com.zj.bysj.service;

import com.zj.bysj.pojo.Application;
import com.zj.bysj.pojo.Payment;

import java.util.List;

public interface ExcelService {

    List<Application> selByWait();

    List<Payment> selByAll();

    List<Application>  selByEx(int expenditureid,String apptime);
}
