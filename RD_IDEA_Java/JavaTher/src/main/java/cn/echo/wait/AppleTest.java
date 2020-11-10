package cn.echo.wait;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName : AppleTest
 * @Author : Jiangnan
 * @Date: 2020/11/10 14:09
 * @Description :
 **/
public class AppleTest {
    public static void main(String[] args) {
        Apple a = new Apple();
        Set<Thread> set = new HashSet<>();
        for (int i = 1; i < 6; i++) {
            set.add(new Thread(a, "张" + i));
        }
        for (Thread t : set) {
            t.start();
        }
    }
}
