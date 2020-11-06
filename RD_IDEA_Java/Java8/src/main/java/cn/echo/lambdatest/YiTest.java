package cn.echo.lambdatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName : YiTest
 * @Author : Jiangnan
 * @Date: 2020/10/29 15:48
 * @Description : Lambda表达式
 **/
public class YiTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ccc");
        list.add("aaa");
        list.add("ddd");
        list.add("bbb");
        Collections.sort(list, (o1, o2)->(o1.compareTo(o2)));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
