package com.draft.agile.chapter.nineteen.bean;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/20
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SalesReceipt {
    private LocalDateTime dateTime;
    private double amount;

    public SalesReceipt(LocalDateTime dateTime, double amount) {
        this.dateTime = dateTime;
        this.amount = amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public double getAmount() {
        return amount;
    }
}
