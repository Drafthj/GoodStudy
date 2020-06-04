package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.PayrollDatabase;
import com.draft.agile.chapter.nineteen.affiliation.Affiliation;
import com.draft.agile.chapter.nineteen.affiliation.UnionAffiliation;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ChangeMemberTransaction extends ChangeAffiliationTransaction {
    private Integer memberId;
    private Double dues;

    public ChangeMemberTransaction(Integer empId, Integer memberId, Double dues) {
        super(empId);
        this.memberId = memberId;
        this.dues = dues;
    }

    @Override
    protected void recordMemberShip(Employee e) {
        PayrollDatabase.addUnionMember(memberId, e);
    }

    @Override
    protected Affiliation getAffiliation() {
        return new UnionAffiliation(memberId, dues);
    }
}
