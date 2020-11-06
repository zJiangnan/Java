package cn.echo.ziptest;

import javafx.beans.binding.When;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @ClassName : ZipStreamTest
 * @Author : Jiangnan
 * @Date: 2020/11/4 10:31
 * @Description : 压缩文件
 **/
public class ZipStreamTest {
    public static void main(String[] args) throws IOException {
//        1、创建文件对象
        File file = new File("FileData/a.txt");
//        2、创建文件的输入流
        FileInputStream fis = new FileInputStream(file);
//        3、创建文件的压缩输出流
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("FileData/a.zip"));
//        4、将指定需要压缩文件的实体---给压缩包中添加文件并可以自定义文件名
        zos.putNextEntry(new ZipEntry("a.txt"));
//        给压缩包设置注释
        zos.setComment("这是压缩包的注释。。。");
//        5、文件复制
        int len = 0;
        byte[] b = new byte[1024];
        while ((len = fis.read(b)) != -1) {
            zos.write(b, 0 ,len);
        }
        System.out.println("文件压缩成功");
//        关闭
        zos.close();
        fis.close();
    }
}
