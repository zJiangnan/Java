package cn.echo.provider;

/**
 * @ClassName : Storage
 * @Author : Jiangnan
 * @Date: 2020/11/10 15:33
 * @Description : 生产者和消费者共享的空间，生产者和消费者公有的锁
 **/
public class Storage {

    //    定义固定大小的空间存储手机对象数组
    Mobile[] mobiles = new Mobile[10];
//    数组中仓库手机个数
    int index = 0;
//    手机ID
    static int n = 1000;

    /**
     * 存放手机
     * @param mobile
     */
    public synchronized void push(Mobile mobile) {
        while (index == mobiles.length) {
            System.out.println("仓库已满，请等待");
            try {
//                等待线程
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        通知消费者去消费，嫁给你其他线程唤醒
        notifyAll();
//        将手机对象放进仓库
        mobiles[index] = mobile;
        index++;
    }

    /**
     * 取出手机
     *
     * @return 返回手机对象
     */
    public synchronized Mobile pop() {
        Mobile mobile = null;
        while (index <= 0) {
//            没有手机了，等待
            System.out.println("仓库空，没有手机");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        先将手机个数-1
        index--;
        mobile = mobiles[index];
//        置空表示取走手机
        mobiles[index] = null;
//        通知生产者生产手机
        notifyAll();
        return mobile;
    }

    /**
     * 仓库手机个数
     * @return  返回手机个数
     */
    public synchronized int getSize () {
        return index;
    }
}
