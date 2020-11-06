package cn.echo.testobj;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:人的类
 * @Date:2020/10/7-11:08
 */
public class People {

    //    类的属性
    private String name = "张三";     //名字
    private String sex = "男";       //性别
    private double height = 1.75;   //身高
    private double weight = 140;    //体重

//    类的行为(方法)
    /**
     * 吃饭方法
     */
    public void eat() {
        System.out.println("正在吃饭");
    }

    /**
     * 睡觉方法
     */
    public void sleep() {
        System.out.println("正在睡觉");
    }

    public void playGame() {
        System.out.println("正在打豆豆");
    }
}
