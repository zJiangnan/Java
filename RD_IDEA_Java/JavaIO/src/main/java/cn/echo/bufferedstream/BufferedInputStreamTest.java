package cn.echo.bufferedstream;

import java.io.*;

/**
 * @ClassName : BufferedInputStreamTest
 * @Author : Jiangnan
 * @Date: 2020/11/3 10:50
 * @Description : 缓冲字节输入流
 **/
public class BufferedInputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("FileData/a.txt");
        BufferedInputStream bis = new BufferedInputStream(is);
//        是否支持mark 或 reset
        System.out.println(bis.markSupported());
//        读取操作时---pos标记
//        输出1   ------读取一次pos标记1
        System.out.println((char) + bis.read());
//        后退多少个字节-----往前回退(后面读取后流是不可以逆的，mark会退回到1的后面)
//          参数：限制回退的范围--缓冲大小的意思，也就是说mark(3)就只能让流向前流三个超出则会失效
//        --BufferedInputStream超出也不会失效，因为BufferedInputStream有自己的缓冲区 只要不超过自己的缓冲区就不会失效
//        bis.mark(4);
//        输出2       -----在mark执行后读取4次
        System.out.println((char) + bis.read());
//        输出3-4-5
        System.out.println((char) + bis.read());
        bis.mark(4);
        System.out.println((char) + bis.read());
//        --- 此时pos等于5          ----读取了5次
        System.out.println((char) + bis.read());
//        重置---重置到mark的指定位置，当mark的参数为4时，就是mark能回退流的位置的范围，超出则会失效
        bis.reset();
//        输出2---- 因为是读取1后回退到1之后的位置，如果mark在第三次读取时，就会回退到第三次之后。
        System.out.println("重置后----" + (char) + bis.read());

//        调用复制文件方法
        copy("FileData/Lover.flac", "D:\\SystemZ\\desktop\\Lover.flac");

        bis.close();
        is.close();
    }

    /**
     * 复制文件（大文件适用）
     * @param src       源文件
     * @param disc      目标地址
     * @throws IOException  IO异常
     */
    public static void copy(String src, String disc) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(disc));

//        字节数组越大消耗时间越少----内存占用越大
        byte[] b = new byte[2048];
        int len = 0;
//        开始复制的时间戳
        long sta = System.currentTimeMillis();
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0 ,len);
        }
//        结束复制时的时间戳
        long ove = System.currentTimeMillis();
        System.out.println("时间消耗：" + (ove - sta));
//        关闭流--如果存储处理流和简单流时，可以只关闭处理流，JVM会自动关闭简单流
        bis.close();
        bos.close();
    }
}
