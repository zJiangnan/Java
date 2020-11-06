package cn.echo.ti1029;

import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

/**
 * @ClassName : Ti_1
 * @Author : Jiangnan
 * @Date: 2020/10/29 19:05
 * @Description : 1：HashSet的使用 双色球规则：
 *                  双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 *                  红色球号码从1—33中选择；蓝色球号码从1—16中选择；
 *                  请随机生成一注双色球号码。（要求同色号码不重复）
 **/
public class Ti_1 {
    public static void main(String[] args) {
//        双色球号码不同，球色相同符合HashMap特性
        HashMap<Integer, String> map = new HashMap<>();
        Random r = new Random();
//        双色球有6个红球1个蓝球，那就是7个球
        while (map.size() != 7) {
//            先添加1个蓝球号码
            while (map.size() < 1) {
                map.put((r.nextInt(16) + 1), "蓝色");
            }
//            添加6个红球
            map.put((r.nextInt(33) + 1), "红色");
        }
//        遍历集合
        System.out.println("--------你的双色球号码出来了---------");
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i) + "--号码：" + i);
        }
    }
}
