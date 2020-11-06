package cn.echo.computer.car2;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:汽车工厂类
 * @Date:2020/10/13-15:47
 */
public interface CarFactory {
    public MinCar proMin();
    public SUVCar proSUV();
}
