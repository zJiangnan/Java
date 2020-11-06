package com.io.file;

import java.io.*;

/**
 * @Author: Meet
 * @Date:2020/7/27 or 15:59
 */
public class InAndOutputStream {
    public static void main(String[] args) {
        /*   写入文件   */
        File file = new File("data/1.txt");
        FileOutputStream out = null;
        try {
//            将file对象用于实例化文件字节输出流类  向文件中写入数据
            out = new FileOutputStream(file,true);
            String context = "就算生命像尘埃，分不开\n";
//            将字符串转为字节数组
            byte buy[] = context.getBytes();
            out.write(buy);
            out.close();        //关闭流
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        /*   读取文件   */
        FileInputStream in = null;
        try {
//            将file对象用于实例化文件字节输入流类  将文件数据读取出来
            in = new FileInputStream(file);
            byte byt[] = new byte[1024];        //缓冲区，用于存储内容的字节数组
            int len = in.read(byt);         //将读取到的数据字节数给len
//                                              将字节转为字符串并输出0到len个字符
            System.out.println("文件中的信息是："+new String (byt,0,len));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
