package cn.echo.dao;

import cn.echo.pojo.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName : UserManageImpl
 * @Author : Jiangnan
 * @Date: 2020/10/30 12:27
 * @Description :用户管理实现类
 **/
public class UserManageDaoImpl implements UserManageDao {

    Scanner sc = new Scanner(System.in);

    /**
     * 1、用户添加
     * @param officeHashMap 办事处信息，用于判断用户输入的办事处ID是否存在
     * @return  返回符合的user对象
     */
    @Override
    public User userAdd(HashMap<Integer, String> officeHashMap) {
        User user = new User();
        System.out.println("\n----------添加账号----------\n");
        System.out.println("-请输入用户名：");
        user.setUsername(sc.next());
//        将用户登录的用户名作为id，在添加到集合中时，使用id作为主键，标志着用户名不能重复也就表明id的唯一性
        user.setUid(user.getUsername());
        System.out.println("-请输入密码：");
        user.setPassword(sc.next());
        System.out.println("-请输入年龄：");
        user.setAge(sc.nextInt());
//        角色默认为0普通用户
        user.setRole(0);
        System.out.println("-请输入邮箱：");
        user.setEmail(sc.next());
//        用于控制循环--如果办事处ID输入重复需要重新输入
        boolean flase = true;
        do {
            System.out.println("-请输入办事处ID：");
            int oid = sc.nextInt();
//        判断是否存在指定的办事处ID
            for (Integer i : officeHashMap.keySet()) {
                if (oid == i) {
                    user.setOid(oid);
//                    如果输入的ID和办事处ID相等跳出所有循环表示数据符合
                    flase = false;
                    break;
                }
            }
//            查找不到输入的办事处ID
            if (flase) {
                System.out.println("---\t不存在此办事处ID，请重新输入！！！\t---");
            }
        } while (flase);
//        账户默认状态为1表示为启用状态
        user.setStatus(1);
        return user;
    }

    /**
     * 在创建时，是否存在指定ID
     * @param userMap  用户集合
     * @param uid   新用户ID
     * @return  返回是否存在此ID
     */
    @Override
    public boolean isUserId(Map<String, User> userMap, String uid) {
        boolean flase = false;
        for (String str : userMap.keySet()) {
            if (str.equals(uid)) {
                flase = true;
            } else {
                flase = false;
            }
        }
        return flase;
    }

    /**
     * 2、修改密码
     * @param userMap   用户集合
     * @return  返回一个被修改后的用户集合数据
     */
    @Override
    public Map<String, User> updataPassword(Map<String, User> userMap) {
        System.out.println("---\t输入账号密码，以确认是本人操作\t---");
        do {
            System.out.println("-请输入账号：");
            String name = sc.next();
            System.out.println("-请输入密码：");
            String password = sc.next();
            for (String users : userMap.keySet()) {
//                判断是否存在此账号
                if (userMap.get(users).getUsername().equals(name)) {
//                    如果存在此账号判断密码是否正确
                    if (userMap.get(users).getPassword().equals(password)) {
                        System.out.println("-请输入新的密码：");
                        userMap.get(users).setPassword(sc.next());
                        System.out.println("---\t密码已修改\t---");
//                        密码修改完成后就不在需要循环
                        return userMap;
                    }
                }
            }
            System.out.println("---\t账号不存在或密码错误，重新输入！！\t---");
        } while (true);
    }

    /**
     * 3、查看个人信息
     * @param userMap   用户集合
     */
    @Override
    public void showInfo(Map<String, User> userMap) {
        System.out.println("---\t查看个人信息\t---");
        A:
        do {
            System.out.println("-请输入查看账号：");
            String name = sc.next();
            System.out.println("-请输入密码：");
            String password = sc.next();
            for (String users : userMap.keySet()) {
//                判断是否存在此账号
                if (userMap.get(users).getUsername().equals(name)) {
//                    如果存在此账号判断密码是否正确
                    if (userMap.get(users).getPassword().equals(password)) {
//                        存在时输出普通用户能查看的信息
                        System.out.println("---\t" + userMap.get(users).getUid() + "的个人信息\t---");
//                        因为账号信息某些数据时不能被普通用户查看到的所以只能输出几个可以被用户接触的几个数据
                        System.out.println("\t账号：" + userMap.get(users).getUsername());
                        System.out.println("\t办事处ID：" + userMap.get(users).getOid());
                        System.out.println("\t年龄：" + userMap.get(users).getAge());
                        System.out.println("\t邮箱：" + userMap.get(users).getEmail());
//                        跳出所有循环
                        break A;
                    }
                }
            }
            System.out.println("---\t账号不存在或密码错误，重新输入！！\t---");
        } while (true);
    }

