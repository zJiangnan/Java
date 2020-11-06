package cn.echo.filebytestream;

import java.io.*;

/**
 * @ClassName : Copy2
 * @Author : Jiangnan
 * @Date: 2020/11/2 13:44
 * @Description : 复制文件夹
 **/
public class Copy2 {
    public static void main(String[] args) {
        File src = new File("E:\\Learn Project\\Learn\\JAVA\\RD_IDEA_Java\\FileData\\jiang");
        File dis = new File("D:\\SystemZ\\desktop");
        copy(src, dis);
        System.out.println(dis.getAbsolutePath());
        System.out.println("复制完成");
    }

    public static void copy(File src, File dis) {
        File[] srcs = src.listFiles();
//        判断源文件是否存在
        if (src.exists()) {
//            判断被复制的文件是否存在
            if (dis.exists()) {
//                循环源文件夹里所有数据
                for (File file : srcs) {
//                    是文件时
                    if (file.isFile()) {
//                        创建文件的路径
                        System.out.println("创建文件" + file.getName());
                        File disf = new File(dis.getAbsolutePath() + "\\" + file.getName());
                        co(file, disf);
                    } else {
//                        是文件夹时,创建文件夹
//                        新文件的路径是原路径加上文件名字
                        String disName = dis.getAbsolutePath() + "\\" + file.getName();
                        System.out.println("创建文件夹" + disName);
//                        创建文件对象
                        File disFile = new File(disName);
//                        创建文件夹
                        disFile.mkdir();
                        copy(file, disFile);
                    }
                }
            } else {
//                如果需要复制的路径地址不存在需要创建
                File diss = new File(dis.getParentFile().getName());
                diss.mkdir();
                copy(src, diss);
                System.out.println("创建文件路径");
            }
        } else {
            System.out.println("被复制的地址不存在");
        }
    }

    public static void co(File srcFile, File disc) {
        FileInputStream src = null;
        FileOutputStream dis = null;
        try {
            src = new FileInputStream(srcFile);
            dis = new FileOutputStream(disc);
            int len = 0;
//            统计循环次数
            int k = 0;
            byte[] b = new byte[1024];
//            写入--实际读取的长度，为了避免在最后一次写入是除夕拿多余的字符
            while ((len = src.read(b)) != -1) {
                dis.write(b, 0, len);
                k++;
            }
//            System.out.println("写入次数:" + k);
            System.out.println("文件复制成功：" + disc.getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
