package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.pay.PaymentMethod;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class ChangeMethodTransaction extends ChangeEmployeeTransaction {
    public ChangeMethodTransaction(Integer empId) {
        super(empId);
    }

    @Override
    protected void change(Employee e) {
        e.setMethod(getMethod());
    }

    protected abstract PaymentMethod getMethod();
}
