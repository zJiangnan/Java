package cn.echo.strings;

/**
 * ClassName: Test2
 * Description:
 * date: 2020/10/20 15:03
 *
 * @author wuyafeng
 * @version 1.0   softeem.com
 */
public class Test2 {
    public static void main(String[] args) {
//        String s1 = "abcdef";
//        String s2 = "abcdef";
//        String s3 = "abc"+"def";//编译期自动优化为String s3 = "abcdef";
//        System.out.println(s1 == s2); //true
//        System.out.println(s1 == s3);//true
//        System.out.println(s2 == s3);//true


//        String s1 = "abc";
//        String s2 = "def";
//        String s3 = "abcdef";
//        String s4 = "abc"+"def";
//        String s5 = s1 + "def";
//        String s6 = "abc"+s2;
//        String s7 = s1 + s2;
//        System.out.println(s3 == s4);//true
//        System.out.println(s3 == s5);//false  s1是变量，编译期不会直接优化
//        System.out.println(s3 == s6);// false  同上
//        System.out.println(s3 == s7);// false  都是变量


//        final String s1 = "abc"; // 常量  内存在常量池
//        String s2 = "def";
//        String s3 = "abcdef";
//        String s4 = "abc"+"def";
//        String s5 = s1 + "def";
//        String s6 = "abc"+s2;
//        String s7 = s1 + s2;
//        System.out.println(s3 == s4);// true
//        System.out.println(s3 == s5);// true  因为s1是常量  编译期自动优化
//        System.out.println(s3 == s6);// false
//        System.out.println(s3 == s7);// false


//        String s1 = "abc";
//        final String s2 = getDef(); // 运行期执行， final是在编译期优化，这里不会自动优化
//        String s3 = "abcdef";
//        String s4 = "abc"+s2;
//        String s5 = s1 + s2;
//        System.out.println(s3 == s4); //false
//        System.out.println(s3 == s5); // false


        String s1 = new String("abc");//语句1
        String s2 = "abc";//语句2
        String s3 = new String("abc");//语句3

        System.out.println(s1 == s2);//语句4  false
        System.out.println(s1 == s3);//语句5  false
        System.out.println(s2 == s3);//语句6  false
        // 返回s1对象的 字符串值
        System.out.println(s1 == s1.intern());//语句7  false
        System.out.println(s2 == s2.intern());//语句8  true
        System.out.println(s1.intern() == s2.intern());  //语句9  true




    }
    private static String getDef(){
        return "def";
    }
}
