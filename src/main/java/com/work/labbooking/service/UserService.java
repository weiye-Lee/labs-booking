package com.work.labbooking.service;

import com.work.labbooking.entity.Booking;
import com.work.labbooking.entity.Lab;
import com.work.labbooking.entity.User;
import com.work.labbooking.mapper.BookingMapper;
import com.work.labbooking.mapper.LabMapper;
import com.work.labbooking.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {
    @Autowired
    private LabMapper labMapper;
    @Autowired
    private BookingMapper bookingMapper;

    @Autowired
    private UserMapper userMapper;
    public User getUser(String account) {
        return userMapper.selectByAccount(account);
    }

    /**
     * get the lab by id
     * @param id the lab id
     * @return the Lab.class
     */
    public Lab getLab(Integer id) {
        return labMapper.selectById(id);
    }

    /**
     * get all the lab's booking info
     * @return
     */
    public List<Booking> listBooking() {
        return bookingMapper.selectAll();
    }
}
