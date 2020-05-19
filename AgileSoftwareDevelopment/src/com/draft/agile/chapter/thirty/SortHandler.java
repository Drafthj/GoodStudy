package com.draft.agile.chapter.thirty;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/4/26
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface SortHandler {
    void setArray(Object array);
    int length();
    boolean outOfOrder(int index);
    void swap(int index);
}
