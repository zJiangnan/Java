package com.j2008.operation;

import java.util.Random;
import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/22-16:35
 */
public class Ti9_22 {

    /**
     * 程序入口
     *
     * @param args
     */
    public static void main(String[] args) {
        Ti9_22 t = new Ti9_22();
        System.out.println("==========第一题==========");
        System.out.println("\t\t随机三个100到200之间的整数x,y,z，请把这三个数由小到大输出。");
        t.Di1();
        System.out.println("==========第二题==========");
        System.out.println("\t\t输出100到200之间9的倍数的数");
        t.Di2();
        System.out.println("==========第三题==========");
        System.out.println("\t\t输出50到150之间7的倍数的数，并统计一共有多少个。");
        t.Di3();
        System.out.println("==========第四题==========");
        System.out.println("\t\t用户输入一个整数，然后程序计算出1到这个数的和。");
        t.Di4();
        System.out.println("==========第五题==========");
        System.out.println("\t\t1用户输入两个整数，然后程序计算出这两个数之间的和。");
        t.Di5();
    }

    /**
     * 1、随机三个100到200之间的整数x,y,z，请把这三个数由小到大输出
     */
    public void Di1() {
        Random r = new Random();        //生成随机数
        int x = r.nextInt(100) + 100;
        int y = r.nextInt(100) + 100;
        int z = r.nextInt(100) + 100;
        int t;      //垃圾桶
        if (x > y) {        //利用倒水问题解决交换问题
            t = x;
            x = y;
            y = t;
        }
        if (x > z) {
            t = x;
            x = z;
            z = t;
        }
        if (y > z) {
            t = y;
            y = z;
            z = t;
        }
        System.out.println(x + ">" + y + ">" + z);
    }

    /**
     * 2、输出100到200之间9的倍数的数
     */
    public void Di2() {
        for (int i = 100; i < 200; i++) {       //循环100~200之间的数
            if (i % 9 == 0) {       //和9求余  等于0就输出这个数
                System.out.println(i + "这个数是9的倍数");
            }
        }
    }

    /**
     * 3、输出50到150之间7的倍数的数，并统计一共有多少个。
     */
    private void Di3() {
        int j = 0;      //计数器  用于统计一共多少个7的倍数的数
        for (int i = 50; i <= 150; i++) {       //循环这个区间
            if (i % 7 == 0) {               //和7求余
                j++;                        //如果能被7整除就自加
            }
        }
        System.out.println("一共：" + j + "个");
    }

    /**
     * 4、用户输入一个整数，然后程序计算出1到这个数的和。
     */
    public void Di4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个正整数：");
        int num = sc.nextInt();                 //输入这个数
        int sum = 0;                            //结果
        for (int i = 1; i <= num; i++) {        //循环1到输入的这个数的区间
            sum += i;                           //将他们累加起来
        }
        System.out.println("1~" + num + "的和为：" + sum);
    }

    /**
     * 5、用户输入两个整数，然后程序计算出这两个数之间的和。
     */
    public void Di5() {
        Scanner sc = new Scanner(System.in);
//        输入两个整数
        System.out.print("输入一个正整数：");
        int num1 = sc.nextInt();
        System.out.print("再输入一个正整数：");
        int num2 = sc.nextInt();
        int sum = 0;        //结果
//        此处判断式如果第一次输入大于第二次的就会无法循环的问题
        if (num1 > num2) {
            for (; num2 <= num1; num2++) {
                sum += num2;
            }
            System.out.println("你输入的两个数之和为：" + sum);
        } else {
            for (; num1 <= num2; num1++) {
                sum += num1;
            }
            System.out.println("你输入的两个数之和为：" + sum);
        }
    }
}
