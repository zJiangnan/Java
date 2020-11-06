package cn.echo.ther1;

/**
 * @ClassName : TheradTest
 * @Author : Jiangnan
 * @Date: 2020/11/4 16:31
 * @Description : 多线程
 **/
public class TheradTest {
    public static void main(String[] args) {
        System.out.println("主线程开始");
//        创建线程对象
        TheradTest1 t = new TheradTest1();
//        开启线程
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("mian方法的for---" + i);
        }
        System.out.println("结束");
    }
}
