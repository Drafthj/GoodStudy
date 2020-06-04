package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.pay.HoldMethod;
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
public class ChangeHoldTransaction extends ChangeMethodTransaction {
    private String address;

    public ChangeHoldTransaction(Integer empId, String address) {
        super(empId);
        this.address = address;
    }

    @Override
    protected PaymentMethod getMethod() {
        return new HoldMethod(address);
    }
}