    /**
     * 4、账号状态修改
     * @param userMap   用户集合
     * @return  返回一个被修改后的用户集合数据
     */
    @Override
    public Map<String, User> updataUserStatus(Map<String, User> userMap) {
        System.out.println("---\t修改账号状态\t---");
        do {
            System.out.println("-请输入修改的账号：");
            String name = sc.next();
            for (String users : userMap.keySet()) {
//                判断是否存在此账号
                if (userMap.get(users).getUsername().equals(name)) {
//                    如果存在此账号修改此账号的账号状态
                    System.out.println("-请输入修改的状态(0为禁用此账号，1为启用状态)：");
                    userMap.get(users).setStatus(sc.nextInt());
                    System.out.println("---\t" + userMap.get(users).getUid() + "，此账号状态已修改！！\t---");
//                    返回已被修改的的信息，否则修改的信息不会被保留
                    return userMap;
                }
            }
            System.out.println("---\t账号不存在，重新输入！！\t---");
        } while (true);
    }

    /**
     * 5、用户登录
     * @param userMap   用户集合
     * @return  返回登录的用户名
     */
    @Override
    public String userLogin(Map<String, User> userMap) {
        System.out.println("---\t用户登录\t---");
        do {
            System.out.println("-请输入账号：");
            String name = sc.next();
            System.out.println("-请输入密码：");
            String password = sc.next();
            for (String users : userMap.keySet()) {
//                判断是否存在此账号
                if (userMap.get(users).getUsername().equals(name)) {
//                    如果存在此账号判断密码是否正确
                    if (userMap.get(users).getPassword().equals(password)) {
//                        判断账号是否被禁用
                        if (userMap.get(users).getStatus() == 1) {
                            System.out.println("---\t登录成功\t---");
//                            返回登录成功表示账号可用
                            return name;
                        } else {
                            System.out.println("---\t账号异常已被禁用，请联系管理员修改权限\t---");
//                            账号不可用
                            System.out.println("==============\t\t退出程序\t\t===============");
                            try {
//                    休眠1s
                                Thread.sleep(1000);
                                System.exit(0);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
            System.out.println("---\t账号不存在或密码错误，重新输入！！\t---");
        } while (true);
    }

    /**
     * 6、修改用户角色
     * @param userMap   用户集合
     * @return  返回一个被修改后的用户集合数据
     */
    @Override
    public Map<String, User> updataUserRole(Map<String, User> userMap) {
        System.out.println("---\t修改用户角色\t---");
        do {
            System.out.println("-请输入修改的账号：");
            String name = sc.next();
            for (String users : userMap.keySet()) {
//                判断是否存在此账号
                if (userMap.get(users).getUsername().equals(name)) {
//                    如果存在此账号修改此账号的账号状态
                    System.out.println("-请输入修改的角色(0为普通用户，1为管理员)：");
                    userMap.get(users).setRole(sc.nextInt());
                    System.out.println("---\t" + userMap.get(users).getUid() + "，此账号角色已修改！！\t---");
//                    返回已被修改的的信息，否则修改的信息不会被保留
                    return userMap;
                }
            }
            System.out.println("---\t账号不存在，重新输入！！\t---");
        } while (true);
    }

    /**
     * 7、查看所有用户
     * @param userMap   用户集合
     */
    @Override
    public void userList(Map<String, User> userMap) {
        System.out.println("\n----------------\t\t用户列表\t\t----------------\n");
        for (String str : userMap.keySet()) {
            System.out.println(userMap.get(str).toString());
        }
    }

    /**
     * 8、删除用户
     * @param userMap   用户集合
     * @return  返回一个被修改后的用户集合数据
     */
    @Override
    public Map<String, User> deleteUser(Map<String, User> userMap) {
        System.out.println("---\t删除用户\t---");
        do {
            System.out.println("-请输入删除的账号：");
            String name = sc.next();
            for (String users : userMap.keySet()) {
//                判断是否存在此账号
                if (userMap.get(users).getUsername().equals(name)) {
//                    如果存在此账号修改此账号的账号状态
                    System.out.println("-是否删除此账号(输入“yes”表示删除,输入其他值表示不删除)：");
                    String isNot = sc.next();
//                    判断是否删除账号
                    if ("yes".equals(isNot)) {
//                        删除此账号
                        userMap.remove(users);
                        System.out.println("---\t" + name + "，已删除无法再次使用！！\t---");
                        return userMap;
                    } else {
                        System.out.println("---\t已取消删除" + name + "账号\t---");
//                        返回未删除的集合
                        return userMap;
                    }
                }
            }
            System.out.println("---\t账号不存在，重新输入！！\t---");
        } while (true);
    }
}
