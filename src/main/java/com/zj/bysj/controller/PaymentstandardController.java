package com.zj.bysj.controller;

import com.zj.bysj.pojo.Paymentstandard;
import com.zj.bysj.service.PaymentstandardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
public class PaymentstandardController {

    @Resource
    private PaymentstandardService paymentstandardService;

    @RequestMapping("selPaymentstandard")
    public List<Paymentstandard> selPaymentstandard(int currPage, int pageSize){
        return paymentstandardService.selPayment(currPage,pageSize);
    }

    @RequestMapping("selTotal")
    public int selTotal(){
        return paymentstandardService.total();
    }

    @RequestMapping("delSelect")
    public int delSelect(String ids){
        String[] ary = ids.split("\\;");
        for (int i = 0; i < ary.length; i++) {
            int id=Integer.parseInt(ary[i]);
            paymentstandardService.delSelect(id);
        }
        return 200;
    }
    @RequestMapping("addPaymentstandard")
    public int addPaymentstandard(String title,String detail,String addpeople){
        String s = (new java.text.SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss")).format(new Date());
        Paymentstandard paymentstandard=new Paymentstandard();
        paymentstandard.setTitle(title);
        paymentstandard.setDetail(detail);
        paymentstandard.setAddpeople(addpeople);
        paymentstandard.setAddtime(s);
        paymentstandard.setEditpeople(null);
        paymentstandard.setEditpeople(null);
        paymentstandard.setIsnowstandrad("否");
        paymentstandardService.addPaymentstandard(paymentstandard);
        return 201;
    }
    @RequestMapping("updPaymentstandard")
    public int updPaymentstandard(String title,String detail,String editpeople,int id){
        String s = (new java.text.SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss")).format(new Date());
        paymentstandardService.updPaymentstandard(title,detail,editpeople,s,id);
        return 202;
    }
    @RequestMapping("delPaymentstandard")
    public int delPaymentstandard(int id){
            paymentstandardService.delSelect(id);
        return 203;
    }
    @RequestMapping("findPaymentstandard")
    public List<Paymentstandard> findPaymentstandard(String title,String isnowstandrad, int currPage, int pageSize){
        return paymentstandardService.findPaymentstandard(title, isnowstandrad, currPage, pageSize);
    }
    @RequestMapping("findTotal")
    public int findTotal(String title,String isnowstandrad){
        return paymentstandardService.findCo(title, isnowstandrad);
    }
    @RequestMapping("setPaymentstandard")
    public int setPaymentStandard(int id){
        paymentstandardService.setPayStandradYes("是",id);
        paymentstandardService.setPayStandradNo("否",id);
        return 204;
    }
    @RequestMapping("findStandrad")
    public List<Paymentstandard> findStandrad(){
        return paymentstandardService.selStandradP();
    }
}
