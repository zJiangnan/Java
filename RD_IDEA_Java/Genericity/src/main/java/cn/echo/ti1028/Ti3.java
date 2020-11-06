package cn.echo.ti1028;

import java.util.*;

/**
 * @ClassName : Ti3
 * @Author : Jiangnan
 * @Date: 2020/10/28 20:12
 * @Description : 3、从键盘任意个输入数值使用“,”号隔开，要求能够不重复，存入集合，
 *                  要求最终能够根据数值从小到大排序输 出。
 **/
public class Ti3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        分割字符串
        String[] strs = str.split(",");
//        将数组添加到集合中
        Set<String> set = new TreeSet<>();
        for (String s : strs) {
            set.add(s);
        }
//        TreeSet默认将字符串排序
        for (String s : set) {
            System.out.println(s);
        }
    }
}
