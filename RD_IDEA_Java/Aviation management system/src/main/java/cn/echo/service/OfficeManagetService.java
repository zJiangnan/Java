package cn.echo.service;

import cn.echo.dao.OfficeManageDao;
import cn.echo.dao.OfficeManageDaoImpl;
import cn.echo.pojo.Office;
import cn.echo.pojo.User;

import java.util.*;

/**
 * @ClassName : AviationManagementService
 * @Author : Jiangnan
 * @Date: 2020/10/30 12:35
 * @Description : 办事处操作的业务逻辑类
 **/
public class OfficeManagetService {

    /**
     * 创建有序的Map集合,这样保证办事处的id的唯一性
     */
    private static Map<Integer, String> officeMap = new HashMap<>();
    /**
     * 创建OfficeManageDao的对象
     */
    private OfficeManageDao officeManageDao = new OfficeManageDaoImpl();

    /**
     * 创建用于接收用户集合的集合，用于输出指定办公室的所有员工
     */
    private Map<String, User> userMap = new HashMap<>();

    /**
     * 1、办事处添加
     */
    public void add() {
//        在不知道什么情况下才能输入正确且不重复的的数据时
        while (true) {
//        获取到数据
            Office office = officeManageDao.officeAdd();
//            获取未被添加的集合大小
            int size = officeMap.size();
//                先将获取到的数据添加无论是否重复
            officeMap.put(office.getOid(),office.getOfficeName());
//                重复说明未被添加--长度是不会改变的
            if (officeMap.size() == size) {
                System.out.println("---\t此名称已被注册，请重新输入！！！\t---");
//                    如果if不成立说明size被改变数据成功添加到集合跳出while循环
            } else {
                System.out.println("---\t恭喜你，办事处办公区建立成功！！！\t---");
                break;
            }
        }
    }

    /**
     * 2、显示所有办事处
     */
    public void showInfo() {
        officeManageDao.officeList((HashMap<Integer, String>) officeMap);
    }

    /**
     * 3、查看指定办事处的所有员工
     */
    public void selectOfficeUser() {
//        接收用户集合
        userMap = new UserManageService().officeAndUser();
        officeManageDao.selectOfficeUser(userMap);
    }

    /**
     * 将办事处集合传递给用户操作类中判断注册用户输入的办事处Id是否正确
     * @return  返回办事处集合
     */
    public HashMap<Integer, String> userAndOffice() {
        return (HashMap<Integer, String>) officeMap;
    }

    /**
     * 用于创建初始的办事处
     */
    static {
        officeMap.put(-1, "办事处管理员");
        officeMap.put(0, "办事处0");
        officeMap.put(1, "第一办事处");
    }

}
