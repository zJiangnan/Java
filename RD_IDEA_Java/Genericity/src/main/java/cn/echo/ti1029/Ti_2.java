package cn.echo.ti1029;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName : Ti_2
 * @Author : Jiangnan
 * @Date: 2020/10/29 19:34
 * @Description :  2、编写一个Student类用来实现Comparable<Student>接口,并在其中重写CompareTo(Student o)方法
 * 在主函数中使用Comparable 与 Comparetor分别对ArrayList进行排序.
 **/
public class Ti_2 {
    public static void main(String[] args) {
        Ti_2 t = new Ti_2();
        List<Student> list = new ArrayList<>();
//        调用添加方法
        list = t.add(list);
        /* 使用Comparator倒序 */
        t.sor1(list);
        /* 使用Comparable升序 */
//        for (Student stu : list) {
//            stu.compareTo(stu);
//        }
//        遍历集合
        for (Student stu : list) {
            System.out.println(stu.getName() + "----" + stu.getSid());
        }

    }

    //    添加数据方法
    public List<Student> add(List<Student> list) {
        Student stu1 = new Student(12, "张三");
        Student stu2 = new Student(32, "李四");
        Student stu3 = new Student(97, "王五");
        Student stu4 = new Student(69, "张四");
        Student stu5 = new Student(43, "李武");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        return list;
    }

    //    排序方法
    public List<Student> sor1(List<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getSid().compareTo(o1.getSid());
            }
        });
        return list;
    }

}
