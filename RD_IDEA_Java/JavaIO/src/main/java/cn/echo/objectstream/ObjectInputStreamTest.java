package cn.echo.objectstream;

import java.io.*;
import java.util.ArrayList;

/**
 * @ClassName : ObjectInputStreamTest
 * @Author : Jiangnan
 * @Date: 2020/11/3 16:33
 * @Description :
 **/
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        创建序列化对象流----从内存到文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FileData/user.txt"));
        User user = new User(1, "张三", "123");
        /*User user2 = new User(2, "李四", "234");
        User user3 = new User(3, "王五", "345");
        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        list.add(user2);
        list.add(user3);*/
//        序列化对象
//        写入对象
        oos.writeObject(user);
//        关闭流
        oos.close();

//        反序列化:将文件中的数据读到内存中
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FileData/user.txt"));
//        反序列化文件尽量写几次，读几次
        Object object = ois.readObject();
        if (object instanceof User) {
            User u = (User)object;
            System.out.println("成功");
            System.out.println(u.toString());
        }else{
            System.out.println("失败");
        }
    }
}
