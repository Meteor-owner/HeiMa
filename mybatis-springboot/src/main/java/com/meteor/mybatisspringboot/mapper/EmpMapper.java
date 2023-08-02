package com.meteor.mybatisspringboot.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper {
    @Delete("delete from tb_emp where id = #{id}")
    public void delete(Integer id);
}
