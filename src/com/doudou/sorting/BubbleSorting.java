package com.doudou.sorting;

/**
 * Created by IntelliJ IDEA.
 * VisuAlgoProject
 * User: Administrator
 * Date: 2018/3/8
 * Time: 16:59
 *
 * @author duandoudou
 */
public class BubbleSorting {

    /**
     * 冒泡排序实现
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
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
