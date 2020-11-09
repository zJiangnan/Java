package cn.echo.ti1104;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName : Ti1
 * @Author : Jiangnan
 * @Date: 2020/11/6 21:44
 * @Description : 2. 监控目录中的所有子文件，针对每一个子文件开启一条监控线程，当文件被 修改了，
 * 则显示当前被修改的问 及那名，同时显示最近一次修改的时间sleep(2000)
 **/
public class Ti1 {

    public static void main(String[] args) {

    }


    class xian implements Runnable {

        @Override
        public void run() {
            File file = new File("FileData");
            File[] files = file.listFiles();
            int length = files.length;
            long[] time = new long[length];
//            保存所有初始状态的文件时间
            for (int i = 0; i < files.length; i++) {
                time[i] = files[i].lastModified();
            }

        }
    }
}
