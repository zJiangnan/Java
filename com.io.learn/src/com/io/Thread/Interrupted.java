package com.io.Thread;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Meet
 * @Date:2020/8/4 or 9:40
 */
public class Interrupted extends JFrame {
    Thread t;       //创建线程

    public static void main(String[] args) {
        new Interrupted();
    }

    public Interrupted() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //关闭窗体停止运行
        setSize(200, 100);           //窗体大小
        setLocationRelativeTo(null);        //窗体居中
        setVisible(true);               //窗体可见

        final JProgressBar jp = new JProgressBar();
        getContentPane().add(jp, BorderLayout.NORTH);//第一个进度条在北边
        jp.setStringPainted(true);          //显示进度条数字

        t = new Thread() {
            int c = 0;

            @Override
            public void run() {
                while (true) {
                    jp.setValue(++c);   //进度条当前值
                    try {
                        if (c == 15) {
                            interrupt();
                        }
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println("线程中断");
                        System.exit(0);     //结束进程
                    }
                }
            }
        };
        t.start();      //启动线程
    }
}
