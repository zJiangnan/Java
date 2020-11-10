package cn.echo.provider;

/**
 * @ClassName : ProviderCustomerTest
 * @Author : Jiangnan
 * @Date: 2020/11/10 16:01
 * @Description :测试
 **/
public class ProviderCustomerTest {
    public static void main(String[] args) {

//        创建公有的存储空间
        Storage s = new Storage();

//        生产者
        Provider p1 = new Provider(s);
        Provider p2 = new Provider(s);
        Provider p3 = new Provider(s);
        Thread t1 = new Thread(p1, "张飞");
        Thread t2 = new Thread(p2, "刘备");
        Thread t3 = new Thread(p3, "关羽");
        t1.start();
        t2.start();
        t3.start();

//        消费者
        Customer c1 = new Customer(s);
        Customer c2 = new Customer(s);
        Customer c3 = new Customer(s);
        Thread t4 = new Thread(c1, "张飞的老婆");
        Thread t5 = new Thread(c2, "刘备的老婆");
        Thread t6 = new Thread(c3, "关羽的老婆");
        t4.start();
        t5.start();
        t6.start();
    }
}
