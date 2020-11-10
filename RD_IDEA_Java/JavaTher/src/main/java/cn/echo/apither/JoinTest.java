package cn.echo.apither;

/**
 * @ClassName : JoinTest
 * @Author : Jiangnan
 * @Date: 2020/11/9 16:17
 * @Description :
 **/
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Join j = new Join();
        j.setName("线程A");
        j.start();

        Join j1 = new Join();
        j1.setName("线程B");
        j1.start();

        for (int i = 0; i < 100; i++) {
//            当i等于50时，让主线程处于等待过程，等待j线程执行完，再执行主线程
            if(i == 50) {
//                合并线程
                j.join();
            }
            if (i == 70) {
//                让其他线程处于等待状态，j1执行完后再执行其他线程
                j1.join();
            }
            System.out.println("main----" + i);
        }
    }
}
