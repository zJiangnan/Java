package cn.echo;

import cn.echo.service.UserManageService;

/**
 * @ClassName : TestAddUser
 * @Author : Jiangnan
 * @Date: 2020/10/30 17:19
 * @Description : 测试用户注册功能
 **/
public class TestUser {
    public static void main(String[] args) {
        UserManageService ums = new UserManageService();
        /*for (int i = 0; i < 2; i++) {
            System.out.println("用户注册");
            ums.add();
        }*/
//        测试显示所有用户
        ums.userList();
//        测试修改密码
        /*ums.updataPassword();
        System.out.println("-------------------");
        ums.userList();*/
        System.out.println("-------------------");
//        测试修改账户登录状态
        /*ums.updataUserStatus();
        ums.userList();*/
//        测试修改用户角色
//        ums.updataUserRole();
//        测试删除用户
        ums.delectUser();
        ums.userList();
//        测试查看个人信息
//        ums.showInfo();
//        测试登录
//        ums.userLogin();

    }
}
