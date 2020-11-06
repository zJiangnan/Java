package cn.echo.ti1102;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName : Ti4
 * @Author : Jiangnan
 * @Date: 2020/11/2 18:54
 * @Description :  4、复制音乐，输出程序消耗了多长时间。
 *                  思路： 读之前记录系统时间,写完之后 又记录一下系统时间,两个只差就是复制时间
 **/
public class Ti4 {
    public static void main(String[] args) {
//        保留开始运行时间
        long start = System.currentTimeMillis();
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("FileData/Lover.flac");
            fw = new FileWriter("D:\\SystemZ\\desktop\\Lover.flac");
            int len = 0;
            char[] c = new char[1024];
            System.out.println("文件复制中。。。。。。");
            while ((len = fr.read(c)) != -1) {
                fw.write(c, 0, len);
            }
            System.out.println("文件复制完成");
            long over = System.currentTimeMillis();
            System.out.println("复制文件使用了：" + (over - start) + "毫秒");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
