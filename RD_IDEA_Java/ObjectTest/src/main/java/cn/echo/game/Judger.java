package cn.echo.game;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:裁判类
 * @Date:2020/10/7-15:59
 */
public class Judger {
//    成员属性
    private String name = "裁判"; //名字
    private Player player1;     //玩家1
    private Player player2;     //玩家2

//    成员方法

    /**
     * 判断一次的输赢
     */
    public void Pan() {
        int p1 = player1.getQuan();
        int p2 = player2.getQuan();
        if (p1 == p2) {
            System.out.println("平局啦！");
        }
        if(p1 == 1 && p2 == 2) {
            player1.integral += 1;
            player2.integral -= 1;
            System.out.println(player1.getName() + "出石头，" + player2.getName() + "出剪刀");
            System.out.println(player1.getName() + "胜利!积分为：" + player1.getIntegral());
        }
        if(p1 == 2 && p2 == 1) {
            player1.integral -= 1;
            player2.integral += 1;
            System.out.println(player1.getName() + "出剪刀，" + player2.getName() + "出石头");
            System.out.println(player2.getName() + "胜利!积分为：" + player2.getIntegral());
        }
        if(p1 == 1 && p2 == 3) {
            player1.integral -= 1;
            player2.integral += 1;
            System.out.println(player1.getName() + "出石头，" + player2.getName() + "出布");
            System.out.println(player2.getName() + "胜利!积分为：" + player2.getIntegral());
        }
        if(p1 == 3 && p2 == 1) {
            player1.integral += 1;
            player2.integral -= 1;
            System.out.println(player1.getName() + "出布，" + player2.getName() + "出石头");
            System.out.println(player1.getName() + "胜利!积分为：" + player1.getIntegral());
        }
        if(p1 == 2 && p2 == 3) {
            player1.integral += 1;
            player2.integral -= 1;
            System.out.println(player1.getName() + "出剪刀，" + player2.getName() + "出布");
            System.out.println(player1.getName() + "胜利!积分为：" + player1.getIntegral());
        }
        if(p1 == 3 && p2 == 2) {
            player1.integral -= 1;
            player2.integral += 1;
            System.out.println(player1.getName() + "出布，" + player2.getName() + "出剪刀");
            System.out.println(player2.getName() + "胜利!积分为：" + player2.getIntegral());
        }
    }

    /**
     * 为俩位玩家赋值
     * @param player1   玩家1
     * @param player2   玩家2
     */
    public void ddd(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    /**
     * 判断最终的输赢
     */
    public void Panz() {
        System.out.println(player1.getName() + "最终积分为："+ player1.getIntegral());
        System.out.println(player2.getName() + "最终积分为："+ player2.getIntegral());
        if (player1.getIntegral() > player2.getIntegral())
            System.out.println("玩家" + player1.getName() + "获得最终胜利！");
        else
            System.out.println("玩家" + player2.getName() + "获得最终胜利！");
    }

//    Get和Set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
}
