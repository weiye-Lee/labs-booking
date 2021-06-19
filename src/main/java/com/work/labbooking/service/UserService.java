package com.work.labbooking.service;

import com.work.labbooking.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    public User getUser(String userName) {
        return new User();
    }
}
