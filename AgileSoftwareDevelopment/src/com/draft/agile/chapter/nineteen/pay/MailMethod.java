package com.draft.agile.chapter.nineteen.pay;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MailMethod implements PaymentMethod {
    private String address;

    public MailMethod(String address) {
        this.address = address;
    }
}
