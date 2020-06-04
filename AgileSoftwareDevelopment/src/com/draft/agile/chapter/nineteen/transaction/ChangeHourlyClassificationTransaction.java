package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.classification.HourlyClassification;
import com.draft.agile.chapter.nineteen.classification.PaymentClassification;
import com.draft.agile.chapter.nineteen.schedule.Schedule;
import com.draft.agile.chapter.nineteen.schedule.WeeklySchedule;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/3
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ChangeHourlyClassificationTransaction extends ChangeClassificationTransaction {
    private double hourlyRate;
    public ChangeHourlyClassificationTransaction(Integer empId, double hourlyRate) {
        super(empId);
        this.hourlyRate = hourlyRate;
    }

    @Override
    protected PaymentClassification getClassification() {
        return new HourlyClassification(hourlyRate);
    }

    @Override
    protected Schedule getSchedule() {
        return new WeeklySchedule();
    }
}
