package cn.echo.objectstream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : ObjectInputStreamTest2
 * @Author : Jiangnan
 * @Date: 2020/11/3 16:51
 * @Description :
 **/
public class ObjectInputStreamTest2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        创建序列化类
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FileData/stu.txt"));
//        创建学生对象
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "aaa", "a"));
        list.add(new Student(2, "bbb", "b"));
        list.add(new Student(3, "ccc", "c"));
//        将集合序列化
        oos.writeObject(list);
//        关闭流
        oos.close();
        
//        反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FileData/stu.txt"));
        Object obj = ois.readObject();
        if(obj instanceof List) {
            List<Student> list2 = (List<Student>) obj;
            for (Student stu : list2) {
                System.out.println(stu.toString());
            }
        }
    }
}
