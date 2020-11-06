package cn.echo.ti1028;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName : Ti2
 * @Author : Jiangnan
 * @Date: 2020/10/28 20:03
 * @Description : 2、 随机产生10个1~20之间的随机数，要求随机数不能重复
 **/
public class Ti2 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Random r = new Random();
//        如果set等于10就跳出
        while (set.size() != 10) {
            set.add((r.nextInt(20) + 1));
        }
//        迭代集合输出
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "\t");
        }
    }
}
