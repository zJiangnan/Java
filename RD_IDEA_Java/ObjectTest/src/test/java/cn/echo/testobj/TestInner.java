package cn.echo.testobj;

import org.junit.Test;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:内部类测试
 * @Date:2020/10/19-9:12
 */
public class TestInner {
    @Test
    public void add() {
        InnerClass ic = new InnerClass();
        InnerClass.inner1 in1 = new InnerClass.inner1();
        InnerClass.inner2 in2 = new InnerClass.inner2();
        in1.add();
        in2.add();
        ic.add1();
        ic.add2();
    }
}
