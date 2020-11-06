package com.j2008.arithmetic;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/25-16:31
 */
public class Student {
//    学号、姓名、年龄、性别、身高
    int id = 1;
    String name = "张三";
    int age = 21;
    char set = '男';
    double gao = 175;

    @Override
    public String toString() {
        return "stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", set=" + set +
                ", gao=" + gao +
                '}';
    }
}
