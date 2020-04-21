package com.zj.bysj.service.impl;

import com.zj.bysj.mapper.DepartmentMapper;
import com.zj.bysj.mapper.UserMapper;
import com.zj.bysj.pojo.Department;
import com.zj.bysj.pojo.User;
import com.zj.bysj.service.DepartmentService;
import com.zj.bysj.service.OptionUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selDepart() {
        return departmentMapper.selAll();
    }
}
