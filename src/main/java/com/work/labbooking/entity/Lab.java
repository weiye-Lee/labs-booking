package com.work.labbooking.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lab {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer contain;
    private String name;
    private String description;
    private String room;

}
