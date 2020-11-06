package cn.echo.computer.car;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:宝马汽车类
 * @Date:2020/10/13-13:51
 */
public class BmwCar implements Car {
    @Override
    public Car show() {
        System.out.println("这是宝马");
        return null;
    }
}
