package com.j2008.operation;

import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/24-18:17
 */
public class Ti9_24 {

    /**
     * 入口
     *
     * @param args
     */
    public static void main(String[] args) {
        Ti9_24 t = new Ti9_24();
        System.out.println("================第一题==================");
        t.ti1();
        System.out.println("================第二题==================");
//        t.ti2();
        System.out.println("================第三题==================");
        System.out.println(t.ti3(24));
        t.ti31();
        System.out.println("================第四题==================");
        t.ti4();
    }

    /* 1.将一个数组中值=0的项去掉,将不为0的值存入一个新的数组,比如:
        int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        生成的新数组为:
        int b[]={1,3,4,5,6,6,5,4,7,6,7,5} */
    public void ti1() {
        int a[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int b[] = new int[20];
        int j = 0;              //b数组的下标
        for (int i = 0; i < a.length; i++) {            //遍历第一个数组所有数
            if (a[i] != 0) {            //将第一个数组不等于0的元素给b数组
                b[j] = a[i];
                j++;                    //如果b数组里被赋值一个数就将b数组的下标+1
            }
        }
        for (int x : b) {               //for遍历所有b数组循环输出
            if (x > 0)                  //因为后面b数组后的元素没有赋值所以是0就不输出
                System.out.print(x + "\t");
        }
        System.out.println();
    }

    /* 2、题目：输入某年某月某日，判断这一天是这一年的第几天？ */
    public void ti2() {
        int tian = 0;       //输出天数
        boolean run;    //判断是否为闰年
        Scanner sc = new Scanner(System.in);
//        输入年月日
        System.out.println("输入年份:");
        int n = sc.nextInt();
        System.out.println("输入月份:");
        int y = sc.nextInt();
        System.out.println("输入天数:");
        int r = sc.nextInt();
//        判断是否输入正确的值
        if (y > 0 && y < 13 && r > 0 && r < 32) {
//            判断年份是否是闰年
            if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
                run = true;
            } else {
                run = false;
            }
//            将月份放入switch
            switch (y) {
                case 1:
                    tian = r;       //如果是一月直接输出天数
                    break;
                case 2:
//                    run为true为闰年，false为平年
                    if (run) {
                        if (r < 30) {
//                            加上一月的31天
                            tian = r + 31;
                        } else {
                            System.out.println("闰年的二月只有29天");
                        }
                    } else {
                        if (r < 29) {
                            tian = r + 31;
                        } else {
                            System.out.println("平年的二月只有28天");
                        }
                    }
                    break;
                case 3:
                    if (run) {
//                        闰年多一天
                        tian = r + 61;
                    } else {
//                        平年少一天
                        tian = r + 60;
                    }
                    break;
                case 4:
                    if (run) {
                        tian = r + 91;
                    } else {
                        tian = r + 90;
                    }
                    break;
                case 5:
                    if (run) {
                        tian = r + 121;
                    } else {
                        tian = r + 120;
                    }
                    break;
                case 6:
                    if (run) {
                        tian = r + 152;
                    } else {
                        tian = r + 151;
                    }
                    break;
                case 7:
                    if (run) {
                        tian = r + 181;
                    } else {
                        tian = r + 182;
                    }
                    break;
                case 8:
                    if (run) {
                        tian = r + 213;
                    } else {
                        tian = r + 212;
                    }
                    break;
                case 9:
                    if (run) {
                        tian = r + 244;
                    } else {
                        tian = r + 243;
                    }
                    break;
                case 10:
                    if (run) {
                        tian = r + 274;
                    } else {
                        tian = r + 273;
                    }
                    break;
                case 11:
                    if (run) {
                        tian = r + 305;
                    } else {
                        tian = r + 304;
                    }
                    break;
                case 12:
                    if (run) {
                        tian = r + 335;
                    } else {
                        tian = r + 334;
                    }
                    break;
            }
            if (tian > 0) {
                System.out.println("这是今年的第" + tian + "天");
            }
        } else {
            System.out.println("输入错误，程序退出!");
            System.exit(0);
        }
    }

    /* 3、题目：古典问题：有一对兔子，
   从出生后第3个月起每个月都生一对兔子
   假如兔子都不死，问两年内兔子总数为多少？ */
    /* 递归算法 */
    public int ti3(int tu) {
        if (tu == 1 || tu == 2)
            return 1;
        return ti3(tu - 1) + ti3(tu - 2);           //tu - 1 就是上一个月的兔子数 + tu - 2 是上上月份的兔子总数
    }

    public void ti31() {
        int a = 1;          //第一个月
        int b = 1;          //第二个月
        int zan;            //如果是求四月份的兔子总数那zan就是2月份的兔子总数，zan就是暂存上上个月的兔子总数
        int yue = 24;       //月数
        for (int i = 3; i <= 24; i++) {     //因为一二月份的兔子总数都是1所以从三月开始循环
            zan = b;
            b = a + b;                      //b也就是当月兔子总数
            a = zan;
        }
        System.out.println(b);
    }

    /* 4、题目：统计101-200之间有多少个素数，并输出这些所有素数。 */
    public void ti4() {
        for (int i=101;i<200;i++){
            boolean s=true;     //判断是否是素数的值
            for (int j=2;j<i;j++){          //将这个数从2开始遍历取模如果有一个数被取模等于0，那这个数就不是素数
                if (i%j==0){
                    s=false;        //如果赋值成功代表i不是素数
                }
            }
            if (s){                 //如果s没有被赋值为false那i这个数就是素数
                System.out.println(i);
            }
        }
    }
}
