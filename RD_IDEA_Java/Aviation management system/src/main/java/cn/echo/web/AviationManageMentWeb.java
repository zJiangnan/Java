package cn.echo.web;

import cn.echo.service.UserManageService;

import java.util.Scanner;

/**
 * @ClassName : AviationManageMent
 * @Author : Jiangnan
 * @Date: 2020/10/30 12:30
 * @Description : 航空管理系统
 **/
public class AviationManageMentWeb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        登录或退出
        String login = "";
//        判断登录或退出
        String login1 = "登录", login2 = "退出";

        System.out.println("\n\n===============欢迎使用航空管理系统===============\n");
        System.out.println("-----------\t\t\t登录\t\t\t--------------");
        System.out.println("-----------\t\t\t退出\t\t\t--------------");
        System.out.println("\n\n==============================================\n");
        System.out.println("---请输入：");
        do {
            login = sc.next();
            if (login.equals(login1)) {
//                表示登录
                UserManageService userManageService = new UserManageService();
//                接收登录的是管理员还是普通用户，因为他们会进入不同的界面
                Integer status = userManageService.login();
//                接收登录用户的用户名
                String username = userManageService.getUsername();
                if(status == 1) {
//                    如果status等于1表示进入管理员界面
                    RootLogin rootLogin = new RootLogin();
                    rootLogin.rootDesktop(username);
                } else {
//                    不等于1就是0便进入普通用户界面
                    UserLogin userLogin = new UserLogin();
                    userLogin.userDesktop(username);
                }
            } else if (login.equals(login2)) {
//                表示退出
                System.out.println("==============\t\t退出程序\t\t===============");
                try {
//                    休眠1s
                    Thread.sleep(1000);
                    System.exit(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {
//                表示输入错误
                System.out.println("---\t输入有误，请重新输入！！\t---");
            }
        } while (!login1.equals(login) && !login2.equals(login));
    }
}
