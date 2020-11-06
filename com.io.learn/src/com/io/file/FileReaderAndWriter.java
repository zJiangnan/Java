package com.io.file;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author: Meet
 * @Date:2020/7/28 or 13:47
 */
public class FileReaderAndWriter {
    public static void main(String[] args) {
        boolean start = true;       //循环控制
        boolean tai =true;          //控制创建文件
        String strName = null;      //文件名称
        Scanner sc = new Scanner(System.in);        //输入对象
        System.out.print("请输入此次操作的文件名：");
        strName = sc.next();
        while (start){
            File file = new File("data/"+strName+".txt");
            if (!file.exists()){        //判断文件是否存在
                try {
                    if (tai){       //如果进行文件删除功能后则不再执行创建文件操作
                        file.createNewFile();       //不存在则创建
                        System.out.println("\""+strName+".txt\"文件创建成功。。。。。");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("****************************************************************\n");
            System.out.println("输入相应指令：1、写入文件\n\t\t\t2、读取文件\n\t\t\t3、此文件路\n\t\t\t" +
                    "4、重命名\n\t\t\t5、清空文件中的数据信息\n\t\t\t6、删除此操作文件\n\t\t\t7、退出程序径\n");
            System.out.println("****************************************************************");
            System.out.print("请输入：");
            int choice = sc.nextInt();
            if (!tai && choice < 7){       //如果进行文件删除功能后则不能再对文件的其他操作
                System.out.println("文件已删除，对文件操作的功能失效，即将退出！！！");
                try {
                    Thread.sleep(2000);
                    System.exit(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            switch (choice){
                case 1:             //写入文件
                    System.out.println("输入写入的数据：");
                    String str = sc.next();
                    FileWriter fw = null;       //声明字符输出流       写入
                    try {
//                                              第二个参数为true时是不覆盖之前的数据
                        fw = new FileWriter(file,true);
                        fw.write(str+"\r\n");       //加上换行符
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        try {
                            fw.close();     //关闭输出流
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("数据已写入文件中！！！！！！！\n");
                    break;
                case 2:             //读取文件
                    FileReader fr = null;       //声明字符输入流
                    if (file.length() == 0){        //判断文件数据是否为空
                        System.out.println("------------此文件没有数据信息------------");
                        break;
                    }else{
                        try {
                            char[] cbuf = new char[1024];       //创建字符数组用于存储输入流传递的数据
                            fr = new FileReader(file);          //将文件file给FileReader用于读取数据

                            /*  while   */
                            int has = -1;       //初始化已读取的字符数
                            while((has = fr.read(cbuf)) != -1){
                                System.out.println("读取文件的内容：\n\n"+new String(cbuf,0,has)+"\n");
                            }

                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }finally{
                            try {
                                fr.close();     //关闭输入流
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    break;
                case 3:                             //文件路径
                    System.out.println("文件路径："+file.getAbsolutePath());
                    break;
                case 4:                             //重命名
                    System.out.print("请输入新名字：");
                    strName = sc.next();
                    File f = new File("data/"+strName+".txt");
                    String dd = file.renameTo(f)?"成功":"失败";
                    System.out.println("重命名"+dd+"！！！！！！！");
                    break;
                case 5:                             //清空文件数据
                    try {
                        fw = new FileWriter(file);
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("文件中的数据已清空！！！！！！！\n");
                    break;
                case 6:                             //删除
                    System.out.println("文件删除"+(file.delete()?"成功":"失败")+"!!!!!!!!");
                    tai = false;        //文件已删除，循环时就不应该创建
                    break;
                case 7:                             //退出
                    System.out.println("正在退出程序。。。。。。。。。");
                    System.exit(0);     //结束程序
                    break;
                default:
                    System.out.println("输入有效的序号！！！！！！！");
                    break;
            }

        }
    }
}
