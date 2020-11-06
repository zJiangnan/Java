package cn.echo.dates;

import java.util.Date;

/**
 * @ClassName : Dates
 * @Author : Jiangnan
 * @Date: 2020/10/22 9:16
 * @Description : 时间日期类
 **/
public class Dates {

    public static void main(String[] args) {
//        创建日期类的对象
        Date date = new Date();
//        获取当前时间    以标准格式
        System.out.println(date);
//        获取当前时间的毫秒数
        System.out.println(date.getTime());
//        通过毫秒数构建当前时区的时间
        Date date2 = new Date(1000000);
        System.out.println(date2);
//        获取纪元时间-- 与本地时间相隔8时区
        System.out.println(date.toGMTString());
//        获取本地时区时间
        System.out.println(date.toLocaleString());

//        测试时间的先后   -true   -false
        System.out.println(date.after(date2));
        System.out.println(date.before(date2));

//        比较时间大小
        System.out.println(date.compareTo(date2));

        System.out.println(date.toString());
    }

}
