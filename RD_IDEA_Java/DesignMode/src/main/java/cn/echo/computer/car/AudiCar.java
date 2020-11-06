package cn.echo.computer.car;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/13-13:52
 */
public class AudiCar implements Car {
    @Override
    public Car show() {
        System.out.println("这是奥迪");
        return null;
    }
}
