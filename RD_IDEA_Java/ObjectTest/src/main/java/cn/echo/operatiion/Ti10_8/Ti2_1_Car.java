package cn.echo.operatiion.Ti10_8;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:小车子类
 * @Date:2020/10/8-19:30
 */
public class Ti2_1_Car extends Ti2_Vehicles {
    //增加int型成员属性seats（座位）
    private int seats;

    //显示小汽车的信息
    public void showCar(){
        System.out.println("商标："+brand);
        System.out.println("颜色："+color);
        System.out.println("座位："+seats);
    }

    public Ti2_1_Car(int seats) {
        super("阿尔法·罗密欧","银色");
        this.seats = seats;
    }
}
