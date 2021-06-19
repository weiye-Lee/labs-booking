package com.work.labbooking.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.work.labbooking.entity.Lab;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LabMapper extends BaseMapper<Lab> {
    @Select("select * from lab")
    List<Lab> selectAll();
}
