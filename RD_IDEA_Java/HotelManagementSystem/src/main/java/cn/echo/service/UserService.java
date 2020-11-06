package cn.echo.service;

import cn.echo.pojo.User;
import cn.echo.util.IOUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : UserService
 * @Author : Jiangnan
 * @Date: 2020/11/5 9:41
 * @Description : 用户功能类
 **/
public class UserService {
    private static String path = "FileData/hotel.txt";
    private static List<User> list = new ArrayList<>();
    private static IOUtil<User> ioUtil = new IOUtil<>();

    /**
     * 添加用户
     * @param user
     * @return
     * @throws FileNotFoundException
     */
    public boolean register(User user) throws FileNotFoundException {
//        1、先读取文件，检索是否存在初始化账户，如果文件存在不添加
        List<User> users = ioUtil.readList(path);
        if (users != null) {
//            查看用户名是否重复
            for (User u : users) {
                if(u.getUname().equals(user.getUname())) {
                    System.out.println("用户名已存在");
                    return false;
                }
            }
//            如果没有重复的--注册
            list.add(user);
//            保存数据到文件
            ioUtil.writeList(path, list);
            return true;
        }
//        如果users为空返回false
        return false;
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password) throws FileNotFoundException {
//        读文件的数据
        List<User> list = ioUtil.readList(path);
        if (list != null) {
            for (User u : list) {
                if(u.getUname().equals(username) && u.getPassword().equals(password)) {
                    return u;
                }
            }
        }
        return null;
    }


    static {
        File file = new File(path);
        if (!file.exists()) {
//        初始化一个用户
            User user = new User(1000, "admin", "123", 2);
            list.add(user);
//        添加用户
            ioUtil.writeList(path, list);
        }
    }
}
