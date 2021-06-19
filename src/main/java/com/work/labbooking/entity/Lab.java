package com.work.labbooking.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lab {
    private Integer id;
    private Integer contain;
    private String name;
    private String desc;
    private String room;

}
