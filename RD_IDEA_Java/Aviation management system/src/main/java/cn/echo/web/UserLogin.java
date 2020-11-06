package cn.echo.web;

import cn.echo.service.UserManageService;

import java.util.Scanner;

/**
 * @ClassName : UserLogin
 * @Author : Jiangnan
 * @Date: 2020/10/31 17:20
 * @Description : 普通用户登录界面
 **/
public class UserLogin {

    /**
     * 创建用户功能实现类对象
     */
    private UserManageService userManageService = new UserManageService();
    Scanner sc = new Scanner(System.in);

    public void userDesktop(String username) {
        Integer userfunction = 0;
        System.out.println("--------\t欢迎" + username + "使用航空管理系统。٩(๑❛ᴗ❛๑)۶！！！\t--------");
        do {
            System.out.println("\n\t----------------------------------------------------\n");
            System.out.println("\t---------\t\t\t1、个人信息\t\t\t------------");
            System.out.println("\t---------\t\t\t2、修改密码\t\t\t------------");
            System.out.println("\t---------\t\t\t0、退出程序\t\t\t------------");
            System.out.println("\n\t----------------------------------------------------\n");
            System.out.println("-请输入：");
            userfunction = sc.nextInt();
            if (userfunction == 1 || userfunction == 2 || userfunction == 0){
                if (userfunction == 1) {
//                    个人信息
                    userManageService.showInfo();
                }else if (userfunction == 2) {
//                    修改密码
                    userManageService.updataPassword();
                }else {
                    System.out.println("==============\t\t退出程序\t\t===============");
                    try {
//                    休眠1s
                        Thread.sleep(1000);
                        System.exit(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }else {
                System.out.println("---\t输入错误，请重新输入！\t---");
            }
        } while (true);

    }
}
