package cn.echo.apither;

/**
 * @ClassName : ExThreadTest
 * @Author : Jiangnan
 * @Date: 2020/11/9 8:01
 * @Description : 测试异常中断线程
 **/
public class ExThreadTest {
    public static void main(String[] args) throws InterruptedException {
        ExThread ex = new ExThread();
//        开始执行
        ex.start();
//        休眠2s
        Thread.sleep(2000);
        System.out.println("标记中断");
//        给线程设置中断标记
        ex.interrupt();
    }
}
