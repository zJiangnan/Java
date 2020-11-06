package com.j2008.testobj;

import java.util.Random;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:    二维数组学习
 * @Date:2020/10/6-10:37
 */
public class erArray {
    public static void main(String[] args) {
        erArray era = new erArray();
        era.arr1();
    }
    public void arr1 () {
        int[][] arr = new int[5][5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(100);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("======================");
        int min = arr[0][0];
        int max = arr[0][0];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > min)
                    min = arr[i][j];
                if (arr[i][j] < max)
                    max = arr[i][j];
                if (i == j)
                    sum1 += arr[i][j];
            }
            sum2 += arr[i][arr[i].length - 1 - i];
        }
        System.out.println("最大数:" + min + "\t\t" + "最小数:" + max);
        System.out.println("对角线1和：" + sum1);
        System.out.println("对角线2和：" + sum2);
        System.out.println("对角线的和：" + (sum1 + sum2));
    }
}
