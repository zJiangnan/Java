package cn.echo.testobj;

import cn.j008.game.Judger;
import cn.j008.game.Player;
import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:游戏测试
 * @Date:2020/10/7-16:21
 */
public class testGame {

    Player player1 = new Player("张三");
    Player player2 = new Player("李四");
    Judger judger = new Judger();
    Random r = new Random();

    @Test
    public void game() {
        for (int i = 0; i < 10; i++) {
            System.out.println("第" + (1 + i) + "决斗");
            int x = r.nextInt(2) + 1;
            int y = r.nextInt(2) + 1;
//            让裁判知晓俩玩家信息
            judger.ddd(player1,player2);
            player1.setQuan(x);
            player2.setQuan(y);
            judger.Pan();
            System.out.println("------------------------------");
        }
        judger.Panz();
    }
}
