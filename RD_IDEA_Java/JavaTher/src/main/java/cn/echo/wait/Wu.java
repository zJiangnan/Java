package cn.echo.wait;

/**
 * @ClassName : Wu
 * @Author : Jiangnan
 * @Date: 2020/11/10 14:37
 * @Description :
 **/
public class Wu {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
//        50
        new Thread(mt, "唐僧").start();
//        20
        new Thread(mt, "孙悟空").start();
        new Thread(mt, "猪八戒").start();
//        10
        new Thread(mt, "沙僧").start();
    }

}

class MyThread implements Runnable {
    //    10
    private int ten = 1;
    //    20
    private int twenty = 0;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("沙僧")) {
            buy(10);
        } else if (name.equals("唐僧")) {
            buy(50);
        } else {
            buy(20);
        }
    }

    public synchronized void buy(int money) {
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        if (money == 10) {
            ten++;
            System.out.println(Thread.currentThread().getName() + "花费了10元，买了一张票");
            System.out.println("十块有：" + ten + "张，20有" + twenty + "张");
            notifyAll();
        } else if (money == 20) {
            if (ten < 1) {
                try {
                    System.out.println(Thread.currentThread().getName() + "拿了一张20元，找不开，得等一下");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                ten--;
                twenty++;
                System.out.println(Thread.currentThread().getName() + "拿了一张20元，买了一张票还剩下10元");
                System.out.println("十块有：" + ten + "张，20有" + twenty + "张");
                notifyAll();
            }
        } else if (money == 50) {
            if (twenty < 2 || (twenty == 1 && ten == 2)) {
                try {
                    System.out.println(Thread.currentThread().getName() + "拿了一张50元，找不开，得等一下");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "拿了一张50元，买了一张票还有40元");
                System.out.println("十块有：" + ten + "张，20有" + twenty + "张");
            }
        }
    }
}
