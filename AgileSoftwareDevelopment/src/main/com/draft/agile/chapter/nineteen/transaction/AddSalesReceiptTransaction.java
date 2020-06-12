package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.PayrollDatabase;
import com.draft.agile.chapter.nineteen.bean.SalesReceipt;
import com.draft.agile.chapter.nineteen.classification.PaymentClassification;
import com.draft.agile.chapter.nineteen.classification.SalariedClassification;

import java.util.Date;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/22
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AddSalesReceiptTransaction implements Transaction{
    private int empId;
    private Date date;
    private Double amount;

    public AddSalesReceiptTransaction(int empId, Date date, Double amount) {
        this.empId = empId;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public void execute() {
        Employee e = PayrollDatabase.getEmployee(empId);
        if (e != null) {
            PaymentClassification classification = e.getClassification();
            if (classification instanceof SalariedClassification) {
                SalariedClassification salariedClassification = (SalariedClassification) classification;
                salariedClassification.setSalesReceipt(new SalesReceipt(date, amount));
            } else {
                System.out.println("Tried to add timecard to non-sales employee");
            }
        } else {
            System.out.println("No such employee");
        }
    }
}
