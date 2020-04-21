package com.zj.bysj.pojo;

import java.util.Date;

public class Payment {
    private Integer id;
    private String expenditurename;
    private String expendituretype;
    private Integer usecase;
    private String addtime;
    private Integer canmoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpenditurename() {
        return expenditurename;
    }

    public void setExpenditurename(String expenditurename) {
        this.expenditurename = expenditurename;
    }


    public String getExpendituretype() {
        return expendituretype;
    }

    public void setExpendituretype(String expendituretype) {
        this.expendituretype = expendituretype;
    }

    public Integer getUsecase() {
        return usecase;
    }

    public void setUsecase(Integer usecase) {
        this.usecase = usecase;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public Integer getCanmoney() {
        return canmoney;
    }

    public void setCanmoney(Integer canmoney) {
        this.canmoney = canmoney;
    }
}
