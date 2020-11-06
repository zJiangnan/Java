package com.io.Thread;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @Author: Meet
 * @Date:2020/8/3 or 10:09
 */
public class JFThread extends JFrame implements Runnable {
    private JLabel jl = new JLabel();       //显示文本或图像的标签对象
    private static Thread t;            //线程对象
    private Container c = getContentPane();     //声明容器

    public JFThread(){
        setBounds(300,200,250,100);             //窗体大小位置
        setLocationRelativeTo(null);        //窗体居中
        c.setLayout(null);                  //窗体不适用任何布局管理器
        try {
            Icon icon = new ImageIcon("icon/java.png");      //图片对象
            jl.setIcon(icon);       //将图标添加到jl标签
        }catch (NullPointerException ex){
            System.out.println("图片不存在，请将图标文件icon.png拷贝到data目录下!!!");
            System.exit(0);             //退出程序
        }
        jl.setBounds(10,10,200,50);//设置jl标签面板的位置大小
        c.add(jl);      //将标签面板添加到窗体
        setVisible(true);//窗体可见
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);     //窗体关闭方式
    }

    public static void main(String[] args) {
        JFThread jft = new JFThread();      //实例化一个对象
        t = new Thread(jft);
        t.start();
    }

    @Override
    public void run() {
        int x = 10;
        while(true){
            jl.setBounds(x,10,200,50);//设置jl标签面板的位置大小
            x += 10;
            if (x >= 200){
                x = 10;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
