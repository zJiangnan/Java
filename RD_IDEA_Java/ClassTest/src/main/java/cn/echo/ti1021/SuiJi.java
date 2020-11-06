package cn.echo.ti1021;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName : SuiJi
 * @Author : Jiangnan
 * @Date: 2020/10/21 15:24
 * @Description : 随机生成器
 **/
public class SuiJi {

    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    public int sui() {
        return r.nextInt(3);
    }

    public int shuZi() {
        return r.nextInt(9) + 48;
    }

    public char xiao() {
        char c = (char) (r.nextInt(26) + 97);
        return c;
    }

    public char da() {
        char c = (char) (r.nextInt(26) + 65);
        return c;
    }

    public String shuRu() {
        String str  = sc.next();
        return str;
    }
    public String biJiao(String str1, String str2) {
        if (str1.equals(str2)){
            return "验证成功";
        } else {
            return "验证码错误";
        }
    }
}
