package com.io.Thread;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Meet
 * @Date:2020/8/3 or 16:39
 */
public class ProgressBar extends JFrame { // 创建“进度条”类继承窗体

    private JPanel contentPane; // 内容面板
    private JProgressBar progressBar; // 进度条
    private JButton btnStart; // 开始按钮

    public static void main(String[] args) {
        ProgressBar progressBar = new ProgressBar(); // 创建进度条窗体属性
        progressBar.setVisible(true); // 使得进度条窗体可视
    }

    /**
     * 创建窗体
     */
    public ProgressBar() { // 进度条窗体的构造方法
        setResizable(false); // 不可改变窗体的大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗体的方式
        setBounds(100, 100, 450, 100); // 设置窗体的横、纵坐标，宽高
        // 内容面板（边界布局）
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        // 按钮面板（流布局）
        JPanel buttonPane = new JPanel();
        contentPane.add(buttonPane, BorderLayout.SOUTH);
        // “开始下载”按钮
        btnStart = new JButton("开始下载");
        btnStart.addActionListener(new ActionListener() { // 为“开始下载”按钮添加动作事件的监听
            public void actionPerformed(ActionEvent e) { // “开始下载”按钮发生操作时
                Progress progress = new Progress(progressBar, btnStart); // 创建实现Runnable接口的“进度”类实例
                Thread thread = new Thread(progress); // 使用实现Runnable接口的“进度”类实例创建Thread类对象
                if (btnStart.getText().equals("开始下载")) { // 如果按钮中的字体内容为“开始下载”
                    btnStart.setEnabled(false); // 禁用“开始下载”按钮
                    thread.start(); // 启用线程
                } else { // 如果按钮中的字体内容为“下载完成”
                    dispose(); // 销毁当前窗体
                    System.exit(0);     //结束进程
                }
            }
        });
        btnStart.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        buttonPane.add(btnStart);
        // 显示进度的进度条
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        contentPane.add(progressBar, BorderLayout.CENTER);
    }

}

class Progress implements Runnable { // 创建“进度”类实现Runnable接口

    JProgressBar jpb; // 进度条
    JButton jb; // 按钮

    int[] values = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100}; // 显示进度条进度的数组

    public Progress(JProgressBar jpb, JButton jb) { // 以进度条、按钮为参数的构造方法，利用构造方法初始化“进度”类中的成员变量
        this.jpb = jpb;
        this.jb = jb;
    }

    @Override
    public void run() { // 线程要执行的任务
        for (int i = 0; i < values.length; i++) { // 遍历数组得到要显示进度条进度的数组元素
            try {
                Thread.sleep(500); // 线程休眠0.5秒
            } catch (Exception e) {
                e.printStackTrace();
            }
            jpb.setValue(values[i]); // 显示进度条进度的元素
        }
        jpb.setIndeterminate(false); // 确定进度的进度条
        jb.setEnabled(true); // 启用按钮
        jb.setText("下载完成"); // 替换按钮中的字体内容
    }
}