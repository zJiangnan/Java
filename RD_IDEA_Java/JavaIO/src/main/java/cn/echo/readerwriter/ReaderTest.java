package cn.echo.readerwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName : ReaderTest
 * @Author : Jiangnan
 * @Date: 2020/11/2 15:29
 * @Description : 字符输入流
 **/
public class ReaderTest {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("FileData/inputstream.txt");
//            读一个字符
//            System.out.println((char)fr.read());
//            System.out.println((char)fr.read());

//          读一个字符数组长度
//            char[] c = new char[10];
//            System.out.println(fr.read(c));
//            System.out.println(new String(c));

//            重置字符流
//            fr.reset();
//            System.out.println((char)fr.read());

//            丢弃字符
            fr.skip(1);
            System.out.println((char)fr.read());

//            是否支持标记字符
            System.out.println(fr.markSupported());

            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
