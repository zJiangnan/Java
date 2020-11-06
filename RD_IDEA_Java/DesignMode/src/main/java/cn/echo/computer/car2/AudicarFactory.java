package cn.echo.computer.car2;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:奥迪工厂类
 * @Date:2020/10/13-15:56
 */
public class AudicarFactory implements CarFactory {

    @Override
    public MinCar proMin() {
        return new AudiMinCar();
    }

    @Override
    public SUVCar proSUV() {
        return new AudiSUVCar();
    }
}
