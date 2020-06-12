package com.draft.agile.chapter.nineteen.pay;

import com.draft.agile.chapter.nineteen.bean.PayCheck;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DirectMethod implements PaymentMethod {
    private String bank;
    private String account;

    public DirectMethod(String bank, String account) {
        this.bank = bank;
        this.account = account;
    }

    @Override
    public void pay(PayCheck payCheck) {

    }
}
