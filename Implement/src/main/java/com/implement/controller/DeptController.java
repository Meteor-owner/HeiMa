package com.implement.controller;

import com.implement.pojo.Dept;
import com.implement.pojo.Result;
import com.implement.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 部门管理Controller
 */
@RestController
@Slf4j
public class DeptController {

//    private static Logger logger= LoggerFactory.getLogger(DeptController.class); //日志记录对象
//    @RequestMapping(value = "/depts", method = RequestMethod.GET) //指定请求方式是GET

    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public Result list(){
        log.info("查询数据");

        List<Dept> deptList= deptService.list();
        return Result.success(deptList);
    }
}
