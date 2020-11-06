package cn.echo.operatiion;

import cn.j008.operatiion.Ti10_8.*;

import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:十月八号Test类
 * @Date:2020/10/8-18:30
 */
public class TestTi10_8 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TestTi10_8 ti = new TestTi10_8();
        System.out.println("=================第①题====================");
//        ti.t1Test();
        System.out.println("=================第②题====================");
//        ti.t2Test();
        System.out.println("=================第③题====================");
//        ti.t3Test();
        System.out.println("=================第④题====================");
//        ti.t4Test();
        System.out.println("=================第⑤题====================");
        ti.t5Test();
    }

    /**
     * 第一题--测试数学类和他的子类
     */
    public void t1Test() {
        Ti1_Mathematics t1 = new Ti1_Mathematics();
        Ti1_1_MathSon t2 = new Ti1_1_MathSon();
        t1.sumHe1(100);
        t1.sumHe2(1,100);
        t1.max1(8,2,9,4);
        System.out.println("阶乘的和：" + t2.factorial(5));
        t2.max1(9,3,8,1);
    }

    /**
     * 第二题--测试交通工具类和他们的子类
     */
    public void t2Test() {
        Ti2_1_Car car=new Ti2_1_Car(2);
        Ti2_2_Truck truck=new Ti2_2_Truck(1000);
        car.showCar();
        truck.showTruck();
    }

    /**
     * 第三题--测试汽车类和子类
     */
    public void t3Test() {
        Ti3_1Car t = new Ti3_1Car(4,"红色",70,"好空调","K歌之王");
        t.speedUp();
        t.speedDown();
        System.out.println(t.toString());
    }
    /**
     * 第四题--测试
     */
    public void t4Test() {
        Ti4_MyTime t = new Ti4_MyTime(10,0,0);
        for (int i = 0; i < 1000; i++) {
            t.addSecond();
        }
        t.diaplay();
    }
    /**
     * 第五题--测试Addition类
     */
    public void t5Test() {
        Ti5_Addition t = new Ti5_Addition();
        System.out.println(t.add(1,2));
        System.out.println(t.add(1,2));
        System.out.println(t.add(1.2,1.2));
        System.out.println(t.add(1.3,1.3));
        System.out.println(t.add("我","giao"));
    }
}
