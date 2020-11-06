package cn.echo.ti1102;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ClassName : Ti2
 * @Author : Jiangnan
 * @Date: 2020/11/2 18:53
 * @Description :  2、用户在控制台输入字符串，将用户输入的字符串保存到E盘下面的a.txt中，当遇见exti，退出程序。
 **/
public class Ti2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        try {
//            续写文件--不覆盖
            fw = new FileWriter("FileData/a.txt", true);
            while (true) {
                System.out.println("请输入存入的字符串：");
                String str = sc.next();
                if (!str.equals("exti")) {
                    fw.write(str);
//                    每次存完后换行
                    fw.write("\r\n");
//                    刷新--每次输入后立即写入文件中，没有刷新则只能在关闭流时才能写入到文件中
                    fw.flush();
                    System.out.println("数据已保存.....");
                } else {
//                    输入exti跳出此循环，否则继续
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
