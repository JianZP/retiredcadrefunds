package com.zj.bysj.pojo;

import java.util.Date;

public class Department {
    private Integer id;
    private String partname;
    private String belongcompany;
    private String address;
    private Date retime;
    private String telnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }

    public String getBelongcompany() {
        return belongcompany;
    }

    public void setBelongcompany(String belongcompany) {
        this.belongcompany = belongcompany;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRetime() {
        return retime;
    }

    public void setRetime(Date retime) {
        this.retime = retime;
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }
}
