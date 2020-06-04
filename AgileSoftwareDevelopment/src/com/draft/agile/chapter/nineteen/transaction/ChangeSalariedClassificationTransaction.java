package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.classification.PaymentClassification;
import com.draft.agile.chapter.nineteen.classification.SalariedClassification;
import com.draft.agile.chapter.nineteen.schedule.MonthlySchedule;
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
public class ChangeSalariedClassificationTransaction extends ChangeClassificationTransaction{
    private double monthlySalary;

    public ChangeSalariedClassificationTransaction(Integer empId, double monthlySalary) {
        super(empId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    protected PaymentClassification getClassification() {
        return new SalariedClassification(monthlySalary);
    }

    @Override
    protected Schedule getSchedule() {
        return new MonthlySchedule();
    }
}
