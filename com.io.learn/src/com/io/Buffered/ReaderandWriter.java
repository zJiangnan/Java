package com.io.Buffered;

import java.io.*;

/**
 * @Author: Meet
 * @Date:2020/7/31 or 17:06
 */
public class ReaderandWriter {
    public static void main(String[] args) {
        File f = new File("data/Reader.txt");
        FileWriter fw = null;       //文件字符输出流   写入文件
        BufferedWriter bw = null;       //缓冲区字符输出流
        FileReader fr = null;       //文件字符输入流   读取文件
        BufferedReader br = null;       //缓冲区字符输入流
        String s1[] = {"你不喜欢我，", "我一点都不介意。", "因为我活下来，", "不是为了取悦你！"};
        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < s1.length; i++) {
                bw.write(s1[i]);        //将字符数组单个字符串写入文件
                bw.newLine();           //将每次写入的数据以单独的行写入
            }
            System.out.println("数据全部写入文件中。。。。。。。。。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        /*  读取文件  */
        System.out.println("读取到的数据信息：\n");
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String s = null;        //临时存储读取到的行
            int i = 1;      //显示行
            while ((s = br.readLine()) != null) {
                System.out.println("第" + i + "行：" + s);
                i++;
            }
            System.out.println("\n数据读取完毕！！！！！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
