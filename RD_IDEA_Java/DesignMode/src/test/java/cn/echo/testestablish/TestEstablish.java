package cn.echo.testestablish;

import cn.echo.establish.Person;
import cn.echo.establish.Studen;
import org.junit.Test;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:懒汉式单例测试
 * @Date:2020/10/13-10:42
 */
public class TestEstablish {
    @Test
    public void person() {
        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();
        System.out.println(p1);
        System.out.println(p2);
    }

    @Test
    public void studen() {
        Studen s1 = Studen.getInstance();
        Studen s2 = Studen.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
