package com.draft.agile.chapter.nineteen.pay;

import com.draft.agile.chapter.nineteen.bean.PayCheck;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class HoldMethod implements PaymentMethod{
    private String address;

    public HoldMethod(String address) {
        this.address = address;
    }

    @Override
    public void pay(PayCheck payCheck) {

    }
}
