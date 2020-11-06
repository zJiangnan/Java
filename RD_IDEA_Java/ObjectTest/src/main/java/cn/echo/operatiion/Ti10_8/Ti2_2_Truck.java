package cn.echo.operatiion.Ti10_8;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:卡车子类
 * @Date:2020/10/8-19:32
 */
public class Ti2_2_Truck extends Ti2_Vehicles {
    float load;
    public void showTruck(){
        System.out.println("商标："+brand);
        System.out.println("颜色："+color);
        System.out.println("载重："+load);
    }

    public Ti2_2_Truck(float load) {
        super("宝马","粉色");
        this.load = load;
    }
}
