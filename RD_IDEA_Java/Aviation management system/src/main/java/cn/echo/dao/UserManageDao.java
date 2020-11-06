package cn.echo.dao;

import cn.echo.pojo.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : UserManage
 * @Author : Jiangnan
 * @Date: 2020/10/30 12:03
 * @Description : 用户管理接口
 **/
public interface UserManageDao {
    /**
     * 1、添加用户
     * @param officeHashMap 办事处信息，用于判断用户输入的办事处ID是否存在
     * @return  返回符合的user对象
     */
    public User userAdd(HashMap<Integer, String> officeHashMap);

    /**
     * 在创建时，是否存在指定ID
     * @param userMap  用户集合
     * @param uid   新用户ID
     * @return  返回是否存在此ID
     */
    public boolean isUserId(Map<String, User> userMap,String uid);

    /**
     * 2、修改密码
     * @param userMap   用户集合
     * @return  返回被修改后的用户集合
     */
    public Map<String, User> updataPassword(Map<String, User> userMap);

    /**
     * 3、个人信息查看
     * @param userMap   用户集合
     */
    public void showInfo(Map<String, User> userMap);

    /**
     * 4、修改账号状态
     * @param userMap   用户集合
     * @return  返回被修改后的用户集合
     */
    public Map<String, User> updataUserStatus(Map<String, User> userMap);

    /**
     * 5、用户登录
     * @param userMap   用户集合
     * @return  返回登录的用户名
     */
    public String userLogin(Map<String, User> userMap);

    /**
     * 6、修改用户角色
     * @param userMap   用户集合
     * @return  返回被修改后的用户集合
     */
    public Map<String, User> updataUserRole(Map<String, User> userMap);

    /**
     * 7、用户列表
     * @param userMap   用户集合
     */
    public void userList(Map<String, User> userMap);

    /**
     * 8、删除用户
     * @param userMap   用户集合
     * @return  返回一个被修改后的用户集合数据
     */
    public Map<String, User> deleteUser(Map<String, User> userMap);
}
