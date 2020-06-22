package com.draft.agile.chapter.nineteen.schedule;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MonthlySchedule implements Schedule {
    @Override
    public boolean isPayDate(LocalDateTime dateTime) {
        int m1 = dateTime.getMonthValue();
        int m2 = dateTime.plusDays(1).getMonthValue();
        return m1 != m2;
    }

    @Override
    public LocalDateTime getPayPeriodStartDate(LocalDateTime dateTime) {
        return dateTime.withDayOfMonth(1).with(LocalTime.MIN);
    }
}
