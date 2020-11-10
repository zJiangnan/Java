package cn.echo.apither;

/**
 * @ClassName : therAPI
 * @Author : Jiangnan
 * @Date: 2020/11/9 6:14
 * @Description : API
 **/
public class therAPI {
    public static void main(String[] args) {
        System.out.println("当前线程" + Thread.currentThread().getName());
        System.out.println("主线程ID" + Thread.currentThread().getId());
//        设置主线程的线程级别
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("主线程的线程级别" + Thread.currentThread().getPriority());

//        创建线程对象
        MyThread my = new MyThread();
//        设置线程名
        my.setName("线程A");
//        设置优先级
        my.setPriority(10);
//        启动线程A
        my.start();

        MyThread my1 = new MyThread();
//        设置线程名
        my1.setName("线程B");
//        启动之前的线程状态         ------新生态--NEW
        System.out.println("线程:" + my1.getName() + "状态-----" + my1.getState());
//        启动线程A
        my1.start();
//        执行后的线程状态          ------可运行状态--RUNNABLE
        System.out.println("线程:" + my1.getName() + "状态-----" + my1.getState());

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程---------" + i);
        }
    }
}
