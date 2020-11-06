package cn.echo.strings;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * ClassName: Test3
 * Description:
 * date: 2020/10/20 15:40
 *
 * @author wuyafeng
 * @version 1.0   softeem.com
 */
public class Test3 {
    public static void main(String[] args) {
        //String类的常用方法
        // 1、判断功能
          String s1= "hello";
          String s2="HELLO";
//比较字符串的值是否相等       == 比较地址
        System.out.println(s1.equals(s2));
//忽略大小写 比较是否相等
        System.out.println(s1.equalsIgnoreCase(s2));
        // 2、常用方法
//charAt(index) :获取字符串的指定索引的字符
        System.out.println(s1.charAt(1));
        System.out.println(s1.codePointAt(1)); // 返回int
//concat()： 连接字符串
        System.out.println(s1.concat("world"));
// compareTo() ：比较两个字符串是否相等
        System.out.println(s1.compareTo("hello"));// 0：表示相等
 // contains（）：表示是否存在指定的字符  返回boolean
        System.out.println(s1.contains("a"));
// endWith（）：判断是否以指定的字符串结尾
        String fileName="hi.jpg";
        System.out.println(fileName.endsWith(".jpg"));
// format(): 用于格式化字符串
        String username ="敖园";
        int score=90;
        // %s ：表示占位一个字符串    %d：表示占位一个数值
        System.out.println(String.format("%s的分数%d",username,score));

// getBytes ： 返回字符串对应的字节数组
        System.out.println(Arrays.toString(s1.getBytes()));
        try {
            System.out.println(s1.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
// indexOf(字符) :检索字符出现的位置
        System.out.println(s1.indexOf("e"));// 没找到返回-1 或返回索引位置
        // lastIndexOf(字符):查找最后一个字符所在字符串的位置
        System.out.println("hleloworld".lastIndexOf("l"));
// isEmpty()  : 判断是否是空字符串 ，对于空对象会抛出空指针异常
        System.out.println();
        String ss="";
        String sss = null;
   //         System.out.println(sss.isEmpty());//报错
        System.out.println(ss.isEmpty()); // true
// join()  :   使用指定的分隔符 拼接成字符串
        System.out.println(String.join(",","aaa","bbb"));
//length（）   ：数组的length 是属性 ，字符串的length()是方法
        System.out.println( s1.length());
// matchs() 匹配一个正则
// replace替换  // 不支持正则
        // s1 不会变化
        System.out.println(s1.replace("o","a"));

//replaceAll 替换  // 支持正则

// split ： 将一个字符串按指定字符分割 并返回一个数组
        String str="我,喜,欢,你";
        String [] array = str.split(",");
        System.out.println(array.length);

// startWith 与endWith类似， 表示以指定的字符串开头
        System.out.println(str.startsWith("我")); //  true

//substring（begingIndex） 从指定下标截取字符串到末尾 ，
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,5));//下标包前不包后
// 转成字符数组
        System.out.println(str.toCharArray());
// 转大小写
        System.out.println(s1.toUpperCase());//转大写
        System.out.println(s1.toLowerCase());//转小写

// trim():去掉前后空格
        System.out.println("  hello  ".trim().length());
    }

}
