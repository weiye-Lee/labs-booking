package com.work.labbooking.service;

import com.work.labbooking.entity.Lab;
import com.work.labbooking.entity.User;
import com.work.labbooking.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private UserMapper userMapper;
    public User addUser(User user) {
        userMapper.insert(user);
        return user;
    }
    public void removeUser(int id) {

    }

    /**
     * list the all teacher
     * @return
     */
    public List<User> listUser() {
        return null;
    }

    /**
     * 新增/修改 lab
     * @param lab
     */
    public void addLab(Lab lab) {

    }

    public List<Lab> listLab() {
        return null;
    }
}
