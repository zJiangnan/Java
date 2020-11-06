package com.io.Buffered;

import java.io.*;

/**
 * @Author: Meet
 * @Date:2020/7/30 or 16:03
 */
public class OutBuffered {
    public static void main(String[] args) {
        File f = new File("data/缓冲区字节输入输出流.txt");
        FileOutputStream fo = null;     //文件字节输出流
        BufferedOutputStream bo = null;     //缓冲区字节输出流
        FileInputStream fi = null;      //文件字节输入流
        BufferedInputStream bi = null;      //缓冲区字节输入流
        String data = "没想到吧\n";       //数据
        /*  缓冲区字节输出流-写入数据  */
        try {
            fo = new FileOutputStream(f);      //实例化一个文件字节输出流并使其编辑文件而非重写文件
            bo = new BufferedOutputStream(fo);      //将文件字节输出流包装成缓冲区字节输出流
            byte[] bout = data.getBytes();             //将字符串转换为字节数组
            bo.write(bout);                            //将字节数组写入到缓冲区字节输出流并写入其包装好的文件里
            /**
             *          bo.flush();的flush方法详解：
             *  好比这里有五箱货，货车能装10箱，不用等待货车装满就可以运货
             *  意思是就算 b 这个字节数组没有装满数据还是会被写入到文件中去，这就省去了循环将字节写入文件中
             *  因为 b 这个字节数组如果没有写满直接写入文件中时没有填满的数据将会以空格代替
             *  循环就是一个个有效数据进行写入，直接使用这个方法就不会出现空格填满的时候
             */
            bo.flush();              //刷新，强制将缓冲区里的数据写入文件，即使缓冲区没有被写满
            System.out.println("写入成功！！！");
            /*  缓冲区字节输入流-读取数据  */
            fi = new FileInputStream(f);        //实例化一个文件字节输入流
            bi = new BufferedInputStream(fi);   //实例化一个带缓冲区的字节输入流并，就是将文件字节输入流包装成缓冲区字节输入流
            byte[] binp = new byte[1024];       //缓冲区的字节数组，将获取到的字节存进去
                /*  read方法返回一个int类型的值 返回的是字节长度  */
            int len = bi.read(binp);        //将读取到字节数组的长度给len
            /*  直接new一个String对象他会将字节转字符的    参数：需要转换的字节数组    从哪个字节开始     到那个字节结束  */
            System.out.println("读取到数据：\n\n\n"+new String(binp,0,len));
                /* 输出一个多少字节。UTF-8编码格式：空格占1个字节，中文占3个，英文占1个 */
            System.out.println(len);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bo != null){
                try {
                    fo.close();     //关闭文件字节输出流
                    bo.close();     //关闭缓冲区字节输出流
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bi != null){
                    try {
                        fi.close();     //关闭文件字节输入流
                        bi.close();     //关闭缓冲区字节输入流
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
