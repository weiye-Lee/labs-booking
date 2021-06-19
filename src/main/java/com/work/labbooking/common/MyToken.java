package com.work.labbooking.common;

import lombok.Data;

import java.io.Serializable;

@Data

public class MyToken implements Serializable {
    public static final String AUTHORIZATION = "Authorization";
    public static final String UID = "uid";
    public static final String ROLE = "role";

    private String role;
    private Integer uid;

    public MyToken(String role,Integer uid) {
        this.role = role;
        this.uid = uid;
    }
}
