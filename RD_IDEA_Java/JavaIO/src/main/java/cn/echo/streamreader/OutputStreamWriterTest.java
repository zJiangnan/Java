package cn.echo.streamreader;

import java.io.*;

/**
 * @ClassName : OutputStreamWriterTest
 * @Author : Jiangnan
 * @Date: 2020/11/3 14:47
 * @Description :字符流转字节流
 **/
public class OutputStreamWriterTest {
    public static void main(String[] args) throws IOException {
//        创建文件字节输出流
        FileOutputStream fs = new FileOutputStream("FileData/b.txt");
//        将文件字节输出流转字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(fs, "UTF-8");
//        创建缓冲区字符输出流
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("你好");
//        换行
        bw.newLine();
        bw.write("再见");

//        关闭流--- 不关闭不会写入到文件
        bw.close();
        osw.close();
        fs.close();
    }
}
