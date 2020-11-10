package cn.echo.apither;

/**
 * @ClassName : YieldTest
 * @Author : Jiangnan
 * @Date: 2020/11/9 16:45
 * @Description :
 **/
public class YieldTest {
    public static void main(String[] args) {
        Yield y = new Yield();
        y.setName("子线程");
        y.setPriority(10);
        y.start();
        for (int i = 0; i < 50; i++) {
            if(i == 25) {
                System.out.println("暂停主线程");
//                暂停主线程
                Thread.yield();
            }
            System.out.println("主线程-----" + i);
        }
    }
}
