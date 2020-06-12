package com.draft.agile.chapter.nineteen.affiliation;

import com.draft.agile.chapter.nineteen.bean.ServiceCharge;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/22
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class UnionAffiliation implements  Affiliation{
    private Integer memberId;
    private Double dues;
    private ServiceCharge serviceCharge;

    public UnionAffiliation(Integer memberId, Double dues) {
        this.memberId = memberId;
        this.dues = dues;
    }

    public ServiceCharge getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(ServiceCharge serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculateDeductions() {
        return dues;
    }
}
