package cn.echo.operatiion.Ti10_8;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:小汽车子类
 * @Date:2020/10/8-19:57
 * 继承Auto，并添加空调、CD等成员变量，覆盖加速，减速的方法
 */
public class Ti3_1Car extends Ti3_Auto {
    String kong;
    String cd;

    public Ti3_1Car(int tyre, String color, int sudu, String kong, String cd) {
        super(tyre, color, sudu);
        this.kong = kong;
        this.cd = cd;
    }

    @Override
    public void speedUp() {
        System.out.println("小汽车加速了");
    }

    @Override
    public void speedDown() {
        System.out.println("小汽车减速了");
    }

    @Override
    public String toString() {
        return "Ti3_1Car{" +
                "kong='" + kong + '\'' +
                ", cd='" + cd + '\'' +
                ", tyre=" + tyre +
                ", color='" + color + '\'' +
                ", zhong=" + zhong +
                ", sudu=" + sudu +
                '}';
    }
}
