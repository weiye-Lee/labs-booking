package com.work.labbooking.service;

import com.work.labbooking.entity.Lab;
import com.work.labbooking.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootTest
class AdminServiceTest {
    @Autowired
    private AdminService adminService;

    @Autowired
    private PasswordEncoder encoder;
    @Test
    void addUser() {
        User user = new User();
        adminService.addUser(user);
    }

    @Test
    void testAddUser() {
        Lab lab = Lab.builder()
                .name("c++ lab")
                .contain(60)
                .description("this is an lab")
                .room("909")
                .build();
        adminService.addLab(lab);

    }

    @Test
    void testAddUser2() {
        Lab lab = Lab.builder()
                .name("Java lab")
                .contain(60)
                .description("this is an lab")
                .room("910")
                .build();
        adminService.addLab(lab);

    }

    @Test
    void removeUser() {
    }

    @Test
    void listLab() {
        List<Lab> list = adminService.listLab();
        list.forEach(a -> System.out.println(a.getName()));
    }

    @Test
    void testAddUser1() {
        User user = User.builder()
                .name("bobo")
                .account("2018214184")
                .build();
        adminService.addUser(user);
    }

    @Test
    void testRemoveUser() {
        adminService.removeUser(3);
    }

    @Test
    void listTeacher() {
        List<User> list = adminService.listTeacher();
        list.forEach(a -> System.out.println(a.getName()));
    }

    @Test
    void addLab() {
    }

    @Test
    void testListLab() {
    }

    @Test
    void testPasswordEnc() {
        String str = encoder.encode("123456");
        System.out.println(str);
    }
}