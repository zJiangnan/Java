package cn.echo.ti1103;

import java.io.*;
import java.util.Date;

/**
 * @ClassName : Ti1
 * @Author : Jiangnan
 * @Date: 2020/11/3 18:47
 * @Description : 2. 在一个目录下创建一个文本文件,并向文件里写入当前的创建时间,要求文件名的格式为 yyyyMMddhhmmssSSS.txt
 *                  字符流,文件需要重命名
 **/
public class Ti1 {
    public static void main(String[] args) throws IOException {
//        创建当前时间
        Date date = new Date();
//        格式化时间
        String datestr = date.toLocaleString();
//        创建文件
        File file = new File("FileData/Ti1.txt");
        file.createNewFile();
        System.out.println("创建文件：" + file.getAbsolutePath());
//        重命名
        File newfile = new File("FileData/yyyyMMddhhmmssSSS.txt");
//        重命名后新文件会是newfile文件而不再是file文件
        boolean b = file.renameTo(newfile);
        System.out.println("文件重命名状态：" + b);
        System.out.println("文件重命名为：" + file.getAbsolutePath());
//        创建文件字符输出流
        FileWriter fw = new FileWriter(newfile);
//        写入文件
        fw.write(datestr);
//        关闭流
        fw.close();
    }
}
