package cn.echo.strings;

/**
 * ClassName: Test1
 * Description:
 * date: 2020/10/20 14:42
 *
 * @author wuyafeng
 * @version 1.0   softeem.com
 */
public class Test1 {
    public static void main(String[] args) {
         // 创建字符串对象
        String s1="abc";
        String s2 = new String("abc");
        //通过字符数组构建
        char [] chars = {'a','b','c'};
        String s3 = new String(chars);  //  或指定长度构建字符串
        String s4 = new String(chars,0,2);
        //或根据字节数组构建
        byte [] byts = {97,98,99};
        String s5 = new String(byts);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        // 字符串是一个不可变的对象
        // class类被JVM装载时，会分配一个存放字符串的常量池（String Pool）
        // 在类加载时 先检查常量池中是否有“abc”常量，如果有，直接将ss1指向该常量
        // 如果没有，则创建常量abc
        // 创建2个对象
        String ss1 = "abc";
        //  abc常量不能改变，  则再创建 abcd的常量，由ss1重新指向
        ss1+="d";


        // 创建3个对象
        String ss2 ="abcd";  // abcd
        String ss3 = "aaa";  // aaa
        ss2 += ss3;  // abcdaaa   重新创建abcdaaa并由ss2重新指向


        String a1="abc";
        String b1="abc"; // 两个地址同时指向一个常量 “abc”
        System.out.println(a1==b1);  // true
        System.out.println(a1.equals(b1));

        String c1=new String("abc");// 堆内存中  对abc包装后的地址
        System.out.println(a1==c1);  // false
        System.out.println(a1.equals(c1));//true




    }

}
