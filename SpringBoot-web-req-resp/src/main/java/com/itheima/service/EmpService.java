package com.itheima.service;

import com.itheima.pojo.Emp;

import java.util.List;

public interface EmpService {
    //获取员工列表【逻辑处理】
    public List<Emp> listEmp();
}
