package cn.echo.datastream;

import java.io.*;

/**
 * @ClassName : DataOutputStreamTest
 * @Author : Jiangnan
 * @Date: 2020/11/3 13:47
 * @Description : 数据字节输出流
 **/
public class DataOutputStreamTest {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("FileData/a.txt");
        DataOutputStream dos = new DataOutputStream(os);
//        写入一个int类型值--一次写入4个字节
        dos.writeInt(100);
//        写入一个布尔值
        dos.writeBoolean(true);

//        关闭流
        dos.close();

//        读数据
        InputStream is = new FileInputStream("FileData/a.txt");
//        读取数据需要按照写的顺序来读取
        DataInputStream dis = new DataInputStream(is);
//        写一次4个字节，读同样读4个字节
        System.out.println("读取的int类型：" + dis.readInt());
        System.out.println("读到的Boolean类型：" + dis.readBoolean());

//        关闭流
        dis.close();
    }
}
