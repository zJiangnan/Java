package cn.echo.wait;

/**
 * @ClassName : TicketTest
 * @Author : Jiangnan
 * @Date: 2020/11/10 13:54
 * @Description :
 **/
public class TicketTest {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t, "张飞");
        Thread t2 = new Thread(t, "关羽");
        Thread t3 = new Thread(t, "刘备");
        t1.start();
        t2.start();
        t3.start();
    }
}
