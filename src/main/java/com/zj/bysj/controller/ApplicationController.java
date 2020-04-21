package com.zj.bysj.controller;

import com.zj.bysj.pojo.Application;
import com.zj.bysj.service.ApplicationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class ApplicationController {
    @Resource
    private ApplicationService applicationService;
    @RequestMapping("selForWait")
    public List<Application> selForWait(int currPage, int pageSize){
        return  applicationService.selByWait(currPage,pageSize);
    }
    @RequestMapping("findappTotal")
    public int selTotal(){
        return applicationService.total();
    }

    @RequestMapping("updSuccess")
    public int updSuccess(String issuccess,int id){
        applicationService.setIsSuccess(issuccess, id);
        return 200;
    }

    @RequestMapping("applicate")
    public int applicate(int appid,String applicater,int expenditureid,String expendituretype,int appnum,String appdetail){
        Application application=new Application();
        String s = (new java.text.SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss")).format(new Date());
        application.setAppid(appid);
        application.setApplicater(applicater);
        application.setExpenditureid(expenditureid);
        application.setExpendituretype(expendituretype);
        application.setAppnum(appnum);
        application.setAppdetail(appdetail);
        application.setApptime(s);
        application.setIssuccess("待审核");
        applicationService.insApplicate(application);
        return 300;
    }
    @RequestMapping("selSelf")
    public List<Application> selSelf(int id,int currPage, int pageSize){
        return applicationService.selForId(id,currPage,pageSize);
    }

    @RequestMapping("selSelfCount")
    public int selSelfCount(int id){
        return applicationService.selSelfCount(id);
    }
}
