package cn.echo.baozhuang;

/**
 * ClassName: Test3
 * Description:
 * date: 2020/10/20 10:40
 *
 * @author wuyafeng
 * @version 1.0   softeem.com
 */
public class Test3 {
    public static void main(String[] args) {
        // 包装类
        // 自动装箱： 100自动转成 Integer
        Integer num1 = 100;
        // 自动拆箱:  Integer 自动转成  int
        int num2 = num1;

        Integer n1 =100;
        Integer n2 =100;
        System.out.println(n1.equals(n2)); //true
        System.out.println(n1 == n2);// 应该true   他们同时指向常量池100
        // 对于    -128 <=Integer的值 <=127 之间（byte范围），
        // 装箱时不会创建新对象 而是直接引用 常量池中的值
        // 如果超出byte 的返回，则自动创建新对象，各自指向新对象的内存

        Integer n3 = 150; // 等价于 Integer n3 = new Integer(150);
        Integer n4 = 150; // 等价于 Integer n4 = new Integer(150);
        System.out.println(n3.equals(n4));//true
        System.out.println(n3 == n4);//false

        Integer n6 = new Integer(100);// 一定会创建新对象
        System.out.println(n6 == n1); // false

    }
}
