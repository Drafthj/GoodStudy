package com.draft.agile.chapter.nineteen.bean;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/5
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class PayCheck {
    /**
     * 薪资总额
     */
    private double grossPay;
    /**
     * 扣款
     */
    private double deductions;
    /**
     * 薪资净额
     */
    private double netPay;

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }
}
