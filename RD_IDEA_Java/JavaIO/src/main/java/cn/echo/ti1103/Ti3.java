package cn.echo.ti1103;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName : Ti3
 * @Author : Jiangnan
 * @Date: 2020/11/3 19:30
 * @Description : 4. 从控制台输入数据，按如下格式保存到文件中， 直到用户输入QUIT为止：
 *                  【2008-10-10 23:12:10】input your name pls(模拟的数据):
 *                  【2008-10-10 23:12:10】hello world:
 **/
public class Ti3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        创建缓冲区字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("FileData/1103Ti3.txt"));
        while (true) {
            System.out.println("请输入需要保存的值：");
            String str = sc.next();
            if(!str.equals("quit")) {
//                拼接时间
                Date date = new Date();
                String datestr = date.toLocaleString();
                str = "【 " + datestr + " 】" + "input your name pls:" + str;
//                一次写入一行的写入文件中中
                bw.write(str);
//                换行
                bw.newLine();
//                刷新
                bw.flush();
            }else {
                System.out.println("结束输入!!!");
                break;
            }
        }
//        关闭流
        bw.close();
    }
}
