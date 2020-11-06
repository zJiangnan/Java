package cn.echo.dao;

import cn.echo.pojo.Office;
import cn.echo.pojo.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName : OfficeManageImpl
 * @Author : Jiangnan
 * @Date: 2020/10/30 12:33
 * @Description : 办事处模块实现类
 **/
public class OfficeManageDaoImpl implements OfficeManageDao {

    Scanner sc = new Scanner(System.in);

    /**
     * 1、办事处添加
     * @return  返回一个办事处对象
     */
    @Override
    public Office officeAdd() {
        Office office = new Office();
        System.out.println("\n----------添加新的办事处----------\n");
        System.out.println("-请输入新的办事处ID：");
        office.setOid(sc.nextInt());
        System.out.println("-请输入新的办公室名：");
        office.setOfficeName(sc.next());
        return office;
    }

    /**
     * 2、办事处列表
     * @param officeHashMap 办事处集合
     */
    @Override
    public void officeList(HashMap<Integer, String> officeHashMap) {
        System.out.println("\n----------航空办事处办公室表----------\n");
        System.out.println("\t办公室ID\t\t\t办公室名称");
        for (Integer i : officeHashMap.keySet()) {
            System.out.println("\t" + i + "—————————>" + officeHashMap.get(i) + "\t");
        }
    }

    /**
     * 3、查询指定办事处的所有员工
     * @param userMap   用户集合
     */
    @Override
    public void selectOfficeUser(Map<String, User> userMap) {
        System.out.println("\n----------查看指定办公室的员工----------\n");
        System.out.println("-请输入办公室ID：");
        Integer officeId = sc.nextInt();
        System.out.println("---\t" + officeId + "用户表\t---");
//        遍历所有用户
        for (String users : userMap.keySet()) {
//            输出指定办公室ID的员工
            Integer oid = userMap.get(users).getOid();
            if (userMap.get(users).getOid().equals(officeId)) {
                System.out.println(userMap.get(users).toString());
            }
        }
    }
}
