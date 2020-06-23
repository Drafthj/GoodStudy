package com.draft.agile.chapter.nineteen.classification;

import com.draft.agile.chapter.nineteen.bean.PayCheck;
import com.draft.agile.chapter.nineteen.bean.SalesReceipt;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CommissionClassification implements PaymentClassification {
    private double salary;
    private double commissionRate;
    private Map<LocalDateTime, SalesReceipt> salesReceiptMap = new HashMap<>();

    public CommissionClassification(double salary, double commissionRate) {
        this.salary = salary;
        this.commissionRate = commissionRate;
    }

    public void addSalesReceipt(SalesReceipt salesReceipt) {
        salesReceiptMap.put(salesReceipt.getDateTime(), salesReceipt);
    }

    public SalesReceipt getSalesReceipt(LocalDateTime dateTime) {
        return salesReceiptMap.get(dateTime);
    }

    @Override
    public double calculatePay(PayCheck payCheck) {
        return 0;
    }
}
