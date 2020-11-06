package cn.echo.testobj;

import org.junit.Test;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:测试汽车类
 * @Date:2020/10/7-11:38
 */
public class testCar {

    @Test
    public void testCarby() {
        Car car = new Car();
//        汽车信息
        car.display();
        System.out.println("--------------------");
//        汽车初始速度
        car.setSpeed(40);
        for (int i = 0; i < 5; i++)
            car.accelerate();
        System.out.println("--------------------");
        for (int i = 0; i < 5; i++)
            car.slowDown();
        System.out.println(car.toString());

    }
}
