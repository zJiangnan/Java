package cn.echo.computer;


import cn.echo.computer.car.AudiCarFactory;
import cn.echo.computer.car.BmwCarFactory;
import cn.echo.computer.car.Car;
import cn.echo.computer.car.CarFactory;
import org.junit.Test;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:汽车工厂测试类
 * @Date:2020/10/13-14:02
 */
public class TestCar {

    @Test
    public void carTest() {
        CarFactory bmw = new BmwCarFactory();
        Car carb = bmw.pro().show();
        CarFactory amw = new AudiCarFactory();
        Car cara = amw.pro().show();
    }
}
