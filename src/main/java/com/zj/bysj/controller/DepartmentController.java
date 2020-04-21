package com.zj.bysj.controller;

import com.zj.bysj.pojo.Department;
import com.zj.bysj.service.DepartmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;
    @RequestMapping("findDepart")
    public List<Department> findDepart(){
        return departmentService.selDepart();
    }

}
