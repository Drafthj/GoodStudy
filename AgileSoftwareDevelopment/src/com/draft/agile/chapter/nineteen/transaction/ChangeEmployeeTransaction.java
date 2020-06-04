package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.PayrollDatabase;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/3
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class ChangeEmployeeTransaction implements Transaction{
    private Integer empId;

    public ChangeEmployeeTransaction(Integer empId) {
        this.empId = empId;
    }

    protected abstract void change(Employee e);

    @Override
    public void execute() {
        Employee e = PayrollDatabase.getEmployee(empId);
        if(e != null) {
            change(e);
        }
    }
}
