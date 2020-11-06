package cn.echo.coll;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName : TestLinkKedList
 * @Author : Jiangnan
 * @Date: 2020/10/28 9:43
 * @Description : 测试链表
 **/
public class TestLinkKedList {
    public static void main(String[] args) {
        TestLinkKedList t = new TestLinkKedList();
//        创建LinkedList对象
        List<String> list = new LinkedList<>();
//        添加操作
        list.add("苹果");
        list.add("香蕉");
        list.add(1, "橘子");
//        遍历元素
        for (String s : list) {
            System.out.println(s);
        }
//        删除元素
        list.remove("橘子");
        list.remove(0);
        System.out.println("删除之后的集合：");
        for (String s : list) {
            System.out.println(s);
        }
//        获取指定下标元素
        System.out.println("获取指定下标元素：" + list.get(0));
//        判断是否存在指定元素
        System.out.println(list.contains("橘子"));

        List<String> list1 = new LinkedList<>();
        list1.add("草莓");
        list1.add("西瓜");
//        将一个集合添加到另一个集合
        list.addAll(list1);
        System.out.println("list里的元素：" + Arrays.toString(list.toArray()));
        System.out.println("-----再次输出------");
        for (String s : list) {
            System.out.println(s);
            if(s.equals("草莓")) {
                System.out.println("---删除草莓元素---");
//                删除时后面的元素会向前挪动，并且长度-1
                list.remove(s);
            }
        }
        System.out.println("删除草莓后的集合：" + Arrays.toString(list.toArray()));
        t.linkedListMethod();
    }
    public void linkedListMethod() {
//        由于LinkedList实现多个接口(List、Deque(双队列)、Queue(队列))
        LinkedList<String> link = new LinkedList<>();
//        测试Deque方法
        link.add("武汉");
//        添加到列表的开头
        link.addFirst("长沙");
//        添加到列表的最后
        link.addLast("南京");
//        添加到列表的开头--同addFirst
        link.push("上海");
//        添加到列表的开头--同addFirst
        link.offerFirst("北京");
//        遍历集合
        System.out.println("-------遍历第二个集合--------");
        for (String s : link) {
            System.out.println(s);
        }
        System.out.println("-----获取元素------");
        System.out.println("获取第一个元素：" + link.getFirst());
        System.out.println("获取最后一个元素：" + link.getLast());

        System.out.println("-------获取后删除--------");
        System.out.println("获取第一个元素后并删除它：" + link.pollFirst());
        System.out.println("获取最后一个元素后并删除：" + link.pollLast());
        System.out.println("获取第一个元素后并删除它：" + link.poll());
//        遍历集合
        for (String s : link) {
            System.out.println(s);
        }
//        获取元素后不删除
        System.out.println("----获取元素后不删除----");
//        获取第一个元素
        System.out.println(link.peek());
//        获取第一个元素
        System.out.println(link.peekFirst());
//        获取最后一个元素
        System.out.println(link.peekLast());

//        弹出第一个元素(删除第一个元素)
        System.out.println("----删除元素----");
//        删除第一个元素
        System.out.println(link.pop());
        System.out.println("最后：" + link.get(0));
        System.out.println("---遍历---");
        for (String s : link) {
            System.out.println(s);
        }
    }
}
