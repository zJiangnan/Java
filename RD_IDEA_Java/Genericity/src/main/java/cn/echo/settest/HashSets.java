package cn.echo.settest;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName : HashSets
 * @Author : Jiangnan
 * @Date: 2020/10/28 14:17
 * @Description : HashSet
 **/
public class HashSets {
    public static void main(String[] args) {
        Set<Stu> set = new HashSet<>();
        Stu stu = new Stu(1, "张三", 100);
        Stu stu1 = stu;
        Stu stu2 = new Stu(2, "李四", 200);
        System.out.println("stu的hashCode：" + stu.hashCode());
        set.add(stu);
        System.out.println("stu1的hashCode：" + stu1.hashCode());
        set.add(stu1);
        System.out.println("stu2的hashCode：" + stu2.hashCode());
        set.add(stu2);
        System.out.println("set的长度：" + set.size());
        for (Stu s : set) {
            System.out.println(s.toString());
        }
    }
}
