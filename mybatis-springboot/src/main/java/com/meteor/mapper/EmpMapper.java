package com.meteor.mapper;

import com.meteor.jojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    @Delete("delete from tb_emp where id = #{id}")
    public void delete(Integer id);

    @Options(keyProperty = "id", useGeneratedKeys = true) //将生成的主键值赋值给id
    @Insert("insert into tb_emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
            "values(#{username},#{name},#{gender},#{image},#{job}," +
            "#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insert(Emp emp);

//    @Update("update tb_emp set username=#{username}, name=#{name}, update_time=#{updateTime} where id=#{id};")
//    public void update(Emp emp);

//    @Results({
//            @Result(column = "dept_id", property = "deptId"),
//            @Result(column = "create_time", property = "createTime"),
//            @Result(column = "update_time", property = "updateTime")
//    })//手动映射封装
    @Select("select * from tb_emp where id=#{id}")//properties set auto reflect camel case
    public Emp getById(Integer id);

//    @Select("select * from tb_emp where name like '%${name}%' and gender=#{gender} and " +
//            "entrydate between #{begin} and #{end} order by update_time DESC") //using ${} to reflect variable in string
//    @Select("select * from tb_emp where name like concat('%',#{name},'%') and gender=#{gender} and " +
//            "entrydate between #{begin} and #{end} order by update_time DESC") //use concat to splice the string
    public List<Emp> getByCondition(String name, Short gender, LocalDate begin, LocalDate end);

    public void update2(Emp emp);

    public void deleteById(List<Integer> ids);

}
