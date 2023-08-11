package com.implement.service.impl;

import com.implement.mapper.DeptMapper;
import com.implement.pojo.Dept;
import com.implement.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> list(){
        return deptMapper.list();
    }
}
