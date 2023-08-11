package com.itheima.dao;

import com.itheima.pojo.Emp;

import java.util.List;

public interface EmpDao {//面向接口编程：访问数据类型不同（文件、数据库、接口）
    //获取员工列表数据【数据访问】
    public List<Emp> listEmp();
}
