package com.work.labbooking.config;

import com.work.labbooking.common.RequestComponent;
import com.work.labbooking.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class AdminInterceptor implements HandlerInterceptor {
    @Autowired
    private RequestComponent requestComponent;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!requestComponent.getRole().equals("admin")) {
            throw new MyException(303, "无权限");

        }
        return true;
    }
}
