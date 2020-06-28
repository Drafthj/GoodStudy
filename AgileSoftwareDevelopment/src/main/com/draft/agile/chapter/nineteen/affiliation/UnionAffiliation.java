package com.draft.agile.chapter.nineteen.affiliation;

import com.draft.agile.chapter.nineteen.DateUtil;
import com.draft.agile.chapter.nineteen.bean.PayCheck;
import com.draft.agile.chapter.nineteen.bean.ServiceCharge;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/22
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class UnionAffiliation implements Affiliation {
    private Integer memberId;
    private Double dues;
    private HashMap<LocalDateTime, ServiceCharge> serviceChargeHashMap = new HashMap<>();

    public UnionAffiliation(Integer memberId, Double dues) {
        this.memberId = memberId;
        this.dues = dues;
    }

    public ServiceCharge getServiceCharge(LocalDateTime dateTime) {
        return serviceChargeHashMap.get(dateTime);
    }

    public void addServiceCharge(ServiceCharge serviceCharge) {
        serviceChargeHashMap.put(serviceCharge.getDateTime(), serviceCharge);
    }

    @Override
    public double calculateDeductions(PayCheck pc) {
        double total = 0;
        total += numberOfFridaysInPayPeriod(pc.getPayPeriodStartDate(), pc.getPayPeriodEndDate()) * dues;
        for (ServiceCharge serviceCharge : serviceChargeHashMap.values()) {
            if (DateUtil.isBetween(serviceCharge.getDateTime(), pc.getPayPeriodStartDate(), pc.getPayPeriodEndDate())) {
                total += serviceCharge.getCharge();
            }
        }
        return total;
    }

    public int numberOfFridaysInPayPeriod(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        int fridays = 0;
        for (LocalDateTime dateTime = startDateTime; dateTime.compareTo(endDateTime) <= 0; dateTime.plusDays(1)) {
            if (DayOfWeek.FRIDAY.equals(dateTime.getDayOfWeek())) {
                fridays++;
            }
        }
        return fridays;
    }
}
