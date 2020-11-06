package cn.echo.ti1101;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName : Ti35
 * @Author : Jiangnan
 * @Date: 2020/11/1 19:02
 * @Description :
 **/
public class Ti35 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("b");
        list.add("f");
        Set<String> set = new LinkedHashSet<>();
        for (String s : list) {
            set.add(s);
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
