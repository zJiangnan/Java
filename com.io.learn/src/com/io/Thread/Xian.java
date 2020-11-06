package com.io.Thread;

/**
 * @Author: Meet
 * @Date:2020/8/2 or 14:58
 */
public class Xian extends Thread {
    public static void main(String[] args) {
        Thread ta = new ThreadA();
        ta.start();
        Thread tb = new ThreadB();
        tb.start();
    }
}
class ThreadA extends Thread{
    @Override
    public void run() {
        for (int i = 0;i <= 10;i++){
            System.out.println("我是ThreadA的第"+i+"输出");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadB extends Thread{
    @Override
    public void run() {
        for (int i = 0;i <= 10;i++){
            System.out.println("我是ThreadB的第"+i+"输出");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}