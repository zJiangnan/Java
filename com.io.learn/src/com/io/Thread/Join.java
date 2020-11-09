package com.io.Thread;

import javax.swing.*;
import java.awt.*;
import java.security.MessageDigest;

/**
 * @Author: Meet
 * @Date:2020/8/4 or 9:03
 */
public class Join extends JFrame {
//    创建两个进程
    private Thread ta = null;
    private Thread tb = null;
//    创建两个进度条
    final JProgressBar p1 = new JProgressBar();
    final JProgressBar p2 = new JProgressBar();
    int c = 0;

    public static void main(String[] args) {
        try {
            //GUI 样式
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        new Join();
    }

    /**
     * 构造方法
     */
    public Join() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //关闭窗体停止运行
        setSize(400, 100);           //窗体大小
        setLocationRelativeTo(null);        //窗体居中
        setVisible(true);               //窗体可见

        //设置两进度条位置
        getContentPane().add(p1, BorderLayout.NORTH);//第一个进度条在北边
        getContentPane().add(p2, BorderLayout.SOUTH);//第二个进度条在南边
        p1.setStringPainted(true);          //显示进度条数字
        p2.setStringPainted(true);

        /**
         * 匿名内部类初始化Thread线程类
         */
        //线程A
        ta = new Thread(new Runnable() {
            int c = 0;

            @Override
            public void run() {
                while (true) {
                    p1.setValue(++c);       //设置进度条当前值
                    try {
                        Thread.sleep(100);      //休眠100毫秒
                        if (c == 25) {
                            tb.join();      //立即暂停线程A继续完成线程B的操作，待线程B完成后继续线程A
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        ta.start();//在构造方法被调用时-启动线程A
        //线程B
        tb = new Thread(new Runnable() {
            int c = 0;

            @Override
            public void run() {
                while (true) {
                    p2.setValue(++c);       //设置进度条当前值
                    try {
                        if (c == 75) {
                            tb.interrupt();     //当进度条为75时中断B进程
                        }
                        Thread.sleep(100);      //休眠100毫秒
                    } catch (InterruptedException e) {
                        //错误信息提示
                        JOptionPane.showMessageDialog(null, "B线程已中断",
                                "警告信息", JOptionPane.WARNING_MESSAGE);
                        System.out.println("B线程中断");
                        break;
                    }
                    //当线程B跑完时跳出循环否则会一直运行下去，线程B则完成不了也就继续不了线程A的操作
                    if (c == 100) {
                        break;
                    }
                }
            }
        });
        tb.start();//在构造方法被调用时-启动线程B
    }
}
