package cn.echo.ziptest;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * @ClassName : ZipInputStreamTest
 * @Author : Jiangnan
 * @Date: 2020/11/4 11:21
 * @Description : 解压输入流
 **/
public class ZipInputStreamTest {
    public static void main(String[] args) throws IOException {
//        1、创建ZipInputStream
        ZipInputStream zis = new ZipInputStream(new FileInputStream("D:\\SystemZ\\desktop\\jiang.zip"));
//        2、创建Zip的FIle对象
        ZipFile zf = new ZipFile("D:\\SystemZ\\desktop\\jiang.zip");
//        获取注释
        zf.getComment();
//        3、获取zip文件中的实体
        ZipEntry en = null;
        InputStream is = null;
        while ((en = zis.getNextEntry()) != null) {
            System.out.println("文件名----" + en.getName() + "-----" + en.isDirectory());
//            4、获取每一个en的输入流（关键）---getEntry()通过实体对象
            is = zf.getInputStream(en);
//            5、复制文件
            copy(is, "D:\\SystemZ\\desktop\\jiang", en.getName());
        }
//            关闭流
        is.close();
        zf.close();
        zis.close();
    }
    /**
     * 通过输入流复制文件到指定目录下
     *
     * @param is
     * @param path
     * @param filename
     */
    public static void copy(InputStream is, String path, String filename) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(path + File.separator + filename);
        int len = 0;
        byte[] b = new byte[1024];
        while ((len = is.read(b)) != -1) {
            fos.write(b, 0, len);
        }
        System.out.println("文件解压成功");
//        关闭
        fos.close();
        is.close();
    }
}
