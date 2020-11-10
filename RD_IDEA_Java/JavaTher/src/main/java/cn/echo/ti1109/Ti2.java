package cn.echo.ti1109;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName : Ti2
 * @Author : Jiangnan
 * @Date: 2020/11/9 19:43
 * @Description : 2、 编写多线程应用程序，模拟多个人通过一个山洞的模拟。
 *                  这个山洞每次只能通过一个人，每个人通过山洞的时间为3秒，
 *                  随机生成10个人，同时准备过此山洞，显示一下每次通过山洞人的姓名。
 *                  打印出如： A正在过山洞。。。
 *                  A过去了。
 *                  C正在过山洞。。。
 *                  C过去了
 **/
public class Ti2 {

    public static void main(String[] args) {
//        创建线程同步对象
        Ti2_Dong dong = new Ti2_Dong();
        Set<Thread> set = new HashSet<>();
//        创建十个人
        for (int i = 1; i < 11; i++) {
            Thread thread = new Thread(dong, (char)(64 + i) + "");
            set.add(thread);
        }
        for (Thread thread : set) {
            thread.start();
        }
    }
}
