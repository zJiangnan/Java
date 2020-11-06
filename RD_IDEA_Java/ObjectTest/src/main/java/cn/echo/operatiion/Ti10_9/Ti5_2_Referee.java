package cn.echo.operatiion.Ti10_9;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/12-8:38
 */
public class Ti5_2_Referee implements Ti5_1_Game {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void playgame(Ti5_Play play1, Ti5_Play play2) {
        if (play1.getFinger() - 1 == play2.getFinger() || play1.getFinger() - play2.getFinger() == -4) {
            System.out.println(play1.getName() + "出的：" + play1.getFinger() + "\t" +
                    play2.getName() + "出的：" + play2.getFinger() + "\n"
                    + play1.getName() + " 赢");

        } else if (play2.getFinger() - 1 == play1.getFinger() || play2.getFinger() - play1.getFinger() == -4) {
            System.out.println(play2.getName() + "出的：" + play2.getFinger() + "\t" +
                    play1.getName() + "出的：" + play1.getFinger() + "\n"
                    + play2.getName() + " 赢");
        } else {
            System.out.println("平局");
        }
    }
}
