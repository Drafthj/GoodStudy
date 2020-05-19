package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.schedule.Schedule;
import com.draft.agile.chapter.nineteen.classification.Classification;
import com.draft.agile.chapter.nineteen.classification.HourlyClassification;
import com.draft.agile.chapter.nineteen.schedule.WeeklySchedule;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AddHourlyEmployee extends AddEmployeeTransaction{
    private double hourlyRate;

    public AddHourlyEmployee(int empId, String name, String address, double hourlyRate) {
        super(empId, name, address);
        this.hourlyRate = hourlyRate;
    }

    @Override
    protected Classification getClassification() {
        return new HourlyClassification(hourlyRate);
    }

    @Override
    protected Schedule getSchedule() {
        return new WeeklySchedule();
    }
}
