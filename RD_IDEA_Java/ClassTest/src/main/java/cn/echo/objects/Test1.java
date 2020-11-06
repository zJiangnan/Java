package cn.echo.objects;

/**
 * ClassName: Test1
 * Description:
 * date: 2020/10/20 10:55
 *
 * @author wuyafeng
 * @version 1.0   softeem.com
 */
public class Test1 {
    public static void main(String[] args) {
         Object obj = new Object();
         Object obj3 = new Object();
        // 所有类的根基类 就是 Object

         Object obj2 = new Integer(120);
         System.out.println(obj2);
        // 输出对象   getClass.getName + "@"+ hashCode的16进制输出
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj3)); //比较地址


        System.out.println("obj2 的 hashCode："+obj2.hashCode());

        Student stu = new Student();
        System.out.println(stu);// 默认调用父类的 toString方法
        Student stu2 = new Student();
        System.out.println(stu2);
        Student stu3 = stu;
        System.out.println(stu3);


        String str="abc";
        System.out.println(str.hashCode());
        // Object中的hashCode 本身没有实现 ，
        /**
         * 1、对于基本数据类型的包装类 其值就是其本身
         * 2、对于String类型的HashCode ，也是String自己实现的,其算法目的尽可能减少hash冲突
         * 3、对于自定义类，需要你自己重写HashCode ，如果不重写 就在程序运行期间 JVM根据内存地址
         *    类自动分配。（原则: 根据每个有意义的属性值，计算各自的hashCode 相加等一系列操作得到）
         */


    }
}
