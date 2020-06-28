package com.draft.agile.chapter.nineteen.bean;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/22
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ServiceCharge {
    private LocalDateTime dateTime;
    private double charge;


    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public ServiceCharge(LocalDateTime dateTime, double charge) {
        this.dateTime = dateTime;
        this.charge = charge;
    }
}
