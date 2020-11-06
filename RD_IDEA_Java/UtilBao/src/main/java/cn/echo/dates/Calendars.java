package cn.echo.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName : Calendars
 * @Author : Jiangnan
 * @Date: 2020/10/22 9:28
 * @Description : 日历类
 **/
public class Calendars {

    public static void main(String[] args) {
//        获取本地日历对象
        Calendar cal = Calendar.getInstance();

//        日历属性（fields）
        System.out.println(Calendar.DATE);
        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.MONTH);
//        获取年份  月   日
        System.out.print(cal.get(Calendar.YEAR) + "-");
//        月份的返回值下标只能表示0~11，所以+1
        System.out.print(cal.get(Calendar.MONTH) + 1 + "-");
        System.out.println(cal.get(Calendar.DATE));

//        获取当前日历的日期
        System.out.println(cal.getTime());

//        添加日历（指定的field 和 数）
//        例如：将当前日历添加两个月
        cal.add(Calendar.MONTH, 2);
        System.out.println(cal.getTime());
//        添加天数
        cal.add(Calendar.DATE, 3);
        System.out.println(cal.getTime());
        cal.add(Calendar.DATE, -3);
        System.out.println(cal.getTime());

//        判断日期的前后   after()   before()

//        给定两个日期，计算相差天数
        Calendar car1 = Calendar.getInstance();
        Calendar car2 = car1;
        car2.set(2020, 10, 20);
        System.out.println("car2:" + car2.getTime());

        LocalDate datel = LocalDate.of(2020, 2, 22);
        LocalDate date2 = LocalDate.of(2020, 3, 22);
        long days = datel.until(date2, ChronoUnit.DAYS);
        System.out.println("两个时间段相差：" + days);
    }

    public Date sim(String str) throws ParseException {
//        使用格式化日期类  指定格式：yyyy-MM-dd HH:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(str);
    }

    /**
     * 日期转字符串
     * @param date
     * @return
     * @throws ParseException
     */
    public String simd(Date date) throws ParseException {
//        使用格式化日期类  指定格式：yyyy-MM-dd HH:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(date);
    }
}
