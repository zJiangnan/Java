package com.j2008.arithmetic;

import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/23-14:24
 */
public class testwhile {
    /**
     * 入口
     * @param args
     */
    public static void main(String[] args) {
        testwhile t = new testwhile();
//        t.while1();     //while
//        t.while2();     //计算1-100的偶数之和
//        t.while3();     //计算一个数的阶乘
//        System.out.println("sum = " + t.while31(3));  //递归算法
//        t.dowhile();        //dowhile
//        t.for1();       //for
        t.for2();       //for2
    }
    /* while */
    public void while1() {
//        计算1~100的和
        int n = 1;      //控制
        int sum = 0;    //累加的和
        while(n < 101) {
            sum += n;
            n++;        //循环控制
        }
        System.out.println(n);
        System.out.println("sum = " + sum);
    }
    /* 计算1-100的偶数之和 */
    public void while2() {
        int i = 1;
        int sum = 0;
        while(i < 101) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("sum = " + sum);
    }
    /* 计算一个数的阶乘 例如：10的阶乘 10*9*8.。。 */
    public void while3() {
        Scanner sc = new Scanner(System.in);
        int x = 3;
//        x = sc.nextInt();
        int i = 1;
        while (x > 0){
            i *= x;
            x--;
        }
        System.out.println("sum = " + i);
    }

    /* 递归计算：计算一个数的阶乘 例如：10的阶乘 10*9*8.。。 */
    public int while31(int x) {
        if(x == 1){
            return 1;
        }
        return x *  while31(x -1);
    }

    public void dowhile() {
        int i = 0;
        do{
            System.out.println("i = " + i);
            i++;
        }while(i < 10);
    }

    /* for */
    public void for1(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }

    /* for */
    public void for2(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }

}
