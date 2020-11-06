package cn.echo;

import cn.echo.service.OfficeManagetService;
import org.junit.Test;

/**
 * @ClassName : TestAddOffice
 * @Author : Jiangnan
 * @Date: 2020/10/30 15:56
 * @Description : 测试添加办事处办公室功能、及查询办事处的所有办公室
 **/
public class TestOffice {
    public static void main(String[] args) {
        OfficeManagetService ams = new OfficeManagetService();
//        添加数据
        /*for (int i = 0; i < 2; i++) {
            ams.add();
        }*/
//        查询所有办公室
        ams.showInfo();
        ams.selectOfficeUser();
    }
}
