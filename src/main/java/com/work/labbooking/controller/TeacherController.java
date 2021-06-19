package com.work.labbooking.controller;

import com.work.labbooking.entity.BookingRec;
import com.work.labbooking.mapper.BookingRecMapper;
import com.work.labbooking.service.TeacherService;
import com.work.labbooking.service.UserService;
import com.work.labbooking.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/api/teacher/")
@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private UserService userService;
    @PostMapping("bookingRec")
    public ResultVO addBookingRec(@RequestBody BookingRec bookingRec) {
        teacherService.labBooking(bookingRec);
        return ResultVO.successWithNoDate();
    }

    @GetMapping("bookingRec")
    public ResultVO getBookingRec() {
        return ResultVO.success(Map.of("date",teacherService.listBookingRec()));
    }

    @GetMapping("booking")
    public ResultVO listBookings() {
        return ResultVO.success(Map.of("date",userService.listBooking()));
    }
}
