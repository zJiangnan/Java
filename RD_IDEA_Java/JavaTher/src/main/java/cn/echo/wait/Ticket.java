package cn.echo.wait;

/**
 * @ClassName : Ticket
 * @Author : Jiangnan
 * @Date: 2020/11/10 13:45
 * @Description :
 **/
public class Ticket implements Runnable {

//    售票员手里的一张五元
    int five = 1;
//    表示20元
    int twent = 0;

    @Override
    public void run() {
//        开始买票，如果是张飞，它是20元面值，其他都是5元
        if(Thread.currentThread().getName().equals("张飞")) {
            take(20);
        }else {
//            5元
            take(5);
        }
    }

    /**
     * 买票的过程，同步方法，锁对象默认是方法
     * @param money
     */
    public synchronized void take(int money) {
//        如果是20的面值就等待
        if(money == 20) {
            while(five < 3) {
                System.out.println(Thread.currentThread().getName() + "不能买到票，等待");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            如果five大于3表示有多个5元可以够张飞购买票
            System.out.println(Thread.currentThread().getName() + "正在买票");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            将售票员手里的三张5元给张飞
            five -= 3;
//            将张飞手里的20给售票员
            twent++;
            System.out.println(Thread.currentThread().getName() + "已买票");
        }
        else {
//            五元的时候买票
            System.out.println(Thread.currentThread().getName() + "正在买票");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            售票员五元的张数+1
            five++;
            System.out.println(Thread.currentThread().getName() + "已买票");
//            唤醒全部等待线程，此时只有一个线程需要被唤醒所以notify()方法同样可以
            this.notify();
        }
    }
}
