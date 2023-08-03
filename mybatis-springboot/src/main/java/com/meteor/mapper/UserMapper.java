package com.meteor.mapper;

import com.meteor.jojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //运行时，会自动生成接口实现类对象（代理对象），并将该对象交给IOC容器
public interface UserMapper {
    //查询全部用户
    @Select("select * from user")
    List<User> list();

}
