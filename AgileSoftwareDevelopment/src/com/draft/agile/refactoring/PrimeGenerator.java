package com.draft.agile.refactoring;

/**
 * 重构版本1
 * 把全部功能变成3个分离的功能
 * 1、对所有的变量进行初始化，并做好过滤所需的准备工作
 * 2、执行真正的过滤工作
 * 3、把过滤后的结果存放到一个整形数组中
 * 提取功能迫使函数级的局部变量提升为类级的静态域
 *
 * @author drafthj
 * @date 2020/1/19
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class PrimeGenerator {
    private static int a;
    private static boolean[] f;
    private static int[] primes;
    private static int s;

    public static int[] generatePrimes(int maxValue) {
        if (maxValue < 2)
            return new int[0];
        else {
            initializeSieve(maxValue);
            sieve();
            loadPrimes();
            return primes;
        }

    }

    private static void loadPrimes() {
        int i;
        int j;
        int count = 0;
        for (i = 0; i < s; i++) {
            if(f[i])
                count ++;
        }
        primes = new int[count];
        for (i = 0,j=0; i < s;i++) {
            if (f[i])
                primes[j++] = i;
        }
    }

    private static void sieve() {
        int i;
        int j;
        for (i = 2; i < Math.sqrt(s) + 1; i++) {
            if (f[i]) {
                for (j = 2*i; j< s; j += i) {
                    f[j] = false;
                }
            }
        }
    }

    private static void initializeSieve(int maxValue) {
        s = maxValue + 1;
        f = new boolean[s];
        int i;

        for (i = 0; i < s; i++)
            f[i] = true;

        f[0] = f[1] = false;
    }
}
