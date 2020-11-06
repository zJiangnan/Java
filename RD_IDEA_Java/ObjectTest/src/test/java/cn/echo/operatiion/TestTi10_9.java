package cn.echo.operatiion;

import cn.j008.operatiion.Ti10_9.*;
import org.junit.Test;

import java.util.Arrays;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:十月九号作业测试类
 * @Date:2020/10/11-20:29
 */
public class TestTi10_9 {

    @Test
    public void ti1() {
        Ti1_2_Manager m = new Ti1_2_Manager("ManagerName",8000);
        Ti1_1_Employee e = new Ti1_1_Employee("EmployeeName",21,"男",1000);
        System.out.println("Manager里的finalSing方法:");
        m.finalSing();
        System.out.println("Manager里的palay方法:");
        m.play();
        System.out.println("Employee里的finalSing方法:");
        e.finalSing();
        System.out.println("Employee里的palay方法:");
        e.play();
        System.out.println("Manager的名字:" + m.getrName());
        System.out.println("Manager的年龄:" + m.getAge());
        System.out.println("Manager的年龄:" + m.getSalary());
        System.out.println("Employee的名字:" + e.getrName());
        System.out.println("Employee的年龄:" + e.getAge());
        System.out.println("Employee的性别:" + e.getSex());
        System.out.println("Employee的工资:" + e.getSalary());
    }

    @Test
    public void ti2() {
        Ti2_Student t = new Ti2_Student();
        t.seeADoctor();
        t.injection();
        t.stuInjection();
        t.prescribe();
    }

    @Test
    public void ti3() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Ti3_Sort t = new Ti3_Sort();
        arr = t.ti3Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void ti4() {
        Ti4_Array t = new Ti4_Array();
        t.array();
    }

    @Test
    public void ti5() {
        Ti5_2_Referee referee = new Ti5_2_Referee();
        Ti5_Play player1 = new Ti5_Play();
        Ti5_Play player2 = new Ti5_Play();

        referee.setName("张三");
        player1.setName("李四");
        player2.setName("王二麻子");

        player1.setFinger((int)(Math.random()*5+1));
        player2.setFinger((int)(Math.random()*5+1));

        referee.playgame(player1,player2);
    }
}
