package com.meteor.mybatisspringboot;

import com.meteor.mybatisspringboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.meteor.mybatisspringboot.jojo.User;

import java.util.List;


@SpringBootTest //springboot整合单元测试的注解
class MybatisSpringbootApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testuser(){
        List<User> list =userMapper.list();
        list.stream().forEach(user -> {
            System.out.println(user);
        });
    }

}
