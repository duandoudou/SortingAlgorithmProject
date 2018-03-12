package com.doudou.sorting;

import com.doudou.util.SortingPrintUtil;

/**
 * Created by IntelliJ IDEA.
 * VisuAlgoProject
 * User: Administrator
 * Date: 2018/3/10
 * Time: 20:45
 *
 * @author duandoudou
 */
public class InsertionSorting {
    /**
     * 插入排序实现
     *
     * @param numbers 排序数组
     */
    public static void sort(int[] numbers) {
        //判断是否是空数组
        if (numbers == null || numbers.length == 0) {
            return;
        }
        //判断是否是单元素数组
        if (numbers.length == 1) {
            return;
        }
        //获取长度
        int length = numbers.length;
        int sortedIndex = 0;

        for (int i = 1; i < length; i++) {
            int current = numbers[i];
            for (int j = sortedIndex; j >= 0; j--) {
                if (numbers[j] > current) {
                    numbers[j + 1] = numbers[j];
                    numbers[j] = current;
                } else {
                    break;
                }
            }
            sortedIndex++;
            SortingPrintUtil.print(numbers, i);
        }
    }
}
