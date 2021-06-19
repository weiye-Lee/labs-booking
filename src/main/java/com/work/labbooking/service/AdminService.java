package com.work.labbooking.service;

import com.work.labbooking.entity.Lab;
import com.work.labbooking.entity.User;
import com.work.labbooking.mapper.LabMapper;
import com.work.labbooking.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LabMapper labMapper;
    @Autowired
    private PasswordEncoder encryptor;

    public void addUser(User user) {
        user.setPassword(encryptor.encode("123456"));
        user.setRole("teacher");
        userMapper.insert(user);
    }
    public void removeUser(int id) {
        userMapper.deleteById(id);
    }

    /**
     * list the all teacher
     * @return
     */
    public List<User> listTeacher() {
        return userMapper.selectAllTeacher();
    }

    /**
     * 新增/修改 lab
     * @param lab
     */
    public void addLab(Lab lab) {
        labMapper.insert(lab);
    }

    public List<Lab> listLab() {
        return labMapper.selectAll();
    }
}
