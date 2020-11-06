package cn.echo.gener;

import cn.echo.gener.tong.Dept;
import cn.echo.gener.tong.Employee;
import cn.echo.gener.tong.Manage;
import org.junit.Test;

/**
 * @ClassName : TongTest
 * @Author : Jiangnan
 * @Date: 2020/10/23 14:00
 * @Description : 通配符测试
 **/
public class TongTest {

//    使用不确定的泛型类型<?>
    public void showInfo(Dept<?> dept) {
        System.out.println(dept.getFirst());
    }

    public void showInfo2(Dept<? extends Employee> dept) {
        System.out.println(dept.getFirst());
        System.out.println(dept.getSecond());
    }

    public void showInfo3(Dept<? super Manage> dept) {
        System.out.println(dept.getFirst().toString());
        System.out.println(dept.getSecond().toString());
    }

    @Test
    public void showTest() {
        Dept<String> dept = new Dept<>();
        dept.setFirst("123");
        dept.setSecond("321");
        System.out.println(dept.getFirst());

        System.out.println("--------两个员工----------");

        Dept<Employee> dept1 = new Dept<>();
        dept1.setFirst(new Employee("张三"));
        dept1.setSecond(new Employee("李四"));
        showInfo2(dept1);

        System.out.println("-----------两个经理-------------");

        Dept<Manage> dept2 = new Dept<>();
        dept2.setFirst(new Manage("张"));
        dept2.setSecond(new Manage("李"));
        showInfo2(dept2);

    }
}
