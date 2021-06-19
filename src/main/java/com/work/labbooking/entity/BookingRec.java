package com.work.labbooking.entity;

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
    private Integer id;
    private Integer userId;
    private Integer labId;

    private LocalDateTime date;
    // the section of class (1 - 5).
    private Integer section;


}
