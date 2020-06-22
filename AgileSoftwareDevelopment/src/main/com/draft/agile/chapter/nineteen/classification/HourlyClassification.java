package com.draft.agile.chapter.nineteen.classification;

import com.draft.agile.chapter.nineteen.bean.TimeCard;

import java.time.LocalDateTime;
import java.util.HashMap;

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
    private HashMap<LocalDateTime, TimeCard> timeCardMap = new HashMap<>();
    public HourlyClassification(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void addTimeCard(TimeCard timeCard) {
        timeCardMap.put(timeCard.getDate(), timeCard);
    }

    public TimeCard getTimeCard(LocalDateTime dateTime) {
        return timeCardMap.get(dateTime);
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
