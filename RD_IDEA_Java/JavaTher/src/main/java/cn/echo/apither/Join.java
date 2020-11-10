package cn.echo.apither;

/**
 * @ClassName : Join
 * @Author : Jiangnan
 * @Date: 2020/11/9 16:16
 * @Description : join方法使用
 **/
public class Join extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--------" + i);
        }
    }
}
