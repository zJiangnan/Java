package cn.echo.ziptest;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @ClassName : ZipStreamTest2
 * @Author : Jiangnan
 * @Date: 2020/11/4 10:49
 * @Description :压缩一个文件夹
 **/
public class ZipStreamTest2 {
    public static void main(String[] args) throws IOException {
//        1、创建文件对象
        File file = new File("D:\\SystemZ\\desktop\\jiang副本");
        File[] files = file.listFiles();
        FileInputStream fis;
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("D:\\SystemZ\\desktop\\jiang.zip"));
        for (File f : files) {
           fis = new FileInputStream(f);
           putZip(zos, fis, f.getName());
            System.out.println("压缩成功");
        }
        zos.flush();
        zos.close();
    }

    public static void putZip(ZipOutputStream zos, InputStream fis, String entryName) throws IOException {
//        4、将指定需要压缩文件的实体---给压缩包中添加文件并可以自定义文件名
        zos.putNextEntry(new ZipEntry(entryName));
//        给压缩包设置注释
        zos.setComment("这是压缩包的注释。。。");
//        5、文件复制
        int len = 0;
        byte[] b = new byte[1024];
        while ((len = fis.read(b)) != -1) {
            zos.write(b, 0, len);
        }
        System.out.println("文件压缩成功");
        
        fis.close();
    }
}
