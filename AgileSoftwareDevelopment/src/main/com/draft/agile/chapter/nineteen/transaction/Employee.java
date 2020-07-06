package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.affiliation.Affiliation;
import com.draft.agile.chapter.nineteen.bean.PayCheck;
import com.draft.agile.chapter.nineteen.schedule.Schedule;
import com.draft.agile.chapter.nineteen.classification.PaymentClassification;
import com.draft.agile.chapter.nineteen.pay.PaymentMethod;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Employee {
    private int empId;
    private String name;
    private String address;

    private Schedule schedule;
    private PaymentClassification classification;
    private PaymentMethod method;
    private Affiliation affiliation;

    public Employee(int empId, String name, String address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }
    public boolean isPayDay(LocalDateTime dateTime) {
        return schedule.isPayDate(dateTime);
    }

    public void payDay(PayCheck payCheck) {
        double grossPay = classification.calculatePay(payCheck);
        double deductions = affiliation.calculateDeductions(payCheck);
        double netPay = grossPay - deductions;
        payCheck.setGrossPay(grossPay);
        payCheck.setDeductions(deductions);
        payCheck.setNetPay(netPay);
        method.pay(payCheck);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public PaymentClassification getClassification() {
        return classification;
    }

    public void setClassification(PaymentClassification classification) {
        this.classification = classification;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }

    public LocalDateTime getPayPeriodStartDate(LocalDateTime dateTime) {
        return schedule.getPayPeriodStartDate(dateTime);
    }

}
