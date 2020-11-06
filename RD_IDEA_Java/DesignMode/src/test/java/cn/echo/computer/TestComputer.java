package cn.echo.computer;

import org.junit.Test;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:测试电脑类
 * @Date:2020/10/13-11:14
 */
public class TestComputer {
    @Test
    public void computer() {
        ComputerFactory factory = new ComputerFactory();
        Computer com1 = factory.produce("work");
        Computer com2 = factory.produce("person");
        com1.add();
        com2.add();
        Computer com3 = ComputerFactory2.pro("p");
        com3.add();

    }
}
