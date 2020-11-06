package com.io.file;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * @Author: Meet
 * @Date:2020/7/26 or 20:36
 */
public class io294 extends JFrame {
    private JPanel contentPane; // 内容面板
    private JTextField tf_File; // “选择源文件”的文本框
    private JTextField tf_Folder; // “选择目标文件夹”的文本框
    private JButton btn_SearchFile; // “选择源文件”的按钮
    private JButton btn_SearchFolder; // “选择目标文件夹”的按钮
    private JButton btn_Move; // “移动”按钮
    private JButton btn_Closed; // “关闭”按钮
    private JTextArea textArea; // “操作记录”文本域
    private File[] files; // “选择源文件”的数组
    private File dir; // 选中的文件夹

    public static void main(String[] args) {
        io294 frame = new io294(); // 创建“快速移动文件”对象
        frame.setVisible(true); // 使得“快速移动文件”可视
    }

    /**
     * 创建窗体
     */
    public io294() { // “快速移动文件”的构造方法
        setResizable(false); // 不可改变窗体大小
        setTitle("快速批量移动文件"); // 设置窗体的题目
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体的关闭方式
        setSize(500,300); // 设定该窗体的宽、高
        setLocationRelativeTo(null); // 窗体居中
        /**
         * 创建内容面板，用来容纳组件
         */
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        /**
         * 创建字体内容为“选择源文件”的标签
         */
        JLabel lbl_File = new JLabel("选择源文件：");
        lbl_File.setHorizontalAlignment(SwingConstants.TRAILING);
        lbl_File.setFont(new Font("微软雅黑", Font.BOLD, 14));
        lbl_File.setBounds(10, 10, 120, 20);
        contentPane.add(lbl_File);
        /**
         * 创建“浏览”按钮，选择某路径下的文件
         */
        btn_SearchFile = new JButton("浏览");
        btn_SearchFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do_browserButton1_actionPerformed(e); // 调用按钮发生操作时的方法
            } // 为“浏览”按钮添加动作事件的监听
        });
        btn_SearchFile.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btn_SearchFile.setBounds(414, 10, 70, 20);
        contentPane.add(btn_SearchFile);
        /**
         * 创建“选择源文件”的文本框，记录文件名
         */
        tf_File = new JTextField();
        tf_File.setBounds(135, 10, 270, 20);
        contentPane.add(tf_File);
        tf_File.setColumns(10);
        /**
         * 创建字体内容为“选择目标文件夹”的标签
         */
        JLabel lbl_Folder = new JLabel("选择目标文件夹：");
        lbl_Folder.setHorizontalAlignment(SwingConstants.TRAILING);
        lbl_Folder.setFont(new Font("微软雅黑", Font.BOLD, 14));
        lbl_Folder.setBounds(10, 40, 120, 20);
        contentPane.add(lbl_Folder);
        /**
         * 创建字体内容为“选择目标文件夹”的文本框，记录选中文件夹的目录
         */
        tf_Folder = new JTextField();
        tf_Folder.setBounds(135, 40, 270, 20);
        contentPane.add(tf_Folder);
        tf_Folder.setColumns(10);
        /**
         * 创建“浏览”按钮，选择某路径下的文件夹
         */
        btn_SearchFolder = new JButton("浏览");
        btn_SearchFolder.addActionListener(new ActionListener() { // 为“浏览”按钮添加动作事件的监听
            public void actionPerformed(ActionEvent e) {
                do_browserButton2_actionPerformed(e); // 调用按钮发生操作时的方法
            }
        });
        btn_SearchFolder.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btn_SearchFolder.setBounds(414, 40, 70, 20);
        contentPane.add(btn_SearchFolder);
        /**
         * 创建字体内容为“操作记录”的标签
         */
        JLabel lbl_Handler = new JLabel("操作记录：");
        lbl_Handler.setHorizontalAlignment(SwingConstants.TRAILING);
        lbl_Handler.setFont(new Font("微软雅黑", Font.BOLD, 14));
        lbl_Handler.setBounds(10, 140, 120, 20);
        contentPane.add(lbl_Handler);
        /**
         * 创建滚动面板
         */
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(135, 70, 349, 165);
        contentPane.add(scrollPane);
        /**
         * 创建文本域并置于滚动面板中，记录移动文件的过程
         */
        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        /**
         * 创建“移动”按钮，把指定文件移动到指定的文件夹中
         */
        btn_Move = new JButton("移动");
        btn_Move.addActionListener(new ActionListener() { // 为“浏览”按钮添加动作事件的监听
            public void actionPerformed(ActionEvent e) {
                do_moveButton_actionPerformed(e); // 调用按钮发生操作时的方法
            }
        });
        btn_Move.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btn_Move.setBounds(205, 245, 70, 20);
        contentPane.add(btn_Move);
        /**
         * 创建“关闭”按钮，关闭该窗体
         */
        btn_Closed = new JButton("关闭");
        btn_Closed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_closeButton_actionPerformed(e);
            }
        });
        btn_Closed.setFont(new Font("微软雅黑", Font.BOLD, 14));
        btn_Closed.setBounds(345, 245, 70, 20);
        contentPane.add(btn_Closed);
    }

    /**
     * 选择源文件的浏览按钮
     */
    protected void do_browserButton1_actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();// 创建文件选择器
        chooser.setMultiSelectionEnabled(true);// 设置文件多选
        int option = chooser.showOpenDialog(this);// 显示文件打开对话框
        if (option == JFileChooser.APPROVE_OPTION) {
            files = chooser.getSelectedFiles();// 获取选择的文件数组
            tf_File.setText("");// 清空文本框
            StringBuilder filesStr = new StringBuilder();
            for (File file : files) {// 遍历文件数组
                filesStr.append("、" + file.getName());// 连接文件名称
            }
            String str = filesStr.substring(1);// 获取所有文件名称的字符串
            tf_File.setText(str);// 设置文件名称信息到文本框
        } else {
            files = new File[0];
            tf_File.setText("");// 清空文本框
        }
    }

    /**
     * 选择目标文件夹的浏览按钮
     */
    protected void do_browserButton2_actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();// 创建文件选择器
        // 设置选择器只针对文件夹生效
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = chooser.showOpenDialog(this);// 显示文件打开对话框
        if (option == JFileChooser.APPROVE_OPTION) {
            dir = chooser.getSelectedFile();// 获取选择的文件夹
            tf_Folder.setText(dir.toString());// 显示文件夹到文本框
        } else {
            dir = null;
            tf_Folder.setText("");
        }
    }

    /**
     * 关闭按钮的事件处理方法
     */
    protected void do_closeButton_actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    /**
     * 移动按钮的事件处理方法
     */
    protected void do_moveButton_actionPerformed(ActionEvent e) {
        if (files.length <= 0 || dir == null) // 判断文件数组有无元素
            return;
        for (File file : files) { // 遍历文件数组
            File newFile = new File(dir, file.getName()); // 创建移动目标文件
            textArea.append(file.getName() + "\t移动到\t" + dir); // 显示移动记录
            file.renameTo(newFile); // 文件移动
            textArea.append("------完成\n"); // 显示移动完成信息
        }
        // 显示操作完成
        textArea.append("##################操作完成###################\n");
    }


}
