package com.zj.bysj.controller;

import com.zj.bysj.pojo.Application;
import com.zj.bysj.pojo.Payment;
import com.zj.bysj.pojo.YearExcel;
import com.zj.bysj.service.ExcelService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

;


@Controller
    public class YearExcelController {
    @Resource
    private ExcelService excelService;
    @RequestMapping("/YearExcelDownloads")
    public void UserExcelDownloads(HttpServletResponse response)throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("年度经费报表");
        List<Payment> payments = excelService.selByAll();
        String s1 = (new java.text.SimpleDateFormat("yyyy")).format(new Date());
        List<YearExcel> yearExcels=new ArrayList<>();
        for (int i = 0; i < payments.size(); i++) {
            YearExcel yearExcel=new YearExcel();
            int id=payments.get(i).getId();
            List<Application> applications=excelService.selByEx(id,s1);
            int usecase=0;
            for (int j = 0; j < applications.size(); j++) {
                usecase+=applications.get(j).getAppnum();
            }
            yearExcel.setExpenditurename(payments.get(i).getExpenditurename());
            yearExcel.setExpendituretype(payments.get(i).getExpendituretype());
            yearExcel.setCanmoney(payments.get(i).getCanmoney());
            yearExcel.setUsecase(usecase);
            yearExcels.add(yearExcel);
        }
        String s = (new java.text.SimpleDateFormat("yyyy")).format(new Date());

        String fileName = "YearExpenditure"+s + ".xls";
        int rowNum = 1;
        String [] headers = {"经费名称","经费类型","每次可申请金额","使用情况"};
        HSSFRow row = sheet.createRow(0);
        for (int i = 0;i<headers.length;i++){
            HSSFCell cell = row.createCell((short) i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }
        for (YearExcel yearExcel : yearExcels){
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell((short) 0).setCellValue(new HSSFRichTextString(yearExcel.getExpenditurename()));
            row1.createCell((short) 1).setCellValue(new HSSFRichTextString(yearExcel.getExpendituretype()));
            row1.createCell((short) 2).setCellValue(new HSSFRichTextString(yearExcel.getCanmoney().toString()));
            row1.createCell((short) 3).setCellValue(new HSSFRichTextString(yearExcel.getUsecase().toString()));
            rowNum++;

        }
        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }

    }
