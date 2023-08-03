package com.meteor.mybatisspringboot;

import com.meteor.jojo.Emp;
import com.meteor.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


@SpringBootTest //springboot整合单元测试的注解
class MybatisSpringbootApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    public void testDelete(){
        empMapper.delete(18);
    }

    public void testInsert(){
        Emp emp = new Emp();
        emp.setUsername ("Tom2");
        emp.setName ("汤姆");
        emp.setImage ("1 .jpg") ;
        emp.setGender ((short)1) ;
        emp.setJob((short)1) ;
        emp.setEntrydate (LocalDate.of(2000,1,1));
        emp.setCreateTime (LocalDateTime.now());
        emp.setUpdateTime (LocalDateTime .now());
        emp.setDeptId(1);

        empMapper.insert(emp);
        System.out.println(emp.getId());
    }
    public void testUpdate(){
        Emp emp = new Emp();
        emp.setId(22);
        emp.setUsername ("Tom2");
//        emp.setName ("汤姆");
//        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update2(emp);
    }

    public void testSelect(){
        Emp emp=empMapper.getById(20);
        System.out.println(emp);
    }
    @Test
    public void testCondition(){
//        List<Emp> list=empMapper.getByCondition("张", null,
//                LocalDate.of(2000,10,1), LocalDate.of(2020,10,1));
//        List<Emp> list=empMapper.getByCondition(null, (short) 1,null,null);
        List<Emp> list=empMapper.getByCondition(null, null,null,null);

        list.forEach(System.out::println);
    }
    public void testDelTeam(){
        List<Integer> ids= Arrays.asList(16,17,18);
        empMapper.deleteById(ids);
    }
}
