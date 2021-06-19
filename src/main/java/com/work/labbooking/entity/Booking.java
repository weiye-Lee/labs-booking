package com.work.labbooking.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking {
    private Integer id;
    private Boolean t1;
    private Boolean t2;
    private Boolean t3;
    private Boolean t4;
    private Boolean t5;
    private Integer lab_id;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private LocalDateTime date;
}
