package cn.echo.ti1101;

import javafx.scene.input.DataFormat;

import java.io.File;
import java.util.Calendar;

/**
 * @ClassName : Ti39
 * @Author : Jiangnan
 * @Date: 2020/11/1 20:00
 * @Description :
 **/
public class Ti39 {
    int k = 0;
    public static void main(String[] args) {
        File file = new File("E:\\Learn Project\\Learn\\JAVA\\RD_IDEA_Java\\z");
        Ti39 t = new Ti39();
        t.selectFile(file);
        System.out.println("此路径下有：" + t.k + "个文件");
    }
    public void selectFile(File file) {
        if (file.exists()) {
            File[] files = file.listFiles();
            Calendar ca = Calendar.getInstance();
            for (File f : files) {
                if(f.isFile()) {
                    System.out.println("---------------------------------");
                    System.out.println("新产生的文件：" + f.getName());
                    ca.setTimeInMillis(f.lastModified());
                    System.out.println("文件创建时间：" + ca.getTime());
                    System.out.println("文件   大小：" + f.length());
                    k++;
                }else {
                    selectFile(f);
                }
            }
        }else {
            System.out.println("指定文件路径不存在");
        }
    }
}
