package com.zj.bysj.mapper;

import com.zj.bysj.pojo.Paymentstandard;
import com.zj.bysj.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface PaymentstandardMapper {
    List<Paymentstandard> selAll();

    int selTotal();

    int delAll(int id);

    int addPayment(Paymentstandard paymentstandard);

    int updPayment(String title,String detail,String editpeople,String edittime,int id);

    List<Paymentstandard> findPayment(@Param("title") String title,@Param("isnowstandrad") String isnowstandrad);

    int findCount(@Param("title") String title,@Param("isnowstandrad") String isnowstandrad);

    int setStandradNo(String isnowstandrad,int id);

    int setStandradYes(String isnowstandrad,int id);

    List<Paymentstandard> selStandrad(String isnowstandrad);
}
