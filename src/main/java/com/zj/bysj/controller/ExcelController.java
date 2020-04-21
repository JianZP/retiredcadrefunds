package com.zj.bysj.controller;
import com.zj.bysj.pojo.Application;
import com.zj.bysj.service.ExcelService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;


@Controller
    public class ExcelController {
    @Resource
    private ExcelService excelService;
    @RequestMapping("/ExcelDownloads")
    public void UserExcelDownloads(HttpServletResponse response)throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("离休干部经费报表");
        List<Application> applicationList = excelService.selByWait();
        String s = (new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date());
        System.out.println(s);
        String fileName = "expenditure"+s + ".xls";
        int rowNum = 1;
        String [] headers = {"申请人","申请时间","经费类型","金额（元）"};
        HSSFRow row = sheet.createRow(0);
        for (int i = 0;i<headers.length;i++){
            HSSFCell cell = row.createCell((short) i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }
        for (Application application : applicationList){
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell((short) 0).setCellValue(new HSSFRichTextString(application.getApplicater()));
            row1.createCell((short) 1).setCellValue(new HSSFRichTextString(application.getApptime()));
            row1.createCell((short) 2).setCellValue(new HSSFRichTextString(application.getExpendituretype()));
            row1.createCell((short) 3).setCellValue(new HSSFRichTextString(application.getAppnum().toString()));
            rowNum++;

        }
        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }

    }
