package cn.echo.zhan;

/**
 * @ClassName : TestLinkStack
 * @Author : Jiangnan
 * @Date: 2020/10/26 20:25
 * @Description : 测试单链栈结构
 **/
public class TestLinkStack {

    public static void main(String[] args) {
        MyStackLink my = new MyStackLink();
//        入栈
        my.push(1);
        my.push(2);
        my.push(3);
        my.push(4);
//        判空
        System.out.println(my.isEmpty());
//        出栈
        System.out.println(my.pop());
        System.out.println(my.peek());
        my.size();
    }
}
