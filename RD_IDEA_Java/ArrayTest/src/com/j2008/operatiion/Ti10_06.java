package com.j2008.operatiion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description: 十月六号作业
 * @Date:2020/10/6-18:15
 */
public class Ti10_06 {

    //    创建扫描器
    Scanner sc = new Scanner(System.in);
    //    创建随机对象
    Random r = new Random();

    /**
     * 程序入口
     *
     * @param args
     */
    public static void main(String[] args) {
        Ti10_06 t = new Ti10_06();
        System.out.println("================第一题=================");
//        t.ti1();
        System.out.println("================第二题=================");
//        t.ti2();
        System.out.println("================第三题=================");
//        t.ti3();
        System.out.println("================第四题=================");
        t.ti4();
    }

    /**
     * 五子棋案例
     */
    public void ti1() {
        char[][] arr = new char[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '+';
                System.out.print("  " + arr[i][j]);
            }
            System.out.println();
        }
        while (true) {
//            玩家下棋
            System.out.println("落子吧，少年(输入0~19之前的坐标)：");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            if (arr[x1][y1] == '+') {
                arr[x1][y1] = '●';
                ti1out(arr);
                System.out.println("等待电脑下棋");
                try {
                    Thread.sleep(1000);         //休眠1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                电脑下棋
                boolean k = true;
                do {
                    int x2 = r.nextInt(19);
                    int y2 = r.nextInt(19);
                    if (arr[x2][y2] == '+') {
                        arr[x2][y2] = '○';
                        k = false;
                        ti1out(arr);
                    }
                } while (k);
                ti1pan(arr, '●');       //判断
                ti1pan(arr, '○');       //判断
            } else {
                System.out.println("这个位置已经有别的棋子了，下别的地方吧！");
            }
        }
    }

    public void ti1out(char arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (char x : arr[i])
                System.out.print("  " + x);
            System.out.println();
        }
    }

    public void ti1pan(char arr[][], char r) {
        for (int i = 0; i < arr.length; i++) {
//            左对齐
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < 16 && i < 16) && arr[i][j] == r &&
                        (arr[1 + i][1 + j] == r
                                && arr[2 + i][2 + j] == r
                                && arr[3 + i][3 + j] == r
                                && arr[4 + i][4 + j] == r)) {
                    System.out.println(r + "获胜了");
                    System.exit(0);
                }
            }
//            横向对齐
            for (int j = 0; j < arr[i].length; j++) {
                if (j < 16 && arr[i][j] == r &&
                        arr[i][1 + j] == r
                        && arr[i][2 + j] == r
                        && arr[i][3 + j] == r
                        && arr[i][4 + j] == r) {
                    System.out.println(r + "获胜了");
                    System.exit(0);
                }
            }
//            竖向对齐
            for (int j = 0; j < arr[i].length; j++) {
                if (i < 16 && arr[i][j] == r &&
                        arr[1 + i][j] == r
                        && arr[2 + i][j] == r
                        && arr[3 + i][j] == r
                        && arr[4 + i][j] == r) {
                    System.out.println(r + "获胜了");
                    System.exit(0);
                }
            }
//            右对齐
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if ((i < 16 && j < 16) && arr[i][j] == r &&
                        arr[1 + i][arr[i].length - 2 - i] == r
                        && arr[2 + i][arr[i].length - 3 - i] == r
                        && arr[3 + i][arr[i].length - 4 - i] == r
                        && arr[4 + i][arr[i].length - 5 - i] == r) {
                    System.out.println(r + "获胜了");
                    System.exit(0);
                }
            }
        }
    }

    /**
     * 2、完成二分查找案例
     */
    public void ti2() {
        int[] a = new int[20];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        ti2pai(a);
        System.out.println(Arrays.toString(a));
        System.out.println("输入查找的值：");
        int x = sc.nextInt();
        System.out.println(ti2bySelect(a, x));
    }

    /**
     * 折半查找：
     * 最小下标：low = 0
     * 最大下标：hight = 数组长度 - 1
     * 中间下标：mid = (最小下标 + 最大下标) / 2
     * 如果查找值等于中间值，直接返回
     * 如果查找值小于中间值，在左边，将中间下标 - 1给最小下标
     * 如果查找值大于中间值，在右边，将中间下标 + 1给最大下标
     *
     * @param a     数组
     * @param value 需要查找的值
     * @return
     */
    public int ti2bySelect(int[] a, int value) {
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

    public int[] ti2pai(int a[]) {
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

    /**
     * 3、在中文环境下，有字符串，将其每个字节的数据相加求和。
     */
    public void ti3() {
        System.out.println("输入中文字符串：");
        String a = sc.next();
        System.out.println("一共有" + a.length() + "字符");
        System.out.println("字节长度为：" + a.getBytes().length);
    }

    /**
     * 4、求矩阵的和：
     * 10, 20, 30, 40
     * 05,  0,   1,  0
     * 39, 40, 56, 78
     * 34, 90,  1,  1
     * +
     * 18, 29, 30, 40
     * 1,   0,  1,  0
     * 0,  40, 56, 78
     * 7,  90,  1,  1
     */
    public void ti4() {
        int[][] arr1 = {{10, 20, 30, 40}, {05, 0, 1, 0}, {39, 40, 56, 78}, {34, 90, 1, 1}};
        int[][] arr2 = {{18, 29, 30, 40},{1,   0,  1,  0},{0,  40, 56, 78},{7,  90,  1,  1}};
        System.out.println("矩阵的和为：" + (sumarr(arr1) + sumarr(arr2)));

    }
    public int sumarr(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int x : arr[i])
                sum += x;
        }
        return sum;
    }

}
