package cn.echo.functionalinterfaces;

import java.util.Date;

/**
 * @ClassName : Testsss
 * @Author : Jiangnan
 * @Date: 2020/10/29 16:03
 * @Description : 测试函数式接口
 **/
public class Testsss {
    public static void main(String[] args) {
        functional<String, Integer> f = (from -> Integer.valueOf(from));
        Integer i = f.fun("123");
        System.out.println(f.fun("123"));
    }
}
