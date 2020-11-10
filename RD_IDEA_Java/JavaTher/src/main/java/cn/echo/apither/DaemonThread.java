package cn.echo.apither;

/**
 * @ClassName : DaemonThread
 * @Author : Jiangnan
 * @Date: 2020/11/9 7:50
 * @Description : 守护线程
 **/
public class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("守护线程----------" + Thread.currentThread().getName());
        }
    }
}
