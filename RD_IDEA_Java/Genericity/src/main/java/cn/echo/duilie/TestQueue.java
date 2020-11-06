package cn.echo.duilie;

/**
 * @ClassName : TestQueue
 * @Author : Jiangnan
 * @Date: 2020/10/26 16:57
 * @Description : 测试队列
 **/
public class TestQueue {

    public static void main(String[] args) {
        MyQueue my = new MyQueue();
        my.put(1);
        my.put(2);
        my.put(3);
        my.put(4);

        System.out.println("-----------------------");

        try {
            System.out.println(my.pop());
            System.out.println(my.pop());
            System.out.println(my.pop());
            System.out.println(my.pop());
            System.out.println(my.pop());
            System.out.println(my.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
