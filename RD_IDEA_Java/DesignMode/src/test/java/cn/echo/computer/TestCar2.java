package cn.echo.computer;

import cn.echo.computer.car2.*;
import org.junit.Test;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:汽车抽象工厂测试类
 * @Date:2020/10/13-15:41
 */
public class TestCar2 {
    @Test
    public void car2Test() {
        CarFactory bcarf = new BMWCarFactory();
        MinCar bmc = bcarf.proMin().showInfo();
        SUVCar bsc = bcarf.proSUV().showInfo();
        CarFactory acarf = new AudicarFactory();
        MinCar amc = acarf.proMin().showInfo();
        SUVCar asc = acarf.proSUV().showInfo();
    }
}
