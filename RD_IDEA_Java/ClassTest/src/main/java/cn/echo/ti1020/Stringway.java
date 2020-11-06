package cn.echo.ti1020;

import java.util.Scanner;

/**
 * @ClassName : Stringway
 * @Author : Jiangnan
 * @Date: 2020/10/20 18:44
 * @Description : 字符串类方法使用
 **/
public class Stringway {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stringway stringway = new Stringway();
        System.out.println("======================第一题==================");
        stringway.ti1();
        System.out.println("======================第二题==================");
        stringway.ti2();
        System.out.println("======================第三题==================");
        stringway.ti3();
        stringway.ti31();
        System.out.println("======================第四题==================");
        stringway.ti4();
    }

    /**
     * 1、键盘录入一个字符，统计字符串中大小写字母及数字字符个数
     */
    public void ti1() {
//        统计大写
        int d = 0;
//        统计小写
        int x = 0;
//        统计数字
        int s = 0;
//        统计其他字符
        int q = 0;
        System.out.println("输入字符串：");
        String str = sc.next();
//        遍历字符串
        for (int i = 0; i < str.length(); i++) {
//            如果是小写
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z') {
                x++;
            }
//            如果是大写
            else if(c >= 'A' && c <= 'Z') {
                d++;
            }
//            如果是数字，以Ascll码表示数字
            else if(c >= 48 && c <= 57) {
                s++;
            }
//            其他字符
            else {
                q++;
            }
        }
        System.out.println("你输入的字符串中大写字母：" + d + "个，小写字母：" + x + "个，数字：" + s + "个，其他字符" + q + "个");
    }

    /**
     * 2、统计字符串中出现了多少个字符‘你’，并将字符‘你’改成字符‘我’打印出
     */
    public void ti2() {
        String str = "你他喵的，怎么了你";
//        调用String类的replace()字符替换方法
        System.out.println(str.replace("我","你"));
        char[] c = str.toCharArray();
//        统计字符'你'出现的次数
        int i = 0;
        for (char c1 : c) {
            if(c1 == '你') {
                i++;
            }
        }
        System.out.println("其中'你'出现的次数为：" + i);
    }

    /**
     * 3、题目：字符串“=====i am biter" 逆置为：biter am i
     */
    public void ti3() {
        String str = "=====i am biter";
//        使用substring()方法截取第三个单词
        System.out.print(str.substring(str.indexOf('b')) + " ");
//        使用substring()方法截取第二个单词
        System.out.print(str.substring(str.indexOf('a'),(str.indexOf('m') + 1)) + " ");
//        使用substring()方法截取第一个单词
        System.out.println(str.charAt(str.indexOf('i')) + "");
    }

    /**
     * 题3：扩展反向输出字符串:retib ma i
     */
    public void ti31() {
        String str = "i am biter";
//        创建StringBuilder对象调用reverse使字符串逆向
        StringBuilder sb = new StringBuilder(str);
        System.out.println("反向输出整个字符串：" + sb.reverse().toString());
    }

    /**
     * 4、将一个数组从左开始第几位之前的进行旋转：左旋数组
     * 如：将"abcdef"第2位之前(a为0号位置)进行旋转----》“cdefab”
     */
    public void ti4() {
        String str = "abcdef";
//        截取前两个字符
        String str1 = str.substring(0, 2);
//        获取后面字符
        String str2 = str.substring(2);
//        拼接输出
        System.out.println(str2 + str1);
    }

}
