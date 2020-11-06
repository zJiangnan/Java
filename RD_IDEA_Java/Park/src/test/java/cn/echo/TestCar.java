package cn.echo;

import cn.echo.Car.*;
import cn.echo.Car.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:停车场项目测试
 * @Date:2020/10/15-11:11
 */
public class TestCar {
    static Park park = null;

    static {
//        在程序执行开始时创建停车场实现类的对象
        park = new ParkImpl(5);
    }

    @Test
    public void test() {
        Date date = new Date();
        Car scar = new SaloonCar("鄂A 88888", Brand.布加迪威龙, 20, date, 5.2);
        String msg = park.inPark(scar);
        System.out.println(msg);
        String str = "";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        msg = park.outPark(scar.getCarId());
//        断言操作，断定输出结果是否正确
        Assert.assertEquals("鄂A 88888你停留了2小时，应缴纳：40.0元",msg);
        System.out.println(msg);
    }
}
