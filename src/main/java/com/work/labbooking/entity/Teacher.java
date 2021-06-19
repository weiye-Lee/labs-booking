package com.work.labbooking.entity;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends User{
    private Integer id;
    private String name;
    private String sex;

}
