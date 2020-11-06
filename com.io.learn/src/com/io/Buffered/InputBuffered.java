package com.io.Buffered;

import java.io.*;

/**
 * @Author: Meet
 * @Date:2020/7/30 or 11:10
 */
public class InputBuffered {
    public static void main(String[] args) {
        File f = new File("E:\\Learn Project\\Book\\jdk1.8中文版.CHM");
        FileInputStream in = null;
        BufferedInputStream bi = null;      //缓冲区字节输入流
        long start = System.currentTimeMillis();        //获取输入流开始时的毫秒数
        try {
            in = new FileInputStream(f);
            bi = new BufferedInputStream(in);       //将文件字节输入流包装成带缓冲区的字节输入流
            byte[] b = new byte[1024];      //将数据装箱的缓冲区
            while (bi.read(b) != -1){

            }
            long end = System.currentTimeMillis();      //获取输入流结束时的毫秒数
            System.out.println("运行开始时间："+start);
            System.out.println("运行结束时间："+end);
            System.out.println("运行时间："+(end - start));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bi != null){
                try {
                    bi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
