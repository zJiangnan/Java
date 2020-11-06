package com.io.file;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Meet
 * @Date:2020/7/27 or 11:12
 */
public class io295 {
    public static void main(String[] args) {
        String path = "data/test";
        for (int i = 0; i < 10; i++) {
            File file = new File(path + "/" + i);       //i个循环文件
//                文件不存在时
            if (!file.exists()){
                file.mkdirs();      //创建文件夹并创建不存在的父级文件夹
                System.out.println(file.getName()+"文件夹创建成功！！！");
            }else{      //文件存在时
                System.out.println(file.getName()+"文件夹已存在。。。。。");
                //System.exit(0);     //关闭程序
            }
        }
        System.out.println("\n\n\t\t\t正在打开此盘符以查看。。。。。。");
        try {
            Thread.sleep(1000);     //让程序睡眠三秒等待用户查看输出信息
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File f = new File("data");      //打开绝对路径
        try {
            Runtime.getRuntime().exec(
                    "rundll32 SHELL32.DLL,ShellExec_RunDLL "
                            + "Explorer.exe /select," + f.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        输出data文件夹下的所有文件名称
        String[] fs = f.list();
        for (String fo : fs) {
            System.out.println(fo);
        }
    }
}
