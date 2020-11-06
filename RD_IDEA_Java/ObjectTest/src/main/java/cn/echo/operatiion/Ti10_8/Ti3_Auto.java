package cn.echo.operatiion.Ti10_8;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:汽车父类
 * @Date:2020/10/8-19:39
 * 3、建立一个汽车Auto类，包括轮胎个数，汽车颜色，
 *   车身重量、速度等成员变量。并通过不同的构造方法创建实例。
 *   至少要求：  汽车能够加速，减速，停车。 再定义一个小汽车类Car，
 *   继承Auto，并添加空调、CD等成员变量，覆盖加速，减速的方法
 */
public class Ti3_Auto {
    int tyre;
    String color;
    int zhong;
    int sudu;

    public Ti3_Auto(int tyre, String color, int zhong, int sudu) {
        this.tyre = tyre;
        this.color = color;
        this.zhong = zhong;
        this.sudu = sudu;
    }

    public Ti3_Auto(int tyre, String color, int sudu) {
        this.tyre = tyre;
        this.color = color;
        this.sudu = sudu;
    }
    public void speedUp() {
        System.out.println("车加速了！");
    }
    public void speedDown() {
        System.out.println("车减速了！");
    }
    public void stop() {
        System.out.println("车停止了！");
    }
}
