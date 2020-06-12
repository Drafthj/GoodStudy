package com.draft.agile.chapter.nineteen.classification;

import com.draft.agile.chapter.nineteen.bean.TimeCard;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class HourlyClassification implements PaymentClassification {
    private double hourlyRate;
    private TimeCard timeCard;
    public HourlyClassification(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void addTimeCard(TimeCard timeCard) {
        this.timeCard = timeCard;
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
