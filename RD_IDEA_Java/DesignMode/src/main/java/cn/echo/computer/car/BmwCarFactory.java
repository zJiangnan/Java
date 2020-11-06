package cn.echo.computer.car;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:宝马工厂类
 * @Date:2020/10/13-13:53
 */
public class BmwCarFactory implements CarFactory {

    @Override
    public Car pro() {
        Car car = new BmwCar();
        return car;
    }
}
