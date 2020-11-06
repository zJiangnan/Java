package cn.echo.game;

import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:玩家类
 * @Date:2020/10/7-15:59
 */
public class Player {
//    成员方法
    String name;    //名字
    int quan;       //表述出拳
    int integral = 0;   //积分
    Scanner sc = new Scanner(System.in);

    //    构造方法
    public Player(String name) {
        this.name = name;
    }

//    成员方法
    public void Chu() {
        System.out.println("请出拳：");
        this.quan = sc.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }
}
