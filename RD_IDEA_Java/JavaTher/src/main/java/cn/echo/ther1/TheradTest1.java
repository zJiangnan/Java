package cn.echo.ther1;

/**
 * @ClassName : TheradTest1
 * @Author : Jiangnan
 * @Date: 2020/11/4 16:33
 * @Description : 多线程
 **/
public class TheradTest1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            获取线程名
            System.out.println(this.getName() + "----" + i);
        }
    }
}
