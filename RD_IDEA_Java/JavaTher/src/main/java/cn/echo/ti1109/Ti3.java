package cn.echo.ti1109;

/**
 * @ClassName : Ti3
 * @Author : Jiangnan
 * @Date: 2020/11/9 20:14
 * @Description : 3、编写多线程应用程序，有A、B、C三人，有一个公共的计数器，
 *                  三个人中随机的一个人能拿到5个数，另外的两个人中某个人能
 *                  拿到接着后面的5个数，再第一个人和第三个人中某人能拿到后面的5个数。。。。
 *                  以此不停的循环。在控制台输出。
 *   A----1
 * 	 A----2
 * 	 A----3
 * 	 A----4
 * 	 A----5
 * 	 B----6
 * 	 B----7
 * 	 B----8
 * 	 B----9
 * 	 B----10
 * 	 A----11
 * 	 A----12
 * 	 A----13
 * 	 A----14
 * 	 A----15
 * 	 C----16
 * 	 C----17
 * 	 C----18
 * 	 C----19
 * 	 C----20
 **/
public class Ti3 {
    public static void main(String[] args) {
        Ti3_Ge ge = new Ti3_Ge();
        Thread a = new Thread(ge, "A");
        Thread b = new Thread(ge, "B");
        Thread c = new Thread(ge, "C");
        a.start();
        b.start();
        c.start();
    }
}
