package cn.echo;

import cn.echo.enums.Color;
import cn.echo.enums.PROVINCES;
import org.junit.Test;

/**
 * @ClassName : EnumTest
 * @Author : Jiangnan
 * @Date: 2020/10/21 14:02
 * @Description : 测试枚举类
 **/
public class EnumTest {
    @Test
    public void test1() {
        System.out.println(PROVINCES.FJ.getProvinceName());
        System.out.println(PROVINCES.FJ.getIndex());

//        遍历所有的枚举值
        for (PROVINCES P : PROVINCES.values()) {
            System.out.println(P.getProvinceName());
            System.out.println(P.getIndex());
        }
    }

    @Test
    public void test2() {
//        返回true
        System.out.println(isRedColor(Color.RED));
    }
    
    public boolean isRedColor(Color color) {
        if(color.equals(Color.RED)){
            return true;
        } else {
            return false;
        }
    }
}
