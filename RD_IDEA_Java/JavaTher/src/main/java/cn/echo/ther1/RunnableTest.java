package cn.echo.ther1;

/**
 * @ClassName : RunnableTest
 * @Author : Jiangnan
 * @Date: 2020/11/4 16:50
 * @Description :
 **/
public class RunnableTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            获取线程名
            System.out.println("----" + i);
        }
    }
}
