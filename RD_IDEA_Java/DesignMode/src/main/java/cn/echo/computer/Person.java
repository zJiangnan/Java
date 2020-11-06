package cn.echo.computer;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:笔记本类
 * @Date:2020/10/13-11:11
 */
public class Person implements Computer {
    @Override
    public void add() {
        System.out.println("笔记本电脑，正在办公。。。");
    }
}
