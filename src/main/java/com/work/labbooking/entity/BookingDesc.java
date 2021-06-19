package com.work.labbooking.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingDesc {
    private Integer id;
    private Integer userId;
    private Integer labId;
    private Boolean s1;
    private Boolean s2;
    private Boolean s3;
    private Boolean s4;
    private Boolean s5;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
