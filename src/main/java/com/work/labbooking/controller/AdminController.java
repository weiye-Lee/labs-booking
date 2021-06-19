package com.work.labbooking.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.work.labbooking.common.RequestComponent;
import com.work.labbooking.entity.Lab;
import com.work.labbooking.entity.User;
import com.work.labbooking.service.AdminService;
import com.work.labbooking.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/api/admin/")
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private RequestComponent requestComponent;
    @PostMapping("teacher")
    public ResultVO addTeacher(@RequestBody User user) {
        user.setRole("teacher");
        adminService.addUser(user);
        return ResultVO.successWithNoDate();
    }

    @PostMapping("lab")
    public ResultVO addLab(@RequestBody Lab lab) {
        adminService.addLab(lab);
        return ResultVO.successWithNoDate();
    }

    /**
     * according to set a property of useAble to -
     * - realize the remover of user
     * @param id
     * @return
     */
//    @PostMapping("teacher/useable")
//    public ResultVO setTeacherUseAble(@Param("id") int id) {
//        return ResultVO.error(500,"接口为开放");
//    }

    @GetMapping("teacher")
    public ResultVO listTeachers() {
        log.warn("{}",requestComponent.getRole());
        log.warn("here");
        return ResultVO.success(Map.of("date",adminService.listTeacher()));
    }
}
