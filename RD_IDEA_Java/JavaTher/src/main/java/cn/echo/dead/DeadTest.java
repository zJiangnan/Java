package cn.echo.dead;

/**
 * @ClassName : DeadTest
 * @Author : Jiangnan
 * @Date: 2020/11/10 10:03
 * @Description :
 **/
public class DeadTest {
    public static void main(String[] args) {
        Dead d = new Dead();
        Thread t1 = new Thread(d, "线程A");
        Thread t2 = new Thread(d, "线程B");
        t1.start();
        t2.start();
    }
}
