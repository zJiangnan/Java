package cn.echo.wait;

/**
 * @ClassName : Apple
 * @Author : Jiangnan
 * @Date: 2020/11/10 14:06
 * @Description : 2、有100个苹果，5个小朋友分，每一个小朋友消耗1秒中的时间去领苹果。
 * 在控制台打印出“***小朋友领了一个苹果，发现还剩下**个苹果
 **/
public class Apple implements Runnable {

    private Integer a = 100;

    @Override
    public void run() {
        while (a != 0) {
            synchronized (this) {
                if(a != 0) {
                    System.out.println(Thread.currentThread().getName() + "小朋友领到一个苹果，剩余" + --a);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
