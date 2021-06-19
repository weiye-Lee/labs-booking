package com.work.labbooking.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class lab {
    private Integer id;
    private String name;
    private Integer contain;
    private String desc;
    private String room;

}
