package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.pay.DirectMethod;
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
public class ChangeDirectTransaction extends ChangeMethodTransaction {
    private String bank;
    private String account;

    public ChangeDirectTransaction(Integer empId, String bank, String account) {
        super(empId);
        this.bank = bank;
        this.account = account;
    }

    @Override
    protected PaymentMethod getMethod() {
        return new DirectMethod(bank, account);
    }
}
