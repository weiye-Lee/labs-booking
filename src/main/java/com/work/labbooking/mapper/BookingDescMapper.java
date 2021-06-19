package com.work.labbooking.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.work.labbooking.entity.BookingDesc;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BookingDescMapper extends BaseMapper<BookingDesc> {
}
