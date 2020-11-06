package cn.echo.zhan;

import java.util.Arrays;

/**
 * @ClassName : MyStack
 * @Author : Jiangnan
 * @Date: 2020/10/26 19:46
 * @Description : 栈结构
 **/
public class MyStack<T> {
    private Object[] obj;
    private int size;
    public MyStack() {
//        初始化
        obj = new Object[10];
        size = 0;
    }

    /**
     * 入栈
     * @param t
     */
    public void push(T t) {
        obj[size] = t;
        size++;
    }

    /**
     * 返回栈顶元素
     * @return
     */
    public T peek() {
//        如果size大于0说明有值
        if(size > 0) {
            return (T) obj[size - 1];
        }
//        否则返回空
        return  null;
    }

    /**
     * 出栈--将栈顶元素返回并删除
     * @return
     */
    public T pop() {
//        peek返回栈顶元素
        T t = peek();
//        如果size大于0将栈顶下标向后移一位
        if(size > 0) {
            obj[size - 1] = null;
            size--;
        }
//        否则直接返回栈顶元素
        return t;
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public void expandCapacity(int size) {
//        size大于obj的长度就需要扩容
        if(obj.length < size) {
//            将数组扩容1.5倍
            int length = size * 3 / 2 + 1;
            this.obj = Arrays.copyOf(this.obj,length);
        }
    }
}
