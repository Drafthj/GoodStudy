package com.draft.agile.chapter.nineteen.classification;

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

    public CommissionClassification(double salary, double commissionRate) {
        this.salary = salary;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}