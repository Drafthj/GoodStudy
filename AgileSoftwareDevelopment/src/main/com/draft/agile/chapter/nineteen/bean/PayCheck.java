package com.draft.agile.chapter.nineteen.bean;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.HashMap;

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
     * 支付时间
     */
    private LocalDateTime payDate;

    /**
     * 被支付的周期所开始的时间
     */
    private LocalDateTime payPeriodStartDate;

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

    public PayCheck(LocalDateTime payPeriodStartDate, LocalDateTime payDate) {
        this.payDate = payDate;
        this.payPeriodStartDate = payPeriodStartDate;
    }

    private HashMap<String, String> fields = new HashMap<>();

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

    public void setField(String fieldName, String value) {
        fields.put(fieldName, value);
    }

    public String getField(String fieldName) {
        return fields.get(fieldName);
    }

    public LocalDateTime getPayDate() {
        return payDate;
    }

    public void setPayDate(LocalDateTime payDate) {
        this.payDate = payDate;
    }

    public LocalDateTime getPayPeriodStartDate() {
        return payPeriodStartDate;
    }

    public void setPayPeriodStartDate(LocalDateTime payPeriodStartDate) {
        this.payPeriodStartDate = payPeriodStartDate;
    }

    public LocalDateTime getPayPeriodEndDate() {
        return payDate;
    }
}
