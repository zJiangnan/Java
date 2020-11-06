package com.j2008.testobj;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/6-16:40
 */
public class erFen {

    public static void main(String[] args) {
        erFen f = new erFen();
        int[] a = new int[20];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        f.pai(a);
        System.out.println(Arrays.toString(a));
        System.out.println("输入查找的值：");
        int x = sc.nextInt();
        System.out.println(f.bySelect(a, x));
    }

    /**
     * 折半查找：
     *      最小下标：low = 0
     *      最大下标：hight = 数组长度 - 1
     *      中间下标：mid = (最小下标 + 最大下标) / 2
     *      如果查找值等于中间值，直接返回
     *      如果查找值小于中间值，在左边，将中间下标 + 1给最小下标
     *      如果查找值大于中间值，在右边，将中间下标 - 1给最大下标
     * @param a
     * @param value
     * @return
     */
    public int bySelect(int[] a, int value) {
        int low = 0;
        int hight = a.length - 1;
        while (low <= hight) {          //循环条件：最小下标 <= 最大下标
            int mid = (low + hight) / 2;
            System.out.println("中间值：" + mid);
            if (a[mid] == value)        //如果等于值就返回
                return mid;
            if (a[mid] < value)         //
                low = mid + 1;
            else
                hight = mid - 1;
        }
        return -1;
    }

    public int[] pai(int a[]) {
        for (int i = 0; i < a.length; i++)
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        return a;
        }
}
