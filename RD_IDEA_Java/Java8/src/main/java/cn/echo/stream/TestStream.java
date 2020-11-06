package cn.echo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName : TestStream
 * @Author : Jiangnan
 * @Date: 2020/11/1 13:58
 * @Description :
 **/
public class TestStream {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        for (int i = 0; i < 7; i++) {
            list.add(i + 1);
        }
//        1、过滤
        list.stream().filter(param -> param % 2 == 1).forEach(System.out::println);

//        2、排序--降序
        list.stream().sorted().forEach(System.out::println);
//        2.1排序--升序
        list.stream().sorted((o1, o2) -> o2 - o1).forEach(System.out::println);

//        3、map()--映射一个新的集合
        list.stream().map(param -> param % 2 == 1 ? "这是奇数" : "这是偶数").forEach(System.out::println);

//     4、去重--去除重复元素
        list.add(1);
        list.add(1);
        list.add(1);
        list.stream().distinct().forEach(System.out::println);

//       5、将集合的数据累加
        Integer sum = list.stream().reduce((o1, o2) -> o1 + o2).get();
        System.out.println("集合累加的值" + sum);

//        6、返回一个新的集合
        List list2 = (List) list.stream().filter(param -> param % 2 == 1).collect(Collectors.toList());
//        遍历集合
        list2.stream().forEach(System.out::print);

//        7、最大值、最小值
        System.out.println("\n" + list2.stream().max((o1, o2) -> (Integer) o2 - (Integer) o1).get());
        System.out.println(list2.stream().min((o1, o2) -> (Integer) o2 - (Integer) o1).get());
    }
}
