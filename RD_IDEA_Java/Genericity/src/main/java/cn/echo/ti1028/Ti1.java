package cn.echo.ti1028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName : Ti1
 * @Author : Jiangnan
 * @Date: 2020/10/28 19:34
 * @Description : 1、创建一个学生类，存储到ArrayList集合中完成指定排序操作
 *                1.1 按照学生分数降序排列
 **/
public class Ti1 {

    public static void main(String[] args) {
        List<Ti1_Stu> list = new ArrayList();
        Ti1_Stu s1 = new Ti1_Stu("张三", "90");
        Ti1_Stu s2 = new Ti1_Stu("李四", "59");
        Ti1_Stu s3 = new Ti1_Stu("王五", "37");
        Ti1_Stu s4 = new Ti1_Stu("张二", "98");
        Ti1_Stu s5 = new Ti1_Stu("李三", "46");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
//        输出所有学生信息
        System.out.println("-----------输出所有学生信息-----------");
        for (Ti1_Stu stu : list) {
            System.out.println(stu.toString());
        }
        System.out.println("成绩排名");
        list.sort(new Comparator<Ti1_Stu>() {
            @Override
            public int compare(Ti1_Stu o1, Ti1_Stu o2) {
                if (o1.getName() == null || o2.getName() == null) {
                    return 0;
                }
                return o1.getChen().compareTo(o2.getChen());
            }
        });
        System.out.println("-----------输出所有学生信息-----------");
        for (Ti1_Stu stu : list) {
            System.out.println(stu.toString());
        }
    }
}
