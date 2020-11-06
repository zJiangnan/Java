package cn.echo.ti1101;

import java.io.File;

/**
 * @ClassName : Ti38
 * @Author : Jiangnan
 * @Date: 2020/11/1 19:18
 * @Description :
 **/
public class Ti38 {
    public static void main(String[] args) {
        File file = new File("E:\\Learn Project\\Learn\\JAVA\\RD_IDEA_Java\\z");
        Ti38 t = new Ti38();
        t.del(file);
    }
    public void del(File f) {
        if (f.exists()) {
            File[] fs = f.listFiles();
            if (fs.length <= 0) {
                System.out.println("此文件路径下没有文件");
                System.exit(0);
            }
            for (File file : fs) {
                if (file.isFile()) {
                    System.out.println("删除文件：" + file.getName());
                    file.delete();
                } else {
//                    删除子文件
                    del(file);
//                    删除子文件夹
                    System.out.println("删除文件夹：" + file.getName());
                    file.delete();
                }
            }
        } else {
            System.out.println("此文件夹不存在");
        }
    }
}
