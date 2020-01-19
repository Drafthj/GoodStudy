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
    private static boolean[] isCrossed;
    private static int[] result;

    private static void initializeArrayOfIntegers(int maxValue) {
        isCrossed = new boolean[maxValue + 1];
        for (int i = 2; i < isCrossed.length; i++) {
            isCrossed[i] = true;
        }
    }

    private static void crossOutMultiples() {
        int maxPrimeFactor = calcMaxPrimeFactor();
        for (int i = 2; i <= maxPrimeFactor; i++) {
            if (notCrossed(i))
                crossOutMultiplesOf(i);
        }
    }

    private static int calcMaxPrimeFactor() {
        Double maxPrimeFactor = Math.sqrt(isCrossed.length) + 1;
        return maxPrimeFactor.intValue();
    }

    private static void crossOutMultiplesOf(int i) {
        for (int multiple = 2 * i; multiple < isCrossed.length; multiple += i) {
            isCrossed[multiple] = true;
        }
    }

    private static boolean notCrossed(int i) {
        return isCrossed[i] == false;
    }

    private static void putUnCrossedIntegersIntoResult() {
        result = new int[numberOfUncrossedIntegers()];
        for(int j = 0,i = 2; i < isCrossed.length; i++) {
            if (notCrossed(i)) {
                result[j++] = i;
            }
        }
    }

    private static int numberOfUncrossedIntegers() {
        int count = 0;
        for (int i = 2; i < isCrossed.length; i++) {
            if (notCrossed(i)) {
                count++;
            }
        }
        return count;
    }
}
