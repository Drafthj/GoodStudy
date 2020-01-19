package com.draft.agile.refactoring;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/1/19
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class PrimeGenerator_2 {
    private static boolean[] f;
    private static int[] result;

    private static void initializeArrayOfIntegers(int maxValue) {
        f = new boolean[maxValue + 1];
        f[0] = f[1] = false;
        for (int i = 2; i < f.length; i++) {
            f[i] = true;
        }
    }
}
