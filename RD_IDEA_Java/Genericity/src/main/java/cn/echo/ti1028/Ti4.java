package cn.echo.ti1028;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @ClassName : Ti4
 * @Author : Jiangnan
 * @Date: 2020/10/28 20:27
 * @Description : 4、随机在键盘上输入字符串  rereredf ：
 *                  最后输出 r(3)  e(3) d(1)  f(1)
 **/
public class Ti4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        将字符串转数组
        char[] arr = str.toCharArray();
//        将数组元素放入集合中
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            map.put(c, !map.containsKey(c) ? 1 : (map.get(c) + 1));
        }
        for (Character key : map.keySet()) {
            System.out.println(key + "=" + (map.get(key)));
        }
    }
}
