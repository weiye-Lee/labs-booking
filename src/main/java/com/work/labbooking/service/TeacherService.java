package com.work.labbooking.service;

import com.work.labbooking.common.RequestComponent;
import com.work.labbooking.entity.Booking;
import com.work.labbooking.entity.BookingRec;
import com.work.labbooking.exception.MyException;
import com.work.labbooking.mapper.BookingMapper;
import com.work.labbooking.mapper.BookingRecMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private BookingRecMapper bookingRecMapper;
    @Autowired
    private RequestComponent requestComponent;
    @Autowired
    private BookingMapper bookingMapper;

    /**
     * book one lab
     */
    public void labBooking(BookingRec bookingRec) {
//        int uid = requestComponent.getUid();
        int uid = 1;
        bookingRec.setUserId(uid);
        bookingRecMapper.insert(bookingRec);

        // 将实验室状态设置为已经预约
        Booking booking = bookingMapper.getBooking(bookingRec.getDate(), bookingRec.getLabId());
        if (booking == null) {
            booking = new Booking();
            booking.setLab_id(bookingRec.getLabId());
            booking.setDate(bookingRec.getDate());
            booking.setSection(bookingRec.getSection());
            bookingMapper.insert(booking);
        } else if (booking.getSection(bookingRec.getSection())) {
            throw new MyException(303, "数据异常");
        } else {
            booking.setLab_id(bookingRec.getLabId());
            booking.setDate(bookingRec.getDate());
            booking.setSection(bookingRec.getSection());
            bookingMapper.insert(booking);
        }
    }

    /**
     * means the history of booking
     * @return
     */
    public List<BookingRec> listBookingRec() {
//        int id = requestComponent.getUid();
        int id = 1;
        return bookingRecMapper.selectByUser(id);
    }



}
