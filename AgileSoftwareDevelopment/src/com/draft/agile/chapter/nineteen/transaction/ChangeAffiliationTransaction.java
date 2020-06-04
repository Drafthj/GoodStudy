package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.affiliation.Affiliation;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class ChangeAffiliationTransaction extends ChangeEmployeeTransaction {
    public ChangeAffiliationTransaction(Integer empId) {
        super(empId);
    }

    @Override
    protected void change(Employee e) {
        recordMemberShip(e);
        e.setAffiliation(getAffiliation());
    }

    protected abstract void recordMemberShip(Employee e);
    protected abstract Affiliation getAffiliation();
}
