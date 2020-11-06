package cn.echo.filebytestream;

import java.io.*;

/**
 * @ClassName : Copy
 * @Author : Jiangnan
 * @Date: 2020/11/2 11:40
 * @Description : 复制一个文件
 **/
public class Copy {
    public static void main(String[] args) {
        File src = new File("FileData/640.png");
        File dis = new File("FileData/741.png");
//        copyFile(src, dis);
        copyFile2(src, dis);
    }

    public static void copyFile(File srcFile, File disc) {
//            源文件输入流
        FileInputStream src = null;
//            目标文件
        FileOutputStream dis = null;
        try {
            src = new FileInputStream(srcFile);
            dis = new FileOutputStream(disc);
//            读取文件
            int n = 0;
            while ((n = src.read()) != -1) {
//                单个字节读取
                dis.write(n);
            }
            System.out.println("复制成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dis.close();
                src.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void copyFile2(File srcFile, File disc) {
        FileInputStream src = null;
        FileOutputStream dis = null;
        try {
            src = new FileInputStream(srcFile);
            dis = new FileOutputStream(disc);
            int len = 0;
//            统计循环次数
            int k = 0;
            byte[] b = new byte[1024];
//            写入--实际读取的长度，为了避免在最后一次写入是除夕拿多余的字符
            while ((len = src.read(b)) != -1) {
                dis.write(b, 0 ,len);
                k++;
            }
            System.out.println("写入次数:" + k);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                dis.close();
                src.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
