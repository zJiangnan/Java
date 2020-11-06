package cn.echo.filebytestream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName : FIleOutputStreamTest
 * @Author : Jiangnan
 * @Date: 2020/11/2 10:52
 * @Description : 文件字节输出流
 **/
public class FIleOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("FileData/inputstream.txt", false);
        String str = "你妈炸了";
//        写出一个字符串--读以字节读写也以字节写入
        fos.write(str.getBytes("UTF-8"));
//        写出指定长度--从数组的第几个到第几个
        fos.write(str.getBytes("UTF-8"), 0 ,6);
//        清空缓存
        fos.flush();
        fos.close();
        System.out.println("写入成功");
    }
}
