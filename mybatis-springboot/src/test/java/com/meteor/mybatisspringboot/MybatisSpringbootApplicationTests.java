package com.meteor.mybatisspringboot;

import com.meteor.mybatisspringboot.mapper.EmpMapper;
import com.meteor.mybatisspringboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest //springboot整合单元测试的注解
class MybatisSpringbootApplicationTests {

    @Autowired
    private EmpMapper empMapper;



    @Test
    public void testuser(){
        empMapper.delete(16);
    }

}
