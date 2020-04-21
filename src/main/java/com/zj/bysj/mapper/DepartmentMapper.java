package com.zj.bysj.mapper;

import com.zj.bysj.pojo.Department;
import com.zj.bysj.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    List<Department> selAll();

}
