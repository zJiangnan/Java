package com.j2008.operatiion;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/28-16:51
 */
public class Ti9_28 {
    /**
     * 程序入口
     *
     * @param args
     */
    public static void main(String[] args) {
        Ti9_28 di = new Ti9_28();
        System.out.println("=======================第二题========================");
//        System.out.println(di.tuzi(12));
        System.out.println("=======================第三题========================");
//        System.out.println(di.ti3(10 * 2));
        System.out.println("=======================第四题========================");
        System.out.println(di.ti4(5));
        System.out.println("=======================第五题========================");
//        di.ti5(3);
        System.out.println("=======================第六题========================");
//        System.out.println(di.ti6(2));

    }

    /* 练习2 ： 一组序列  1 ，1,   2，3,  5  ,  8... n， 第12个数  为多少？ */
    public int tuzi(int tu) {
        if (tu == 1 || tu == 2)
            return 1;
        return tuzi(tu - 1) + tuzi(tu - 2);
    }

    /*  练习3： 1， 3，  5， 7，  9， 11 .  问前10个数的和 */
    public int ti3(int n) {
        if (n % 2 == 0)
            n--;
        if (n == 1)
            return 1;
        else
            return n + ti3(n - 2);
    }

    /* l练习4 ：    前5个阶乘之和     例如 5!+4!+3!+...1! */
    public int ti4(int y) {
        if (y == 1)
            return 1;
        return ti4(y - 1) + ti41(y);
    }

    public int ti41(int n) {
        if (n == 1 || n == 0)
            return 1;
        int s = n * ti41(n - 1);
        return s;
    }

    /* 练习5：定义一个函数，函数有一个整型参数n，
     * 如果参数n为偶数时，调用函数求1/2+1/4+...+1/n,
     * 如果参数n为奇数时，调用函数1/1+1/3+...+1/n
     * */
    public void ti5(int n) {
        if (n % 2 == 0) {           //偶数
            System.out.println(ti51(n));
        } else {                    //奇数
            System.out.println(ti52(n));
        }
    }

    public double ti51(int n) {      //偶数条件
        if (n == 2)
            return 0.5;
        return 1.0 / n + ti51(n - 2);
    }

    public double ti52(int n) {      //奇数条件
        if (n == 1)
            return 1.0;
        return 1.0 / n + ti52(n - 2);
    }

    /* 练习6、 1/1+1/2+2/3+3/5+5/8.。。。前8个数之和。
     *       1-1-2-3-5
     *       1-2-3-5-8
     * */
    public double ti6(int n) {
        double sum = 0.0;
        for (int i = 1; i <= 8; i++) {
            sum += ti61(i) / ti62(i);
        }
        return sum;
    }

    public double ti61(int a) {
        if (a <= 2)
            return 1.0;
        else
            return ti61(a - 2) + ti61(a - 1);
    }

    public static double ti62(double b) {
        if (b < 3)
            return b;
        else
            return ti62(b - 2) + ti62(b - 1);
    }
}
