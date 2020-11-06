package cn.echo.computer.car;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/13-15:35
 */
public class DaZhongCarFactory implements CarFactory {

    @Override
    public Car pro() {
        Car car = new DaZhongCar();
        return car;
    }
}
