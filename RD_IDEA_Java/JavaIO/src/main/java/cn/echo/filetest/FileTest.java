package cn.echo.filetest;

import java.io.File;

/**
 * @ClassName : FileTest
 * @Author : Jiangnan
 * @Date: 2020/11/1 16:45
 * @Description : 查看目录及子目录的所有文件
 **/
public class FileTest {
    public static void main(String[] args) {
        File file = new File("E:\\Learn Project\\Learn\\学习资料");
        FileTest ft = new FileTest();
        ft.selectFile(file);
    }
    public void selectFile(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()) {
                System.out.println("文件：" + f.getName());
            }else {
                selectFile(f);
            }
        }
    }
}
