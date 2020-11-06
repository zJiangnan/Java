package cn.echo.zhan;

/**
 * @ClassName : TestStack
 * @Author : Jiangnan
 * @Date: 2020/10/26 19:58
 * @Description : 测试栈结构
 **/
public class TestStack {

    public static void main(String[] args) {
//        创建栈
        MyStack<String> my = new MyStack<>();
//        入栈操作
        my.push("h1");
        my.push("h2");
        my.push("h3");
        my.push("h4");
        my.push("h5");
//        返回栈顶元素
        System.out.println(my.peek());
//        出栈并删除
        my.pop();
        System.out.println(my.peek());

    }
}
