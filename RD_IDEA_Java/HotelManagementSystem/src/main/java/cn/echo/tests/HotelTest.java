package cn.echo.tests;

import cn.echo.pojo.User;
import cn.echo.service.UserService;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @ClassName : HotelTest
 * @Author : Jiangnan
 * @Date: 2020/11/5 9:58
 * @Description : 测试
 **/
public class HotelTest {
    public static void main(String[] args) throws FileNotFoundException {
        UserService userService = new UserService();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------酒店管理----------------------");
        System.out.println("1、用户登录  2、注册");
        int k = sc.nextInt();
        if (k == 1) {
            System.out.println("请输入用户名密码");
            String name = sc.next();
            String password = sc.next();
            User user = userService.login(name, password);
            if (user != null) {
                System.out.println("登录成功");
                if (user.getRole() == 2) {
//                管理员
                } else {
//                普通用户
                }
            }
        }else if (k == 2) {
            System.out.println("注册用户，请输入基本信息(id， 用户名， 密码)");
        }else {
            System.out.println("输入错误");
        }
    }
}
