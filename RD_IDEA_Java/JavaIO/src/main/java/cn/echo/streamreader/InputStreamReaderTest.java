package cn.echo.streamreader;

import java.io.*;

/**
 * @ClassName : InputStreamReaderTest
 * @Author : Jiangnan
 * @Date: 2020/11/3 14:40
 * @Description :字节流转字符流
 **/
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {
//        创建字节输入流
        InputStream is = new FileInputStream("FileData/recode.txt");
//        创建字节流转字符流 ---将字节流转字符流
        InputStreamReader isr = new InputStreamReader(is);
//        创建缓冲区字符输入流
        BufferedReader br = new BufferedReader(isr);
//        读一行
        String str = null;
        while (( str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
        isr.close();
        is.close();
    }
}
