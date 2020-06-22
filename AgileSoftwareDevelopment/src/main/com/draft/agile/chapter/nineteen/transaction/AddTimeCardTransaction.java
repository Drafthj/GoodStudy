package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.PayrollDatabase;
import com.draft.agile.chapter.nineteen.classification.HourlyClassification;
import com.draft.agile.chapter.nineteen.classification.PaymentClassification;
import com.draft.agile.chapter.nineteen.bean.TimeCard;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/20
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AddTimeCardTransaction implements Transaction{
    private LocalDateTime date;
    private double hours;
    private int empId;

    public AddTimeCardTransaction(LocalDateTime date, double hours, int empId) {
        this.date = date;
        this.hours = hours;
        this.empId = empId;
    }

    @Override
    public void execute() {
        Employee e = PayrollDatabase.getEmployee(empId);
        if (e != null) {
            PaymentClassification pc = e.getClassification();
            if (pc instanceof HourlyClassification) {
                HourlyClassification hcPc = (HourlyClassification) pc;
                hcPc.addTimeCard(new TimeCard(date, hours));
            } else {
                System.out.println("Tried to add timecard to non-hourly employee");
            }
        } else {
            System.out.println("No such employee");
        }
    }
}
