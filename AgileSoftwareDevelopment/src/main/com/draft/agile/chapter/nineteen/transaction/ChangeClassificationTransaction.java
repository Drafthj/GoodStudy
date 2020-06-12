package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.classification.PaymentClassification;
import com.draft.agile.chapter.nineteen.schedule.Schedule;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/3
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class ChangeClassificationTransaction extends ChangeEmployeeTransaction{
    public ChangeClassificationTransaction(Integer empId) {
        super(empId);
    }

    @Override
    protected void change(Employee e) {
        e.setClassification(getClassification());
        e.setSchedule(getSchedule());
    }

    protected abstract PaymentClassification getClassification();
    protected abstract Schedule getSchedule();
}
