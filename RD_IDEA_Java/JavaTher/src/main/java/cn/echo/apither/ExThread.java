package cn.echo.apither;

/**
 * @ClassName : ExThread
 * @Author : Jiangnan
 * @Date: 2020/11/9 7:58
 * @Description : 异常中断线程
 **/
public class ExThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("线程-----" + i);
//            判断当前线程是否有中断标记， 但是不清除标记
            if(this.isInterrupted()) {
//                true表示有中断标记
                System.out.println("线程已中断。。。。。。");
                break;
            }
            i++;
        }
    }
}
