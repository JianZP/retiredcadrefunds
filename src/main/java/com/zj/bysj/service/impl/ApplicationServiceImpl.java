package com.zj.bysj.service.impl;

import com.zj.bysj.mapper.ApplicationMapper;
import com.zj.bysj.pojo.Application;
import com.zj.bysj.service.ApplicationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Resource
    private ApplicationMapper applicationMapper;
    @Override
    public List<Application> selByWait(int currPage, int pageSize) {
        //查询全部数据
        List<Application> applicationList = applicationMapper.selWait("待审核");
        //从第几条数据开始
        int firstIndex = (currPage - 1) * pageSize;
        //到第几条数据结束
        int lastIndex = currPage * pageSize;
        if(currPage * pageSize>=applicationList.size()){
            lastIndex=applicationList.size();
        }
        return applicationList.subList(firstIndex, lastIndex); //直接在list中截取
    }

    @Override
    public int total() {
        return applicationMapper.selTotal("待审核");
    }

    @Override
    public int setIsSuccess(String issuccess, int id) {
        return applicationMapper.setSuccess(issuccess, id);
    }

    @Override
    public int insApplicate(Application application) {
        return applicationMapper.insApplication(application);
    }

    @Override
    public List<Application> selForId(int id,int currPage, int pageSize) {
       List<Application> applications= applicationMapper.selForId(id);
        //从第几条数据开始
        int firstIndex = (currPage - 1) * pageSize;
        //到第几条数据结束
        int lastIndex = currPage * pageSize;
        if(currPage * pageSize>=applications.size()){
            lastIndex=applications.size();
        }
        return applications.subList(firstIndex, lastIndex); //直接在list中截取
    }

    @Override
    public int selSelfCount(int id) {
        return applicationMapper.selCount(id);
    }
}
