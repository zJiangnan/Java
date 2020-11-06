package cn.echo.testobj;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:汽车类
 * @Date:2020/10/7-11:28
 */
public class Car {
//    类的属性
    private String brand = "阿尔法·罗密欧";   //品牌
    private String color = "红色";   //颜色
    private double price = 1000000;   //价格
    private int speed = 70;      //速度

//    类的行为为

    /**
     * 汽车加速
     */
    public void accelerate() {
        speed += 50;
        System.out.println("汽车加速了！" + speed);
    }

    /**
     * 汽车减速
     */
    public void slowDown() {
        speed -= 50;
        System.out.println("汽车减速了！" + speed);
    }
    /**
     * 显示汽车信息
     */
    public void display() {
        System.out.println("汽车品牌：" + brand);
        System.out.println("汽车颜色：" + color);
        System.out.println("汽车价格：" + price);
        System.out.println("汽车速度：" + speed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
