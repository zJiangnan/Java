package cn.echo.yichang;

import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:自定义异常类及实现
 * @Date:2020/10/19-11:17
 */
public class abnormal {

    //    创建自定义异常类
    public class abException extends Exception {
//        有参构造方法接收创建对象时的异常信息
        public abException(String message) {
//            将异常信息传给父类的有参构造方法（有参构造方法是对message属性赋值）
            super(message);
        }
    }
//    处理逻辑判断是否有异常
    public String yi1(String user, String password) throws abException {
        if (!(user.equals("123") && password.equals("123")))
//            如果n==0就不能被整除将异常信息传给自定义异常类
            throw new abException("用户名错误");
        else
            return "登录成功";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        abnormal ab = new abnormal();
        try {
            while(true) {
                System.out.println("输入账号：");
                String a = sc.next();
                System.out.println("输入密码：");
                String b = sc.next();
                String str = ab.yi1(a,b);
                System.out.println(str);
            }
        } catch (Exception e) {
//            输出异常信息--调用父类Exception的getMessage方法输出异常信息
            System.out.println(e.getMessage());
        }
    }
}
