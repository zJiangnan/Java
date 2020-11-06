package cn.echo.ti1103;

import java.io.*;

/**
 * @ClassName : Ti2
 * @Author : Jiangnan
 * @Date: 2020/11/3 19:09
 * @Description : 3. 将5个整数和6个double数写入文件, 然后用另外一个程序读出并显示出来.
 *                  DataOutputStream  写数据类型     循环写    DataInputStream      学循环读
 **/
public class Ti2 {

    public static void main(String[] args) throws IOException {
        System.out.println("----------写入数据----------");
        out();
        System.out.println("----------读取数据----------");
        in();
    }

    /**
     * 写操作
     */
    public static void out() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("FileData/1103Ti2.txt"));
        int k = 1;
        for (int i = 0; i < 5; i++) {
            Integer ig = i;
//            写入数据
            dos.writeInt(ig);
            System.out.println("第" + k + "次写入" + ig);
            k++;
        }
        for (int i = 1; i < 7; i++) {
            Double d = Double.valueOf(i);
            dos.writeDouble(d);
            System.out.println("第" + k + "次写入" + d);
            k++;
        }
//        关闭流
        dos.close();
    }

    /**
     * 读操作
     */
    public static void in() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("FileData/1103Ti2.txt"));
        for (int i = 0; i < 5; i++) {
            System.out.println(dis.readInt());
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(dis.readDouble());
        }
        System.out.println("读取完毕");
    }
}
