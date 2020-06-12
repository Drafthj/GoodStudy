package com.draft.agile.chapter.nineteen.classification;

import com.draft.agile.chapter.nineteen.bean.SalesReceipt;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SalariedClassification implements PaymentClassification {
    private double salary;
    private SalesReceipt salesReceipt;
    public SalariedClassification(double salary) {
        this.salary = salary;
    }

    public SalesReceipt getSalesReceipt() {
        return salesReceipt;
    }

    public void setSalesReceipt(SalesReceipt salesReceipt) {
        this.salesReceipt = salesReceipt;
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
