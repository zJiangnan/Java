package cn.echo.zhen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName : regexs
 * @Author : Jiangnan
 * @Date: 2020/10/22 14:55
 * @Description : 正则表达式使用
 **/
public class regexs {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.matches("abc"));
        System.out.println(s.matches("^abc"));
        s = "6";
        System.out.println(s.matches("\\d"));
        s = "12345678";
        System.out.println(s.matches("\\d{8}"));

        System.out.println("a".matches("[abc]"));
        System.out.println("d".matches("[abc]"));

        System.out.println("------------------------");

//        取反
        System.out.println("d".matches("[^abc]"));

//        匹配数字
        System.out.println("4".matches("[0-9]"));

        System.out.println("-------------------");

//        创建匹配格式的编译器
        String add = "13669036625";
        String str = "1[356789][0-9]{9}";
        Pattern pattern = Pattern.compile(str);
//        根据编译器获取匹配器
        Matcher matcher = pattern.matcher(add);
        System.out.println(matcher.matches());

        System.out.println("----------------------");

//        匹配年龄  (0-100  01-09   10-99   100)
        String str1 = "(0?[0-9]|(1-9[0-9])|(100))";
        boolean b = Pattern.matches(str1,"58");
        System.out.println(b);

        System.out.println("---------------------------");

//        匹配一个字符串是否包含 .
        String dian = "a.b";
        System.out.println(dian.matches(".*\\..*"));

        System.out.println("---------------------------");

//        匹配邮箱
        String mail = "132@163.net";
//        \\w+@\\w+(\\.[a-z]{2,3})
        System.out.println(mail.matches(".*@.*(\\.com|\\.cn|\\.gov|\\.net)"));

//        匹配网址
        String url = "http://www.baidu.com";
        System.out.println(url.matches("https?://www\\.\\w+\\.[a-z]{2,3}"));

//        匹配生日格式    1900-01-01~2099-12-31
        String shen = "1900-09-31";
        System.out.println(shen.matches("((19)|(20))[0-9]{2}-((0[1-9])|(1[0-2]))-(0[1-9]|[1-2][0-9]|3[0-1])"));
    }
}
