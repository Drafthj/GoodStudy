package com.draft.agile.chapter.nineteen.transaction;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/6/3
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ChangeEmployeeNameTransaction extends ChangeEmployeeTransaction {
    private String name;
    public ChangeEmployeeNameTransaction(Integer empId, String name) {
        super(empId);
        this.name = name;
    }

    @Override
    protected void change(Employee e) {
        e.setName(name);
    }
}
