package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.schedule.Schedule;
import com.draft.agile.chapter.nineteen.classification.Classification;
import com.draft.agile.chapter.nineteen.classification.CommissionClassification;
import com.draft.agile.chapter.nineteen.schedule.BlweeklySchedule;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AddCommissionedEmployee extends AddEmployeeTransaction{
    private double salary;
    private double commissionRate;

    public AddCommissionedEmployee(int empId, String name, String address, double salary, double commissionRate) {
        super(empId, name, address);
        this.salary = salary;
        this.commissionRate = commissionRate;
    }

    @Override
    protected Classification getClassification() {
        return new CommissionClassification(salary, commissionRate);
    }

    @Override
    protected Schedule getSchedule() {
        return new BlweeklySchedule();
    }
}
