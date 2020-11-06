package com.io.Buffered;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * @Author: Meet
 * @Date:2020/8/1 or 9:06
 */
public class Find extends JFrame{
    private JPanel contentPane; // 内容面板
    private JTextField chooseTextField; // 记录被选中文件目录的文本框
    private JTextField searchTextField; // 输入关键字的文本框
    private File chooseFile; // 被选中的文件夹
    private JTextArea resultTextArea; // 显示含有关键字的文本内容的文本域

    public static void main(String[] args) {
        try {
                    //原风格com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // 将当前外观设置为Nimbus风格
        } catch (Throwable e) {
            e.printStackTrace();
        }
        Find frame = new Find(); // 创建“搜索文件”对象
        frame.setVisible(true); // 使得“搜索文件”可视
    }

    /**
     * 创建窗体
     */
    public Find() { // “搜索文件”的构造方法
        setTitle("查找文本文件"); // 设置窗体的题目
        ImageIcon ii = new ImageIcon("icon/1.jpg");     //图标路径
        setIconImage(ii.getImage());            //设置图标
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体的关闭方式
        setBounds(100, 100, 450, 300); // 设定该窗体的横、纵坐标，宽、高
        setLocationRelativeTo(null);        //窗体居中
        /**
         * 创建内容面板，设置面板的边距，布局（边界布局），把内容面板放到窗体中
         */
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        /**
         * 创建选择面板，将其置于内容面板的北部
         */
        JPanel choosePanel = new JPanel();
        contentPane.add(choosePanel, BorderLayout.NORTH);
        /**
         * 创建字体内容为“选择索引文件”的标签
         */
        JLabel chooseLabel = new JLabel("选择索引文件：");
        chooseLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        choosePanel.add(chooseLabel);
        /**
         * 创建用来记录被选中文件目录的文本框
         */
        chooseTextField = new JTextField();
        chooseTextField.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        choosePanel.add(chooseTextField);
        chooseTextField.setColumns(10);
        /**
         * 创建字体内容为“选择文件”的按钮，用来触发文件选择器
         */
        JButton chooseButton = new JButton("选择文件");
        chooseButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        chooseButton.addActionListener(new ActionListener() {// 为“选择文件”的按钮添加动作事件的监听
            @Override
            public void actionPerformed(ActionEvent e) {
                do_chooseButton_actionPerformed(e); // 点击“选择文件”的按钮时，开始寻找目标文件
            }
        });
        choosePanel.add(chooseButton);
        /**
         * 创建查询面板，将其置于内容面板的南部
         */
        JPanel searchPanel = new JPanel();
        contentPane.add(searchPanel, BorderLayout.SOUTH);
        /**
         * 创建字体内容为“输入关键字”的标签
         */
        JLabel searchLabel = new JLabel("输入关键字：");
        searchLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        searchPanel.add(searchLabel);
        /**
         * 创建用来输入关键字的文本框
         */
        searchTextField = new JTextField();
        searchTextField.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        searchPanel.add(searchTextField);
        searchTextField.setColumns(10);
        /**
         * 创建字体内容为“开始查找”的按钮，用来查找文本文件中是否包含指定的关键字
         */
        JButton searchButton = new JButton("开始查找");
        searchButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        searchButton.addActionListener(new ActionListener() { // 为“开始查找”的按钮添加动作事件的监听
            public void actionPerformed(ActionEvent arg0) {
                do_searchButton_actionPerformed(arg0); // 点击“开始查找”的按钮时，开始查找文本文件中是否包含指定的关键字
            }
        });
        searchPanel.add(searchButton);
        /**
         * 创建滚动面板，把滚动面板置于内容面板的中间
         */// 为“选择文件”的按钮添加动作事件的监听
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
        /**
         * 创建用来显示含有关键字的文本内容的文本域
         */
        resultTextArea = new JTextArea();
        resultTextArea.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        scrollPane.setViewportView(resultTextArea);
    }

    protected void do_chooseButton_actionPerformed(ActionEvent arg0) {
        JFileChooser fileChooser = new JFileChooser(); // 创建文件选择器，用来显示文件目录
        fileChooser.setFileFilter(new FileNameExtensionFilter("文本文件", "txt")); // 设置当前文件的过滤器，用来指定文件的描述“文本文件”和文件的扩展名“txt”
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY); // 仅显示文件
        fileChooser.setMultiSelectionEnabled(false); // 设置文件选择器，不允许选择多个文件
        int result = fileChooser.showSaveDialog(this); // 显示文件选择对话框
        if (result == JFileChooser.APPROVE_OPTION) { // 判断用户单击的是否为“打开”按钮
            chooseFile = fileChooser.getSelectedFile(); // 获得用户选择的文件夹
            chooseTextField.setText(chooseFile.getAbsolutePath()); // 显示用户选择的文件夹
        }
    }

    protected void do_searchButton_actionPerformed(ActionEvent arg0) {
        if (chooseFile == null) {
            JOptionPane.showMessageDialog(this, "请选择索引文件", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        String keyword = searchTextField.getText(); // 获得用户输入的关键字
        if (keyword.length() == 0) {
            JOptionPane.showMessageDialog(this, "请输入关键字", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(chooseFile); // 利用用户选择的文件创建FileReader对象
            bufferedReader = new BufferedReader(fileReader);
            StringBuilder builder = new StringBuilder(); // 利用StringBuilder对象保存索引
            String temp = null;
            while ((temp = bufferedReader.readLine()) != null) { // 读入文本文件
                builder.append(temp);
                builder.append("\n"); // 在每一行的末尾添加一个分隔符
            }
            String[] rows = builder.toString().split("\n"); // 将索引按换行符分割
            resultTextArea.setText(""); // 清空文本域
            for (String row : rows) { // 遍历读入的文本文件
                if (row.contains(keyword)) { // 判断读入的文本文件是否包含指定的关键字
                    resultTextArea.append(row + "\n"); // 返回结果
                }
            }
            if (resultTextArea.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "没有找到您需要的文件", null, JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close(); // 关闭输入流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close(); // 关闭输入流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
