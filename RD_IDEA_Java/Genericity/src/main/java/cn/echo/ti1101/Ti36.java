package cn.echo.ti1101;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @ClassName : Ti36
 * @Author : Jiangnan
 * @Date: 2020/11/1 19:06
 * @Description :
 **/
public class Ti36 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random r = new Random();
        while (set.size() != 10) {
            set.add(r.nextInt(20) + 1);
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
