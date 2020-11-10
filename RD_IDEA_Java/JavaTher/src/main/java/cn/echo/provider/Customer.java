package cn.echo.provider;

/**
 * @ClassName : Customer
 * @Author : Jiangnan
 * @Date: 2020/11/10 15:58
 * @Description :消费者
 **/
public class Customer implements Runnable {

    Storage s = null;
    public Customer(Storage s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            Mobile m = s.pop();
            System.out.println(Thread.currentThread().getName() + "购买一部手机，手机编号为--->" + m.getId() + "库存：" + s.getSize());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
