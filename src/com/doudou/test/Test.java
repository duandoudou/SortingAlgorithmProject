package com.doudou.test;

import com.doudou.sorting.*;
import com.doudou.util.SortingPrintUtil;

/**
 * Created by IntelliJ IDEA.
 * VisuAlgoProject
 * User: Administrator
 * Date: 2018/3/8
 * Time: 17:26
 *
 * @author duandoudou
 */
public class Test {
    public static void main(String... args) {
        int[] sortTempNums = new int[]{36, 44, 2, 17, 24, 30, 31, 44, 21, 22, 31, 37, 45, 2, 37, 11, 13, 12, 47};

        //冒泡排序
        //BubbleSorting.sort(sortTempNums);

        //SelectionSorting.sort(sortTempNums);

        InsertionSorting.sort(sortTempNums);
    }
}
