package cn.echo.dead;

/**
 * @ClassName : Dead
 * @Author : Jiangnan
 * @Date: 2020/11/10 9:56
 * @Description :模拟线程死锁
 **/
public class Dead implements Runnable {

    Object obj1 = new Object();
    Object obj2 = new Object();

    @Override
    public void run() {
//        如果当前线程为线程A，先拿到obj1锁，等待obj2锁资源
//        如果当前线程为线程B，先拿到obj2锁，等待obj1锁资源
        if(Thread.currentThread().getName().equals("线程A")) {
            synchronized (obj1) {
                System.out.println(Thread.currentThread().getName() + "拿到obj1锁");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("等待obj2........");
                synchronized (obj2) {
                    System.out.println("拿到obj2锁");
                }
            }
        }else {
            synchronized (obj1) {
                System.out.println(Thread.currentThread().getName() + "拿到obj2锁");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("等待obj1........");
                synchronized (obj2) {
                    System.out.println("拿到obj1锁");
                }
            }
        }
    }
}
