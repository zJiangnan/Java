package cn.echo.objects;

/**
 * ClassName: Test2
 * Description:
 * date: 2020/10/20 11:29
 *
 * @author wuyafeng
 * @version 1.0   softeem.com
 */
public class Test2 {
    /**
     *  验证 Object的类的方法 在子类中体现
     * @param args
     */
    public static void main(String[] args) {
          // 创建对象   比较对象是否相等
        // 比较内存相等 或 比较值（对象的属性）相等
        Student stu1 = new Student(1001,"敖园",22);
        Student stu2 = new Student(1001,"敖园",22);
        System.out.println(stu1==stu2);  // 比较两个对象的地址 （不相等）
        System.out.println(stu1.equals(stu2));
        // 由于equals本身没办法解决
        //    两个对象因id 和name相等业务上是同一个对象的问题
        // 所以需要重写 equals 和 hashcode 。
         // 为什么要重写HashCode呢?
        //  回答: 在JMV中如果HashCode不相等，一定不能认为是同一个对象

        Student stu3 = stu1;  // stu3 的地址于stu1的地址是同一个

    }
}
