package cn.echo.apither;

/**
 * @ClassName : ThreadEnd
 * @Author : Jiangnan
 * @Date: 2020/11/9 7:46
 * @Description :
 **/
public class ThreadEnd extends Thread {
    @Override
    public void run() {
        boolean isOver = false;
        for (int i = 0; i < 1000; i++) {
            if(i >= 500) {
                isOver = true;
                return;
            }
//            for里面输出
            System.out.println("线程结果i = " + i);
        }
//        for之外 ---没有执行----在if里中断线程了
        System.out.println("正常结束");
    }

    public static void main(String[] args) {
        ThreadEnd th = new ThreadEnd();
        th.start();
    }
}
