package cn.echo.apither;

/**
 * @ClassName : Yield
 * @Author : Jiangnan
 * @Date: 2020/11/9 16:43
 * @Description : 暂停当前执行执行其他线程的方法yield()方法
 **/
public class Yield extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "------" + i);
        }
    }
}
