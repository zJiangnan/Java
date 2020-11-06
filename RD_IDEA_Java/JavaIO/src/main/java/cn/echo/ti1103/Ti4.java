package cn.echo.ti1103;

import java.io.*;

/**
 * @ClassName : Ti4
 * @Author : Jiangnan
 * @Date: 2020/11/3 19:51
 * @Description : 5. 基于RandomAccessFile实现文件断点拷贝,要求实现在文件拷贝时，如果由于一些外在因素(断电，异常结束)
 * 导致拷贝终止，要求下一次拷贝时直接从上一次断开的位置进行拷贝， 从而避免从头开始拷贝？（提 示:getFilePointer()、seek()）
 **/
public class Ti4 {
    public static void main(String[] args) throws IOException {
//        创建可读流
        RandomAccessFile raf1 = new RandomAccessFile("FileData/1103Ti4.txt", "r");
//        创建可读可写的流
        File file = new File("FileData/1103Ti4c.txt");
//        RandomAccessFile raf2 = new RandomAccessFile(file, "rw");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file, true));
//        先判断文件是否存在如果不存在直接口碑，如果存储在获取文件大小
        long len = 0;
        if(file.exists()) {
            len = file.length();
        }
//        将光标pos移动到复制时断电的时候
        raf1.seek(len);
//        再次读文件内容
        int n = 0;
        byte[] b = new byte[1024];
        while ((n = raf1.read(b)) != -1) {
//            raf2.write(n);
            bos.write(b, 0 ,n);
            bos.flush();
        }
//        关闭流
        bos.close();
        raf1.close();
    }
}
