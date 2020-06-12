package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.PayrollDatabase;
import com.draft.agile.chapter.nineteen.affiliation.Affiliation;
import com.draft.agile.chapter.nineteen.affiliation.UnionAffiliation;
import com.draft.agile.chapter.nineteen.bean.ServiceCharge;

import java.util.Date;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/22
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AddServiceChargeTransaction implements Transaction{
    private Date date;
    private int memberId;
    private Double charge;

    public AddServiceChargeTransaction(Date date, int memberId, Double charge) {
        this.date = date;
        this.memberId = memberId;
        this.charge = charge;
    }

    @Override
    public void execute() {
        Employee e = PayrollDatabase.getEmployee(memberId);
        Affiliation affiliation = e.getAffiliation();
        if (affiliation instanceof UnionAffiliation) {
            UnionAffiliation uaf = (UnionAffiliation) affiliation;
            uaf.setServiceCharge(new ServiceCharge(date, charge));
        }
    }
}
