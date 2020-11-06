package cn.echo.operatiion.Ti10_8;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:交通工具父类
 * @Date:2020/10/8-19:29
 * 2、定义一个名为Vehicles（交通工具）的基类，该类中应包含String类型的成员属性brand（商标）
 *    和color（颜色），还应包含成员方法run（行驶，在控制台显示“我已经开动了”）
 *    和showInfo（显示信息，在控制台显示商标和颜色），
 *    并编写构造方法初始化其成员属性。
 *    编写Car（小汽车）类继承于Vehicles类，
 *    增加int型成员属性seats（座位），
 *    还应增加成员方法showCar（在控制台显示小汽车的信息），并编写构造方法。
 *    编写Truck（卡车）类继承于Vehicles类，
 *    增加float型成员属性load（载重），
 *    还应增加成员方法showTruck（在控制台显示卡车的信息），并编写构造方法。
 *    在main方法中测试以上各类。
 */
public class Ti2_Vehicles {
    //属性
    String brand;
    String color;
    //方法run
    public void run(){
        System.out.println("我已经开动了");
    }
    //方法showInfo
    public void showInfo(){
        System.out.println("商标："+brand);
        System.out.println("颜色："+color);
    }
    //构造器
    public Ti2_Vehicles(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
}
