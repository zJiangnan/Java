package cn.echo.gener;

import org.junit.Test;

/**
 * @ClassName : Test
 * @Author : Jiangnan
 * @Date: 2020/10/23 9:56
 * @Description : 测试泛型
 **/
public class ceshi {
//    @Test
    public void test1() {
        People people = new People();
        people.setName("张三");
        people.setSex("男");
        System.out.println(people.getName());
        System.out.println(people.getSex());

        People<String> people1 = new People<>("李四", "女");
        System.out.println(people1.toString());

        Convert<String, Integer> con = new Convert<>("王五", 23);
        System.out.println(con.toString());

//        通过接口创建实现类
        interfaceGen<String> ingen = new StringGen();
        ingen.setValue("Java");
        System.out.println(ingen.getValue());

//        指定对象
        interfaceGen<Student> instu = new StudentGen();
        instu.setValue(new Student("张三",100));
        System.out.println(instu.getValue().toString());
    }
}
