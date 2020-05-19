package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.PayrollDatabase;
import com.draft.agile.chapter.nineteen.schedule.Schedule;
import com.draft.agile.chapter.nineteen.classification.Classification;
import com.draft.agile.chapter.nineteen.pay.HoldMethod;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class AddEmployeeTransaction implements Transaction {
    private int empId;
    private String name;
    private String address;

    public AddEmployeeTransaction(int empId, String name, String address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    @Override
    public void execute() {
        Employee employee = new Employee(empId, name, address);
        employee.setClassification(getClassification());
        employee.setSchedule(getSchedule());
        employee.setMethod(new HoldMethod());
        PayrollDatabase.addEmployee(empId, employee);
    }

    protected abstract Classification getClassification();
    protected abstract Schedule getSchedule();
}
