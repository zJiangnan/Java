package cn.echo.baozhuang;

/**
 * ClassName: Test2
 * Description:
 * date: 2020/10/20 9:40
 *
 * @author wuyafeng
 * @version 1.0   softeem.com
 */
public class Test2 {
    public static void main(String[] args) {

        int n=250;
        // 转包装类
        Integer obj1 = new Integer(n);
        //包装类转基本数据类型
        int n3 = Integer.valueOf(obj1);

        // 转字符串
        String s1 = obj1.toString();
        //  字符串再转成  Integer
        Integer obj2 = Integer.parseInt(s1);
        Integer obj3 = new Integer(s1);

        // 字符串转int
        int n2 = Integer.valueOf(s1);
        // int  转 转字符串
        String s3 = new Integer(n2).toString();

        System.out.println("-------------Intger的常用方法------");
        int num = Integer.bitCount(2);  // 个位数 + 高位数的和
        System.out.println(num);
        // n1>n2 返回1   n1==n2 返回0   n1<n2 -1
        //比较两个数是否相等
        System.out.println(Integer.compare(100,200));

        System.out.println(Integer.decode("123"));

        //equals  比较两个数是否相等  对于基本数据类型的包装类比较他们的数值
        Integer  n1  = new Integer(90);
        Integer n4 = new  Integer(90);
        System.out.println(n1.equals(n4));// 比较两个对象的 值
        System.out.println(n1 == n4);// 比较 两个对象的地址

        int n5 =100;
        int n6 =100;
        System.out.println(n5==n6);// 对于基本数据类型 == 比较的值


        // 进制转换
        System.out.println(Integer.toBinaryString(18));
        System.out.println(Integer.toHexString(15));
        System.out.println(Integer.toOctalString(10));





    }
}
