package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.classification.CommissionClassification;
import com.draft.agile.chapter.nineteen.classification.PaymentClassification;
import com.draft.agile.chapter.nineteen.schedule.BlweeklySchedule;
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
public class ChangeCommissionClassificationTransaction extends ChangeClassificationTransaction {
    private double salary;
    private double commissionRate;

    public ChangeCommissionClassificationTransaction(Integer empId, double salary, double commissionRate) {
        super(empId);
        this.salary = salary;
        this.commissionRate = commissionRate;
    }

    @Override
    protected PaymentClassification getClassification() {
        return new CommissionClassification(salary, commissionRate);
    }

    @Override
    protected Schedule getSchedule() {
        return new BlweeklySchedule();
    }
}
