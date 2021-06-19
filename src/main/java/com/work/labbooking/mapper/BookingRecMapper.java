package com.work.labbooking.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.work.labbooking.entity.BookingRec;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookingRecMapper extends BaseMapper<BookingRec> {
    @Select("select * from booking_rec where user_id = #{id}")
    List<BookingRec> selectByUser(@Param("id") int id);
}
