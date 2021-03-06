package com.draft.agile.chapter.nineteen.bean;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/20
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TimeCard {
    private LocalDateTime date;
    private double hours;

    public TimeCard(LocalDateTime date, double hours) {
        this.date = date;
        this.hours = hours;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
