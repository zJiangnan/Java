package cn.echo.ti1109;

/**
 * @ClassName : Ti2_Dong
 * @Author : Jiangnan
 * @Date: 2020/11/9 19:50
 * @Description : 过洞的业务
 **/
public class Ti2_Dong implements Runnable {
    @Override
    public void run() {
        get();
    }
    public synchronized void get() {
        System.out.println(Thread.currentThread().getName() + "正在过山地洞");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "过去了");
    }
}
