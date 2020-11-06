package com.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: Meet
 * @Date:2020/7/26 or 10:20
 */
public class test {
    public static void main(String[] args) {
        /*System.out.println("你好，世界！");
        File file = new File("data/1.txt");
        System.out.println("文件名："+file.getName());
        System.out.println("文件绝对路径："+file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println("文件长度："+file.length()+"字节");
        String fi = file.isFile()?"文件":"文件夹";
        System.out.println("文件类型:"+fi);
        String den = file.isHidden()?"是的":"没有";
        System.out.println("文件是否被隐藏："+den);
        System.out.println("文件是否可被写入："+file.canWrite());
        File docx = new File("data/2.docx");
        try {
            docx.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件创建失败！！！！！！！！");
        }
        System.out.println("创建成功！！！");
        String docxdel =  docx.delete()?"成功":"失败"+"!!!!!!!";
        System.out.println("删除docx文件是否成功："+docxdel);*/

        /**
         * 调用电脑的文件管理器   并打开此项目路径
         */

        File f=new File("");
        try {
            Runtime.getRuntime().exec(
                    "rundll32 SHELL32.DLL,ShellExec_RunDLL "
                            + "Explorer.exe /select," + f.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
