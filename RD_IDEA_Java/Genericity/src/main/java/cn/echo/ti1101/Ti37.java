package cn.echo.ti1101;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName : Ti37
 * @Author : Jiangnan
 * @Date: 2020/11/1 19:16
 * @Description :
 **/
public class Ti37 {
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
