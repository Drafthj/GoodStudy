package com.draft.agile.chapter.nineteen.transaction;

import com.draft.agile.chapter.nineteen.affiliation.Affiliation;
import com.draft.agile.chapter.nineteen.affiliation.NoAffiliation;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ChangeNoAffiliationTransaction extends ChangeAffiliationTransaction {

    public ChangeNoAffiliationTransaction(Integer empId) {
        super(empId);
    }

    @Override
    protected Affiliation getAffiliation() {
        return new NoAffiliation();
    }
}
