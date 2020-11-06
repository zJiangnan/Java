package cn.echo.web;

import cn.echo.service.OfficeManagetService;
import cn.echo.service.UserManageService;

import java.util.Scanner;

/**
 * @ClassName : RootLogin
 * @Author : Jiangnan
 * @Date: 2020/10/31 17:21
 * @Description : 管理员用户登录界面
 **/
public class RootLogin {
    /**
     * 创建用户功能实现类对象
     */
    private UserManageService userManageService = new UserManageService();
    private OfficeManagetService officeManagetService = new OfficeManagetService();
    Scanner sc = new Scanner(System.in);

    public void rootDesktop(String username) {
        Integer userfunction = 0;
        System.out.println("--------\t欢迎您，管理员：" + username + "使用航空管理系统。٩(๑❛ᴗ❛๑)۶！！！\t--------");
        do {
            System.out.println("\n\t----------------------------------------------------\n");
            System.out.println("\t---------\t\t\t1、用户添加\t\t\t------------");
            System.out.println("\t---------\t\t\t2、修改密码\t\t\t------------");
            System.out.println("\t---------\t\t\t3、个人信息\t\t\t------------");
            System.out.println("\t---------\t\t\t4、状态修改\t\t\t------------");
            System.out.println("\t---------\t\t\t5、角色修改\t\t\t------------");
            System.out.println("\t---------\t\t\t6、用户列表\t\t\t------------");
            System.out.println("\t---------\t\t\t7、删除账户\t\t\t------------");
            System.out.println("\t----------------------------------------------------");
            System.out.println("\t--------\t\t\t11、添加办事处\t\t\t--------");
            System.out.println("\t---------\t\t\t12、办事列表\t\t\t------------");
            System.out.println("\t----------\t13、查询指定办事处的所有员工\t\t------------");
            System.out.println("\t---------\t\t\t0、退出程序\t\t\t------------");
            System.out.println("\t----------------------------------------------------");
            System.out.println("\n\t----------------------------------------------------\n");
            System.out.println("-请输入：");
            userfunction = sc.nextInt();
                switch (userfunction) {
                    case 1 :
                        userManageService.userAdd();
                        break;
                    case 2 :
                        userManageService.updataPassword();
                        break;
                    case 3 :
                        userManageService.showInfo();
                        break;
                    case 4 :
                        userManageService.updataUserStatus();
                        break;
                    case 5 :
                        userManageService.updataUserRole();
                        break;
                    case 6 :
                        userManageService.userList();
                        break;
                    case 7 :
                        userManageService.delectUser();
                        break;
                    case 11 :
                        officeManagetService.add();
                        break;
                    case 12 :
                        officeManagetService.showInfo();
                        break;
                    case 13 :
                        officeManagetService.selectOfficeUser();
                        break;
                    case 0:
                        System.out.println("==============\t\t退出程序\t\t===============");
                        try {
//                    休眠1s
                            Thread.sleep(1000);
                            System.exit(0);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    default:
                        System.out.println("---\t输入错误，请重新输入！\t---");
                        break;
                }
        } while (true);
    }
}
