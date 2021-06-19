package com.work.labbooking.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.work.labbooking.entity.Booking;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
@Repository
public interface BookingMapper extends BaseMapper<Booking> {
    @Select("select * from booking where date = #{date} and lab_id = #{id}")
    Booking getBooking(@Param("date") LocalDateTime dateTime,@Param("id") int id);

    @Select("select * from booking")
    List<Booking> selectAll();
}
