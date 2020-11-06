package cn.echo.operatiion.Ti10_8;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:时间父类
 * @Date:2020/10/8-20:11
 * 4、在程序中，经常要对时间进行操作，但是并没有时间类型的数据。
 *    那么，我们可以自己实现一个时间类，来满足程序中的需要。
 *    定义名为MyTime的类，其中应有三个整型成员：时（hour），分（minute），秒（second），
 *    为了保证数据的安全性，这三个成员变量应声明为私有。
 *    为MyTime类定义构造方法，以方便创建对象时初始化成员变量。
 *    类用有方法addSecond() 该方法是将秒加1。
 *    再定义diaplay方法，用于将时间信息打印出来。
 *    在main中new出这个类，将addsecond执行1000遍，每次执行一遍打印出时间
 */
public class Ti4_MyTime {
    private int hour;
    private int minute;
    private int second;

    public Ti4_MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void addSecond() {
        if (second < 59){
            second +=1;
        }else if(second == 59) {
            second = 0;
            minute +=1;
        }else if(minute == 59) {
            minute = 0;
            hour += 1;
        }else if(hour == 23) {
            hour = 0;
        }
    }
    public void diaplay() {
        System.out.println("现在时间：" + hour + ":" + minute + ":" + second);
    }
}
