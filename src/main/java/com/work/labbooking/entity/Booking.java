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
public class Booking {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Boolean s1;
    private Boolean s2;
    private Boolean s3;
    private Boolean s4;
    private Boolean s5;
    private Integer lab_id;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private LocalDateTime date;

    public void setSection(Integer s) {
        switch (s) {
            case 1:
                this.setS1(true);
                break;
            case 2:
                this.setS2(true);
                break;
            case 3:
                this.setS3(true);
                break;
            case 4:
                this.setS4(true);
                break;
            case 5:
                this.setS5(true);
                break;

        }
    }

    public Boolean getSection(Integer s) {
        Boolean bool = false;
        switch (s) {
            case 1:
                bool = this.getS1();
                break;
            case 2:
                bool = this.getS2();
                break;
            case 3:
                bool = this.getS3();
                break;
            case 4:
                bool = this.getS4();
                break;
            case 5:
                bool = this.getS5();
                break;

        }
        return bool;
    }
}
