package com.draft.agile.chapter.nineteen.employee;

import com.draft.agile.chapter.nineteen.transaction.Employee;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CommissionedEmployee extends Employee {
    private double monthlySalary;
    private double commissionRate;

    public CommissionedEmployee(int empId, String name, String address) {
        super(empId, name, address);
    }
}
