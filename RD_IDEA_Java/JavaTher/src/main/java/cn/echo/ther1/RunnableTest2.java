package cn.echo.ther1;

/**
 * @ClassName : RunnableTest2
 * @Author : Jiangnan
 * @Date: 2020/11/4 16:51
 * @Description :
 **/
public class RunnableTest2 {
    public static void main(String[] args) {
//        由于RunnableTest1与线程无关联，需要借助线程类完成启动
        Thread th = new TheradTest1();
        th.start();
        Thread th1 = new TheradTest1();
        th1.start();
        Thread th2 = new TheradTest1();
        th2.start();
    }
}
