package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Case {

    @RequestMapping("/list")
    public Result list(){ //方法返回值
        //加载、解析xml文件【数据访问】
        String file=this.getClass().getClassLoader().getResource("emp.xml").getFile();//运用类加载器获取文件
        System.out.println(file);
        List<Emp> emplist= XmlParserUtils.parse(file, Emp.class);

        //数据转换 - gender,job【逻辑处理】
        emplist.stream().forEach(emp -> {
            String gender=emp.getGender();
            if("1".equals(gender)){
                emp.setGender("male");
            } else if ("2".equals(gender)) {
                emp.setGender("female");
            }

            String job=emp.getJob();
            if("1".equals(job)){
                emp.setJob("teacher");
            } else if ("2".equals(job)) {
                emp.setJob("master");
            } else if ("3".equals(job)) {
                emp.setJob("leader");
            }
        }); //基于stream流遍历列表

        //响应数据
        return Result.success(emplist);
    }
}
