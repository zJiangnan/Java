package cn.echo.apither;

/**
 * @ClassName : MyThread
 * @Author : Jiangnan
 * @Date: 2020/11/9 7:28
 * @Description :
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("当前线程ID" + Thread.currentThread().getId()
            + "线程名：" + Thread.currentThread().getName() + "----------" + i);
        }
    }
}
