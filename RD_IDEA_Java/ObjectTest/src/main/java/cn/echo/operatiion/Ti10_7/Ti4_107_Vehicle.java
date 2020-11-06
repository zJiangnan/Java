package cn.echo.operatiion.Ti10_7;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:交通工具类
 * @Date:2020/10/7-19:04
 */
public class Ti4_107_Vehicle {
    /**
     * 4，请定义一个交通工具(Vehicle)的类，其中有:
     *   属性：速度(speed)，体积(size)等等
     *   方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等.
     *   最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过方法给它初始化speed,size的值，
     *   并且通过打印出来。另外，调用加速，减速的方法对速度进行改变。
     */
//    类的属性
    private String name = "阿尔法·罗密欧";
    private int speed = 70;
    private String size = "就这么大";

    /**
     * 移动方法
     */
    public void move() {
        System.out.println("这个车动了下");
    }

    /**
     * 加速方法
     */
    public void speedUp() {
        this.speed += 50;
        System.out.println("加速50！此时车速为：" + this.speed);
    }

    /**
     * 减速方法
     */
    public void speedDown() {
        this.speed -= 55;
        System.out.println("减速55！此时车速为：" + this.speed);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Ti4_107_Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", size='" + size + '\'' +
                '}';
    }
}
