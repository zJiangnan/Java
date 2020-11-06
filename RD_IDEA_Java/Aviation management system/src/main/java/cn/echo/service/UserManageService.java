package cn.echo.service;

import cn.echo.dao.UserManageDao;
import cn.echo.dao.UserManageDaoImpl;
import cn.echo.pojo.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : UserManageService
 * @Author : Jiangnan
 * @Date: 2020/10/30 16:30
 * @Description :用户操作的业务逻辑类
 **/
public class UserManageService {

    /**
     * 创建map集合用于存放用户信息，为静态让程序运行时创建两个管理员用户
     */
    private static Map<String, User> userMap = new HashMap<>();
    /**
     * 创建用户管理接口对象，用户调用用户接口的实现类里的方法
     */
    private UserManageDao userManageDao = new UserManageDaoImpl();
    /**
     * 创建map集合用于接收办事处传递过来的信息，用于判断用户注册时输入的办事处ID是否正确
     */
    private Map<Integer, String> officeMap = new HashMap<>();
    /**
     * 用于保存用户登录时账号状态，默认为0禁用状态，不为0时表示启用状态
     */
    private String username = "您";

    /**
     * 1、添加用户
     */
    public void userAdd() {
//        获取办事处信息有，用于判断用户注册时的办事处ID
        officeMap = new OfficeManagetService().userAndOffice();
//        将获取到的办事处集合信息传递给 用户管理实现类 进行判断用户输入的办事处ID
        User user = new User();
        do {
            user = userManageDao.userAdd((HashMap<Integer, String>) officeMap);
//            判断是否存在添加用户时的ID
            if(userManageDao.isUserId(userMap, user.getUid())) {
                System.out.println("---\t此用户名已被注册，请重新输入！！！\t---");
            }
        }while(userManageDao.isUserId(userMap, user.getUid()));
//        将获取到的用户对象添加到map集合中去
        userMap.put(user.getUid(), user);
        System.out.println("---\t用户添加成功！！！\t---");
    }

    /**
     *2、修改密码
     */
    public void updataPassword() {
        System.out.println("-----\t修改密码\t-----");
        userMap =  userManageDao.updataPassword(userMap);
    }

    /**
     * 3、个人信息查看
     */
    public void showInfo() {
        userManageDao.showInfo(userMap);
    }

    /**
     * 4、用户账号状态修改
     */
    public void updataUserStatus() {
//        接收被修改的信息
        userMap = userManageDao.updataUserStatus(userMap);
    }

    /**
     * 5、用户登录
     */
    public void userLogin() {
//        保存用户登录的用户名
        username = userManageDao.userLogin(userMap);
    }

    /**
     * 6、修改用户角色
     */
    public void updataUserRole() {
//        接收被修改的信息
        userMap = userManageDao.updataUserRole(userMap);
    }

    /**
     * 7、显示所有用户信息
     */
    public void userList() {
        userManageDao.userList(userMap);
    }

    /**
     * 8、删除用户
     */
    public void delectUser() {
        userMap = userManageDao.deleteUser(userMap);
    }

    /**
     * 用户登录后是管理员还是普通用户，账号被禁用还是启用状态
     * @return
     */
    public Integer login() {
//        创建角色状态的返回值，默认普通用户
        Integer role = 0;
//        调用5，首先判断账号是否可用
        userLogin();
//        判断是管理员还是普通用户
        for (String users : userMap.keySet()) {
            if (userMap.get(users).getUsername().equals(username)) {
//                返回角色状态---1表示管理员、0表示普通用户
                role =  userMap.get(users).getRole();
            }
        }
        return role;
    }

    /**
     * 将用户集合传递给办事处，用于查询指定办公室的所有员工
     * @return  返回用户集合
     */
    public Map<String, User> officeAndUser() {
        return userMap;
    }

    /**
     * 添加两个管理用户
     * 添加两个普通用户
     *      当程序执行时创建两个管理员和两个普通用户
     */
    static {
        User admin = new User("admin", "admin", "admin", 20, 1, "666@163.com", -1, 1);
        User admin123 = new User("admin123", "admin123", "admin123", 20, 1, "888@163.com", 0, 1);
        User u1 = new User("123", "123", "123", 18, 0, "290835@163.com", 1, 1);
        User u2 = new User("321", "321", "321", 22, 0, "238975@163.com", 1, 0);
        userMap.put(admin.getUid(), admin);
        userMap.put(admin123.getUid(), admin123);
        userMap.put(u1.getUid(), u1);
        userMap.put(u2.getUid(), u2);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
