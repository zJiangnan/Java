package com.j2008.arithmetic;

import java.util.Random;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/24-15:46
 */
public class testArray {
    /**
     * 入口
     * @param args
     */
    public static void main(String[] args) {
        testArray t = new testArray();
//        t.array1();     //数组实例
//        t.array2();     //输出随机数
        System.out.println("" + t.tuzi(24));     //兔子问题
    }
    public void array1(){
        int [] arr = new int[3];
//        给定初始值
        int [] arr2 = new int[]{1,2,3};
//        省略new关键字
        int [] arr3 = {1,2,3};

//        访问元素
        System.out.println("第一个元素" + arr2[0]);
        System.out.println("第三个元素" + arr2[2]);
        System.out.println("数组的长度:" + arr2.length);

        arr[0] = 100;
        arr[1] = 99;
        arr[2] = 98;
//        arr[3] = 98;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("循环输出数组：" + arr[i]);
        }

    }
    public void array2(){
        int arr [] = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100);
            System.out.println("随机数为：" + arr[i]);
        }
    }
    public int tuzi(int tu) {
        if (tu == 1 || tu == 2) {
            return 1;
        }
        return tuzi(tu - 1) + tuzi(tu - 2);
    }
}
