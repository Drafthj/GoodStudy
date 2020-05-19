package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.schedule.Schedule;
import com.draft.agile.chapter.nineteen.classification.Classification;
import com.draft.agile.chapter.nineteen.classification.SalariedClassification;
import com.draft.agile.chapter.nineteen.schedule.MonthlySchedule;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AddSalariedEmployee extends AddEmployeeTransaction{
    private double salary;

    public AddSalariedEmployee(int empId, String name, String address, double salary) {
        super(empId, name, address);
        this.salary = salary;
    }

    @Override
    protected Classification getClassification() {
        return new SalariedClassification(salary);
    }

    @Override
    protected Schedule getSchedule() {
        return new MonthlySchedule();
    }
}
