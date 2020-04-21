package com.zj.bysj.mapper;

import com.zj.bysj.pojo.Application;
import com.zj.bysj.pojo.Paymentstandard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ApplicationMapper {

 List<Application> selWait(String issuccess);

 int selTotal(String issuccess);

 int setSuccess(String issuccess,int id);

 List<Application>  selById(int expenditureid,String apptime);

 int insApplication(Application application);

 List<Application> selForId(int id);

 int selCount(int id);
}
