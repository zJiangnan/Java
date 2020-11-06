package cn.echo.ti1029;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : Ti_3
 * @Author : Jiangnan
 * @Date: 2020/10/29 20:34
 * @Description :3、Map集合的使用（一）
 * 一、现在有一个map集合如下：
 * Map<Integer,String> map = new HashMap<Integer, String>();
 *         map.put(1, "张三丰");
 *         map.put(2, "周芷若");
 *         map.put(3, "汪峰");
 *         map.put(4, "灭绝师太");
 * 要求：
 *      1.遍历集合，并将序号与对应人名打印。
 *        2.向该map集合中插入一个编码为5姓名为李晓红的信息
 *        3.移除该map中的编号为1的信息
 *        4.将map集合中编号为2的姓名信息修改为"周林"
 **/
public class Ti_3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
//        遍历集合
        for (Integer i : map.keySet()) {
            System.out.println(i + "--" + map.get(i));
        }
        System.out.println("------------------------");
//        插入编码为5姓名为李晓红的信息
        map.put(5, "李晓红");
//        移除该map中的编号为1的信息
        map.remove(1);
//        将map集合中编号为2的姓名信息修改为"周林"
        map.put(2, "周林");
        for (Integer i : map.keySet()) {
            System.out.println(i + "--" + map.get(i));
        }
    }
}
