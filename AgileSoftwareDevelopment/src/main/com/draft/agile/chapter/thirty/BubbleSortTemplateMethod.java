package com.draft.agile.chapter.thirty;

import java.util.Map;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/4/26
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BubbleSortTemplateMethod {
    private SortHandler itsSortHandler;
    int operations = 0;
    public BubbleSortTemplateMethod(SortHandler itsSortHandler) {
        this.itsSortHandler = itsSortHandler;
    }

    public int sort(Object array) {
        itsSortHandler.setArray(array);
        if (itsSortHandler.length() <= 1) {
            return 0;
        }
        for (int i = 0; i < itsSortHandler.length() -1; i++) {
            for (int j = 0; j < itsSortHandler.length() -1;j++) {
                if (itsSortHandler.outOfOrder(j)) {
                    itsSortHandler.swap(j);
                }
            }
        }
        return operations;
    }
}
