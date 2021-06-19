package com.work.labbooking.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
/**
 * the record of lab booking
 * every booking will result in this record
 */
public class BookingRec {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer labId;
    private Integer bookingRecId;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private LocalDateTime date;
    // the section of class (1 - 5).
    private Integer section;


}
