package com.j2008.testobj;

import java.util.Random;
import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/6-11:59
 */
public class WuZiQi {

    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    public static void main(String[] args) {
        WuZiQi w = new WuZiQi();
        w.arr1();
        w.g();      //关闭扫描器
    }

    public void arr1() {
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
                out(arr);
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
                        out(arr);
                    }
                } while (k);
                pan(arr,'●');       //判断
                pan(arr,'○');       //判断
            } else {
                System.out.println("这个位置已经有别的棋子了，下别的地方吧！");
            }
        }
    }

    public void out(char arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (char x : arr[i])
                System.out.print("  " + x);
            System.out.println();
        }
    }

    public void pan(char arr[][],char r) {
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

    public void g() {
        sc.close();
    }
}
