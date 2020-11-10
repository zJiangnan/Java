package cn.echo.apither;

/**
 * @ClassName : DaemonThreadTest
 * @Author : Jiangnan
 * @Date: 2020/11/9 7:52
 * @Description : 守护线程测试
 **/
public class DaemonThreadTest {
    public static void main(String[] args) {
//        创建线程对象
        DaemonThread daemonThread = new DaemonThread();
//        设置该线程为守护线程    --守护的是与它并行的线程类，当主线程或其他线程执行完毕时，守护线程自动结束
        daemonThread.setDaemon(true);
        System.out.println("是否是守护线程：" + daemonThread.isDaemon());
//        启动线程
        daemonThread.start();

//        创建第二个守护线程
        DaemonThread daemonThread1 = new DaemonThread();
        daemonThread1.setDaemon(true);
        System.out.println("线程B是否是守护线程：" + daemonThread.isDaemon());
        daemonThread1.start();

//        主线程
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程------" + i);
        }
//        另加一个JVM回收机制线程
        System.out.println("活动线程数：" + Thread.activeCount());
    }
}
