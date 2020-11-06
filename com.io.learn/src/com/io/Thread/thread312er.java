package com.io.Thread;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Meet
 * @Date:2020/8/2 or 16:56
 */
public class thread312er extends JFrame {

    private JPanel contentPane;     //定义面板
    private JTextArea textArea1;        //文本域
    private JTextArea textArea2;        //文本域

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//UI样式
        } catch (Throwable e) {
            e.printStackTrace();
        }
        thread312er frame = new thread312er();      //调用构造方法
        frame.setVisible(true);     //显示窗体
    }

    /*      无参构造方法  */
    public thread312er() {
        /*框架面板*/
        setTitle("单线程与多线程的区别");     //标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         //点击关闭窗体
        setBounds(100, 100, 450, 475);      //位置和窗体宽高
        setLocationRelativeTo(null);                //窗体居中显示
        contentPane = new JPanel();             //实例化面板
        //setBorder：设置边框类型      EmptyBorder：上左下右逆时针方法依次指定四个方向距离边框的空白像素
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));//边框布局
        //setLayout:设置用户界面上的屏幕组件的格式布局       边界布局
        contentPane.setLayout(new BorderLayout(0, 0));//（hgap为横向间距，vgap为纵向间距）
        setContentPane(contentPane);//添加面板到框架   而add则不建议将组建添加面板不能将面板添加到框架

        /*北边按钮面板*/
        JPanel buttonPanel = new JPanel();//实例化一个面板对象
        contentPane.add(buttonPanel, BorderLayout.NORTH);//将 面板添加到框架的北边
        //创建一个具有一行两列横纵间距都为5的网格布局
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        //创建两个按钮
        JButton button1 = new JButton("单线程程序");
        button1.addActionListener(new ActionListener() {    //单击事件
            public void actionPerformed(ActionEvent e) {
                do_button1_actionPerformed(e);
            }
        });
        button1.setFont(new Font("微软雅黑", Font.PLAIN, 16));//设置字体
        buttonPanel.add(button1);                     //将组建添加到 按钮面板

        JButton button2 = new JButton("多线程程序");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_button2_actionPerformed(e);
            }
        });
        button2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        buttonPanel.add(button2);
        /*文本域的面板*/
        JPanel contentPanel = new JPanel();     //实例化面板
        contentPane.add(contentPanel, BorderLayout.CENTER); //将面板放置框架中央
        //创建一个一行两列横纵间距为5的网格布局
        contentPanel.setLayout(new GridLayout(1, 2, 5, 5));

        JScrollPane scrollPane1 = new JScrollPane();        //滚动条插件
        contentPanel.add(scrollPane1);          //滚动条插件添加至 文本域的面板

        textArea1 = new JTextArea();        //实例化文本域
        textArea1.setFont(new Font("微软雅黑", Font.PLAIN, 16));    //设置字体样式
        scrollPane1.setViewportView(textArea1);     //将滚动条插件插入到文本域组件使用
        JScrollPane scrollPane2 = new JScrollPane();        //滚动条插件
        contentPanel.add(scrollPane2);

        textArea2 = new JTextArea();
        textArea2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        scrollPane2.setViewportView(textArea2);
    }

    /**
     * 单线程程序
     * @param e
     */
    protected void do_button1_actionPerformed(ActionEvent e) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append("《Java编程词典》\n");
        }
        for (int i = 0; i < 8; i++) {
            sb.append("《视频学Java》\n");
        }
        textArea1.setText(sb.toString());
    }

    /**
     * 多线程程序
     * @param e
     */
    protected void do_button2_actionPerformed(ActionEvent e) {
        //创建一个和StringBuffer一样的字符串但是和StringBuffer不一样的是他不需要考虑线程安全
        final StringBuilder sb = new StringBuilder();
        new Thread() {  //实例化线程类
            public void run() { //重写run()方法
                for (int i = 0; i < 8; i++) {
                    sb.append("《Java编程词典》\n");
                    textArea2.setText(sb.toString());
                }
            };
        }.start();//开始执行
        new Thread() {
            public void run() {
                for (int i = 0; i < 8; i++) {
                    sb.append("《视频学Java》\n");       //将字符串追加到StringBuilder后面
                    //这里得到的sb是一个对象或者参数类型需要toString装换成字符串
                    textArea2.setText(String.valueOf(sb));   //输出字符串并
                }
            };
        }.start();
    }
}
