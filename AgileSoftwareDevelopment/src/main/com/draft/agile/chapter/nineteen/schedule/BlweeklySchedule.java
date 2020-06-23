package com.draft.agile.chapter.nineteen.schedule;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BlweeklySchedule implements Schedule {
    @Override
    public boolean isPayDate(LocalDateTime dateTime) {
        return false;
    }

    @Override
    public LocalDateTime getPayPeriodStartDate(LocalDateTime dateTime) {
        return null;
    }
}
