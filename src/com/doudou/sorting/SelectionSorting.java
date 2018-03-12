package com.doudou.sorting;

import com.doudou.util.SortingPrintUtil;

/**
 * Created by IntelliJ IDEA.
 * VisuAlgoProject
 * User: Administrator
 * Date: 2018/3/9
 * Time: 8:28
 *
 * @author duandoudou
 */
public class SelectionSorting {

    /**
     * 选择排序算法实现
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

        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            //选取最小值
            int min = numbers[i];
            //设置初始索引
            int index = i;
            for (int j = i + 1; j < length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    index = j;
                }
            }
            //交换
            if (index != i) {
                int temp = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = temp;
            }

            SortingPrintUtil.print(numbers, i + 1);
        }
    }
}
