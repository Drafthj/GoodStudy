package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.PayrollDatabase;
import com.draft.agile.chapter.nineteen.bean.PayCheck;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/5
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class PayDayTransaction implements Transaction{
    private LocalDateTime dateTime;

    public PayDayTransaction(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public void execute() {
        List<Integer> employeeIds = PayrollDatabase.getAllEmployeeIds();
        for (Integer empId : employeeIds) {
            Employee e = PayrollDatabase.getEmployee(empId);
            if (e.isPayDay(dateTime)) {
                LocalDateTime periodStartTime = e.getPayPeriodStartDate(dateTime);
                PayCheck payCheck = new PayCheck(dateTime, periodStartTime);
                e.payDay(payCheck);
                PayrollDatabase.addPayCheck(empId, payCheck);
            }
        }
    }
}
