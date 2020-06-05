package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.PayrollDatabase;
import com.draft.agile.chapter.nineteen.bean.PayCheck;

import java.time.LocalDate;
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
    private LocalDate date;

    public PayDayTransaction(LocalDate date) {
        this.date = date;
    }

    @Override
    public void execute() {
        List<Integer> employeeIds = PayrollDatabase.getAllEmployeeIds();
        for (Integer empId : employeeIds) {
            Employee e = PayrollDatabase.getEmployee(empId);
            if (e.isPayDay(date)) {
                PayCheck payCheck = new PayCheck();
                e.payDay(payCheck);
                PayrollDatabase.addPayCheck(e, payCheck);
            }
        }
    }
}
