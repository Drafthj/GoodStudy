package com.draft.agile.chapter.thirty;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/4/24
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BubbleSorter {
    static int operations = 0;
    public static int sort(int[] array) {
        operations = 0;
        if (array.length <= 1) {
            return operations;
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1;j++) {
                compareAndSwap(array, j);
            }
        }
        return operations;
    }

    private static void swap(int[] array, int index) {
        int temp = array[index];
        array[index] = array[index+1];
        array[index+1] = temp;
    }

    private static void compareAndSwap(int[] array, int index) {
        if (array[index+1] < array[index]) {
            swap(array, index);
        }
        operations++;
    }

    public static void main(String[] args) {
        int[] array = new int[] {3,4,2};
        System.out.println(sort(array));
        System.out.println(Arrays.toString(array));
    }
}
