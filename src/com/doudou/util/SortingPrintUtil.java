package com.doudou.util;

/**
 * Created by IntelliJ IDEA.
 * VisuAlgoProject
 * User: Administrator
 * Date: 2018/3/9
 * Time: 8:40
 *
 * @author duandoudou
 * 排序数组打印工具类
 */
public class SortingPrintUtil {
    public static void print(int[] numbers, int i) {
        System.out.println("第"+i+"次排序结果："+joinArray(numbers));
    }

    public static void print(int[] numbers) {
        System.out.println(joinArray(numbers));
    }

    private static String joinArray(int[] numbers) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
            if (i != numbers.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
