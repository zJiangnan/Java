package cn.echo.filetest;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName : TestFile
 * @Author : Jiangnan
 * @Date: 2020/11/1 15:30
 * @Description : File类学习
 **/
public class TestFile {
    public static void main(String[] args) throws IOException {
//        创建一个文件对象
        File file = new File("JavaIO/src/file/myfile.txt");
//        判断文件是否存在
        if (!file.exists()) {
//            创建文件或目录
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        }else {
//            获取文件大小
            System.out.println(file.length());
//            获取文件名字
            System.out.println(file.getName());
//            获取文件父路径
            System.out.println(file.getParent());
//            获取文件绝对路径
            System.out.println(file.getAbsolutePath());
//            获取文件文件修改时间    毫秒数
            System.out.println(file.lastModified());
//            判断是否是文件
            System.out.println(file.isFile());
//
        }
    }
}
