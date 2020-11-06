package cn.echo.operatiion;

import cn.j008.operatiion.Ti10_7.*;

import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:十月七号题目测试类
 * @Date:2020/10/7-18:27
 */
public class TestTi10_7 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TestTi10_7 ti = new TestTi10_7();
        System.out.println("================第一题===================");
//        ti.athleteTest();
        System.out.println("================第二题===================");
//        ti.animalTest();
        System.out.println("================第三题===================");
//        ti.guessTheNumberTest();
        System.out.println("================第四题===================");
//        ti.vehicleTest();
        System.out.println("================第五题===================");
//        ti.numberTest();
        System.out.println("================第六题===================");
        ti.userTest();

    }

    /**
     * 第一题
     */
    public void athleteTest() {
        Ti1_107_athlete t = new Ti1_107_athlete();
        System.out.println(t.toString());
        t.eat();
        System.out.println(t.toString());
        t.run();
        System.out.println(t.toString());
    }

    /**
     * 第二题
     */
    public void animalTest() {
        Ti2_107_Animal t = new Ti2_107_Animal();
        t.Bite("张三");
    }

    /**
     * 第三题
     */
    public void guessTheNumberTest() {
        Ti3_107_Guess_The_Number t = new Ti3_107_Guess_The_Number();
        while (true){
            System.out.println("猜数字游戏，输入相应值猜数字，输入-1退出");
            System.out.println("请输入值：");
            int x = sc.nextInt();
            if (x == -1)
                break;
            System.out.println(t.Guess(x));
        }
    }

    /**
     * 第四题
     */
    public void vehicleTest() {
        Ti4_107_Vehicle t = new Ti4_107_Vehicle();
        System.out.println("输入车速：");
        t.setSpeed(sc.nextInt());
        System.out.println("输入车的体积：");
        t.setSize(sc.next());       //车的体积是String类型
        System.out.println("此车的信息：" + t.toString());
        t.speedUp();
        t.speedDown();
    }

    /**
     * 第五题
     */
    public void numberTest() {
        Ti5_107_Number t = new Ti5_107_Number(100,20);
        t.addition();
        t.subtration();
        t.multiplication();
        t.division();
    }

    /**
     * 第六题
     */
    public void userTest() {
//        有邮箱
        Ti6_107_user t1 = new Ti6_107_user("我是id","我是密码","这是我邮箱");
        System.out.println(t1.toString());
//        没有邮箱
        Ti6_107_user t2 = new Ti6_107_user("我是id","我是密码");
        System.out.println(t2.toString());
    }
}
