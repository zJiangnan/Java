package cn.echo.dao;

import cn.echo.pojo.Office;
import cn.echo.pojo.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : OfficeManage
 * @Author : Jiangnan
 * @Date: 2020/10/30 12:22
 * @Description : 办事处接口类
 **/
public interface OfficeManageDao {
    /**
     * 1、办事处添加
     * @return  返回添加的办事处对象
     */
    public Office officeAdd();

    /**
     * 2、办事处列表
     * @param officeHashMap 办事处集合
     */
    public void officeList(HashMap<Integer, String> officeHashMap);

    /**
     * 3、查看指定办事处的所有员工
     * @param userMap   用户集合
     */
    public void selectOfficeUser(Map<String, User> userMap);
}
