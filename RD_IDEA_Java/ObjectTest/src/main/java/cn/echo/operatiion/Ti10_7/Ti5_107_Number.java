package cn.echo.operatiion.Ti10_7;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:计算器类
 * @Date:2020/10/7-19:18
 */
public class Ti5_107_Number {
    /**
     * 5、编写Java程序，模拟简单的计算器。
     *    定义名为Number的类，其中有两个整型数据成员n1和n2，应声明为私有。
     *    编写构造方法，赋予n1和n2初始值，再为该类定义加（addition）、
     *    减（subtration）、乘（multiplication）、除（division）等公有成员方法，
     *    分别对两个成员变量执行加、减、乘、除的运算。
     *    在main方法中创建Number类的对象，调用各个方法，并显示计算结果。
     */
    private int n1;
    private int n2;

    /**
     * 有参构造方法
     * @param n1    第一个值
     * @param n2    第二个值
     */
    public Ti5_107_Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void addition() {
        System.out.println("这俩数相加：" + (n1 + n2));
    }
    public void subtration() {
        System.out.println("这俩数相减：" + (n1 - n2));
    }
    public void multiplication() {
        System.out.println("这俩数相乘：" + (n1 * n2));
    }
    public void division() {
        System.out.println("这俩数相除：" + (n1 / n2));
    }

}
