package cn.echo.randomaccessfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName : RandomAccessFileTest
 * @Author : Jiangnan
 * @Date: 2020/11/3 15:30
 * @Description :随机访问流
 **/
public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
//        创建可读流
        RandomAccessFile raf1 = new RandomAccessFile("FileData/b.txt", "r");
//        创建可读可写的流
        RandomAccessFile raf2 = new RandomAccessFile("FileData/c.txt", "rw");
//        读写的过程是一样
        byte[] b = new byte[2048];
        int len = 0;
        while ((len = raf1.read(b)) != -1) {
            raf2.write(b, 0 ,len);
        }
        System.out.println("复制成功");

//        关闭流
        raf2.close();
        raf1.close();
    }

}
