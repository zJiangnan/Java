package cn.echo.filebytestream;

import java.io.*;
import java.util.Arrays;

/**
 * @ClassName : FileInputStreamTest
 * @Author : Jiangnan
 * @Date: 2020/11/2 9:52
 * @Description : 文件字节流输入流
 **/
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        /*FileInputStream fis = new FileInputStream("FileData/inputstream.txt");
        System.out.println((char)fis.read());
        System.out.println((char) fis.read());
        System.out.println(fis.read());*/
//        read();
        read2();
    }

    public static void read() throws IOException {
        File file = new File("FileData/inputstream.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] b = new byte[10];
//        返回实际读取的长度--而数据存放在b数组中
//        int len = fis.read(b);
//        System.out.println(len);
//        System.out.println(Arrays.toString(b));

        StringBuffer sb = new StringBuffer();
//        每次读取的差高难度---b：存放数据的数组
        int len = 0;
        while ((len = fis.read(b)) != -1) {
            sb.append(new String(b, 0, len));
        }
        System.out.println(sb);

//        关闭流
        fis.close();
    }

    public static void read2() throws IOException {
        InputStream is = new FileInputStream("FileData/inputstream.txt");
//        丢弃前面两个字节
        is.skip(2);
        System.out.println((char)is.read());
//        还剩多少个字节
        System.out.println(is.available());
        byte[] b = new byte[10];
        int len = is.read(b, 0, 5);
        System.out.println(Arrays.toString(b));
        System.out.println(new String(b));

        is.close();
    }
}
