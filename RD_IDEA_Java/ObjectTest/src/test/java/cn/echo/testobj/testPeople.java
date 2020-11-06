package cn.echo.testobj;

import org.junit.Test;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:测试人的类
 * @Date:2020/10/7-11:17
 */
public class testPeople {

    @Test
    public void testPeopleBy() {
//        类的实例化——创建对象
        People people = new People();
//        调用People的行为(方法)
        people.eat();
        people.sleep();
        people.sleep();
    }
}
