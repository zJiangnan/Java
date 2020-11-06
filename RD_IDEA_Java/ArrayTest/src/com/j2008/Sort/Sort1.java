package com.j2008.Sort;

import java.util.Arrays;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:排序
 * @Date:2020/9/29-15:44
 */
public class Sort1 {
    public static void main(String[] args) {
        Sort1 s = new Sort1();
//        s.bubble();         //冒泡
//        s.select();         //选择
        s.insert();         //插入
    }

    /**
     * 冒泡排序：
     * 待比较的序列：4,7,2,9,6
     * 第一轮    i = 0    j = 5-1-i=4     表示第一轮需要比较四次才能选出第一大大值    4<7 (7<2) 7<9 (9<6) 4 2 7 6 9 得到第一大数：9
     * 第二轮    i = 1    j = 5-1-i=3     表示第二轮需要比较三次才能选出第二大的值    (4<2) 4<7 (7<6) 9   2 4 6 7 9 得到第二大数：7
     * 第三轮    i = 2    j = 5-1-2=2     表示第三轮需要比较两次才能选出第三大的值    2<4 4<6 7 9         2 4 6 7 9 得到第三大数：6
     * 第四轮    i = 3    j = 5-1-3=1     表示第四轮需要比较一次得到倒数第二大的值    2<4 6  7  9         2 4 6 7 9 得到倒数第二数：4
     * 排序完成
     * 第一层循环(一共排多少轮) 元素个数-1
     * 第二层排序(每轮比较次数) 元素个数-1-轮数
     */
    public void bubble() {
//        创建待排序的数组
        int[] arr = {27, 48, 92, 47, 92, 48, 10, 23, 54};
        int t = 0;      //垃圾桶
//        外层循环-循环的轮数
        for (int i = 0; i < arr.length; i++) {
//            内层循环-两两对比选出最大的数
//                    arr.length-1-i 的含义:将数组的长度-1-i得到的是每一轮需要比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
//                将第j个数和j + 1相比较如果小于就交换，一轮下来选出最大的元素
                if (arr[j + 1] < arr[j]) {
//                    小于就交换他们的元素
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     *  选择排序：
     *  待比较的序列：4,7,2,9,6
     *  i=轮数        min代表最小数的下标     j代表将每轮每一个元素和min最小数比较取比min还小的数
     *  int min = i;        //表示将0给min假设第一个为最小值
     *  第一轮 i=0 min=0   j=0 数组从j开始循环比较min下标的值如果小于就将j给min让min始终保持数列中最小值下标，直到j循环结束第一轮找出最小值将最小值给下标i也就是第0个
     *  第二轮 i=1 min=1   j=1 循环j和min比较 得到将剩下序列的最小值将最小值给下标i也就是第1个
     */
    public void select () {
//        创建待排序的数组
        int[] arr = {27, 48, 92, 47, 92, 48, 10, 23, 54};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min])       //找到最小数
                    min = j;                  //保存最小下标的索引
            }
//            此时的min就是这一轮的最小数将它给下标i就是小到大排序
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     *  插入排序：
     */
    public void insert () {
//        创建待排序的数组
        int[] arr = {27, 48, 92, 47, 92, 48, 10, 23, 54};
        int current;
        for (int i = 0; i < arr.length - 1; i++) {
            current = arr[i + 1];
            int perIndex = i;
            while (perIndex >= 0 && current < arr[perIndex]) {
                arr[perIndex + 1] = arr[perIndex];
                perIndex--;
            }
            arr[perIndex + 1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
    public void insert2 () {
        int [] array = {27, 48, 92, 47, 92, 48, 10, 23, 54};
        // 外层循环循环  每一个数的比较次数
        for(int j=0;j<array.length-1;j++) {
            int temp = 0;
            for (int i = 1+j; i > 0; i--) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
