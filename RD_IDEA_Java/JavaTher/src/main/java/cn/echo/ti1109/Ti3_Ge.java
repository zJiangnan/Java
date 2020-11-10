package cn.echo.ti1109;

/**
 * @ClassName : Ti3_Ge
 * @Author : Jiangnan
 * @Date: 2020/11/9 20:17
 * @Description :
 **/
public class Ti3_Ge extends Thread {

    Integer k = 1;

    @Override
    public void run() {
        while (true) {
//            保证计数器k是同步操作
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + "-----" + k);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    k++;
                }
            }
            try {
//                为了避免出现一个线程执行完毕之后，下一个又是他自己，这里可以在
//                释放锁之后，休眠一会儿
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
