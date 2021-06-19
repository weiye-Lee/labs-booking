package com.work.labbooking.service;

import com.work.labbooking.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdminServiceTest {
    @Autowired
    private AdminService adminService;
    @Test
    void addUser() {
        User user = new User();
        adminService.addUser(user);
    }
}