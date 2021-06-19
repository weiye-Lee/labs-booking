package com.work.labbooking.service;

import com.work.labbooking.entity.BookingRec;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.stylesheets.LinkStyle;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class TeacherServiceTest {

    @Autowired
    private TeacherService teacherService;
    @Test
    void labBooking() {

        String str = "2021-06-19 00:00:00:000";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
        BookingRec bookingRec = BookingRec.builder()
                .date(LocalDateTime.parse(str,fmt))
                .section(1)
                .labId(1)
                .build();
        teacherService.labBooking(bookingRec);
    }

    @Test
    void listBookingRec() {
        List<BookingRec> list = teacherService.listBookingRec();
        list.forEach(a -> System.out.println(a.getId()));
    }
}