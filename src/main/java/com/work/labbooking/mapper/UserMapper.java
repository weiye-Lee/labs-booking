package com.work.labbooking.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.work.labbooking.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where role = 'teacher'")
    List<User> selectAllTeacher();

    @Select("select * from user")
    List<User> selectAll();

    @Select("select * from user where account = #{account}")
    User selectByAccount(@Param("account") String account);
}