package com.zj.bysj.service;

import com.zj.bysj.pojo.Application;

import java.util.List;

public interface ApplicationService {

    List<Application> selByWait(int currPage, int pageSize);

    int total();

    int setIsSuccess(String issuccess,int id);

    int insApplicate(Application application);

    List<Application> selForId(int id,int currPage, int pageSize);

    int selSelfCount(int id);
}
