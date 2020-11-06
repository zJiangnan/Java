package cn.echo.util;

import java.io.*;
import java.util.List;

/**
 * @ClassName : IOUtil
 * @Author : Jiangnan
 * @Date: 2020/11/5 9:17
 * @Description : 文件读写工具类
 **/
public class IOUtil<T> {

    /**
     * 将集合对象写入到文件中
     */
    public boolean writeList(String path, List<T> list) {
//        1、判断地址的路径是否存在
        File file = new File(path);
//        file表示文件他的父级路径就是文件夹
        if(!file.getParentFile().exists()) {
//            不存在，创建父级路径
            file.getParentFile().mkdir();
        }
//        写文件
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
//            写入集合
            oos.writeObject(list);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 读文件
     * @param path
     * @return
     */
    public List<T> readList(String path) throws FileNotFoundException {
        List<T> list = null;
        File file = new File(path);
//        文件不存在时
        if (!file.exists()) {
            throw new FileNotFoundException("文件找不到！！！！！！");
        }
//        读文件
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(path));
            Object obj = ois.readObject();
            if(obj instanceof List) {
                list = (List<T>) obj;
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
