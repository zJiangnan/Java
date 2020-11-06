package cn.echo.jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName : ArrayListTest
 * @Author : Jiangnan
 * @Date: 2020/10/23 15:46
 * @Description : ArrayList集合实例
 **/
public class ArrayListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        添加对象
        list.add("hello");
        list.add("你好");
        list.add("再见");

//        集合长度
        System.out.println("集合大小：" + list.size());

//        删除对象
        list.remove("hello");
        System.out.println("集合大小：" + list.size());

//        判断对象是否存在
        System.out.println("对象是否存在：" + list.contains("再见"));

//        转成数组对象
        System.out.println(Arrays.toString(list.toArray()));

//        迭代器遍历集合对象
        Iterator<String> it = list.iterator();
            System.out.println(it.next());

//        清空集合对象
        list.clear();
        System.out.println("集合大小：" + list.size());

//        判断是否是空集合
        System.out.println("是否是空集合:" + list.isEmpty());

    }

}
