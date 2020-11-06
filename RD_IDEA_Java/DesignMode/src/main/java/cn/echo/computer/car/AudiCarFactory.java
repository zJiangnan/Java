package cn.echo.computer.car;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:奥迪工厂类
 * @Date:2020/10/13-13:56
 */
public class AudiCarFactory implements CarFactory {


    @Override
    public Car pro() {
        Car car = new AudiCar();
        return car;
    }
}
