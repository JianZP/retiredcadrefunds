package com.zj.bysj.pojo;

import java.util.Date;

public class Application {
    private Integer id;
    private Integer appid;
    private String applicater;
    private String apptime;
    private Integer expenditureid;
    private String expendituretype;
    private Integer appnum;
    private String appdetail;
    private String issuccess;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getApplicater() {
        return applicater;
    }

    public void setApplicater(String applicater) {
        this.applicater = applicater;
    }

    public String getApptime() {
        return apptime;
    }

    public void setApptime(String apptime) {
        this.apptime = apptime;
    }

    public Integer getExpenditureid() {
        return expenditureid;
    }

    public void setExpenditureid(Integer expenditureid) {
        this.expenditureid = expenditureid;
    }

    public String getExpendituretype() {
        return expendituretype;
    }

    public void setExpendituretype(String expendituretype) {
        this.expendituretype = expendituretype;
    }

    public Integer getAppnum() {
        return appnum;
    }

    public void setAppnum(Integer appnum) {
        this.appnum = appnum;
    }

    public String getAppdetail() {
        return appdetail;
    }

    public void setAppdetail(String appdetail) {
        this.appdetail = appdetail;
    }

    public String getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(String issuccess) {
        this.issuccess = issuccess;
    }

    @Override
    public String toString() {
        return "{" + id +
                ", " + appid +
                ", " + applicater +
                ", " + apptime +
                ", " + expenditureid +
                ", " + expendituretype +
                ", " + appnum +
                ", " + appdetail +
                ", " + issuccess +
                '}';
    }
}
