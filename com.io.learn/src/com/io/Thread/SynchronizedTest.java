package com.io.Thread;

import java.util.Scanner;

/**
 * @Author: Meet
 * @Date:2020/8/5 or 9:27
 */
public class SynchronizedTest implements Runnable {
    private int piao = 10;      //票数

    public static void main(String[] args) {
        SynchronizedTest s = new SynchronizedTest();
        Thread t1 = new Thread(s, "售票机1---");
        Thread t2 = new Thread(s, "售票机2---");
        Thread t3 = new Thread(s, "窗口处---");
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {           //同步代码块 ----使所有进程同步
                if (piao > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "出售一张票，总票数为：" + --piao);
                } else {
                    System.out.println("已无票售");
                    System.exit(0);     //结束进程
                }
            }
        }
    }
}
