package cn.echo.computer.car2;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:宝马工厂类
 * @Date:2020/10/13-15:52
 */
public class BMWCarFactory implements CarFactory {
    @Override
    public MinCar proMin() {
        return new BMWMinCar();
    }

    @Override
    public SUVCar proSUV() {
        return new BMWSUVCar();
    }
}
