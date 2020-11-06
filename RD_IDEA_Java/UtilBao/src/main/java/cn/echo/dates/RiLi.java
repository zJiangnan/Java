package cn.echo.dates;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @ClassName : RiLi
 * @Author : Jiangnan
 * @Date: 2020/10/22 10:58
 * @Description : 打印日历
 **/
public class RiLi {

    public static void main(String[] args) {
//        Calendar cc = new GregorianCalendar(2020, 11, 7);//任意设置一个时间
		Calendar cc = Calendar.getInstance();
        calendarDisplay(cc);
    }

    public static void calendarDisplay(Calendar c) {

//        当前月份--下标为当前月份-1
        Calendar ca = new GregorianCalendar(c.get(Calendar.YEAR), c.get(Calendar.MONTH), 1);
//        后一个月--当前月份下标+1
        Calendar temp = new GregorianCalendar(ca.get(Calendar.YEAR), ca.get(Calendar.MONTH) + 1, 1);

//        输出此刻的年月       --当前月份下标+1表示实际月份
        System.out.println("\t\t" + ca.get(Calendar.YEAR) + "年\t" + (ca.get(Calendar.MONTH) + 1) + "月\n");
//        输出表头  从星期日开始
//        System.out.println("日\t一\t二\t三\t四\t五\t六");
//        输出表头  从星期一开始
        System.out.println("一\t二\t三\t四\t五\t六\t日");

//        DAY_OF_WEEK代表指定月份从星期几开始
//        通过ca返回的星期数，也就是获取本月的第一天星期数     --此指下标月份
//            如果i小于这个月的第一天就输出制表符
//        （如果想从星期一开始输出就要-1），（从星期日开始就不需要-1）
        for (int i = 1; i < ca.get(Calendar.DAY_OF_WEEK) - 1; i++) {
            System.out.print("\t");
        }
//        否则输出日期
        do {
//            如果从星期日开始输出就 == 7，获取当前星期几 然后自加 --如果等于7就换行输出
//            如果从星期一开始输出就 == 1
            if (ca.get(Calendar.DAY_OF_WEEK) == 1) {
                System.out.println(ca.get(Calendar.DAY_OF_MONTH) + "\t");
            } else {
//                星期几不等于7时就不换行输出
                System.out.print(ca.get(Calendar.DAY_OF_MONTH) + "\t");
            }
//            每输出一天就加一天
            ca.add(Calendar.DAY_OF_MONTH, 1);
//            判断语句：如果ca(前一个月) ！= 当前月份时就执行如果相等就说明他们ca(前一个月)的天数加完了
        } while (ca.get(Calendar.MONTH) != temp.get(Calendar.MONTH));

    }

}
