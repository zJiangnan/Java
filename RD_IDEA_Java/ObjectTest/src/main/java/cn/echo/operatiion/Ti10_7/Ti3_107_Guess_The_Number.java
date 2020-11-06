package cn.echo.operatiion.Ti10_7;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:猜数字类
 * @Date:2020/10/7-18:47
 */
public class Ti3_107_Guess_The_Number {
    /**
     * 3，猜数字游戏：一个类Guess有一个成员变量v，有一个初值100。有一个
     *    toGuess方法，给方法传一个参数，对Guess类的成员变量v进行猜。
     *    如果大了则提示大了，小了则提示小了。等于则提示猜测成功。
     *    写一个测试类，让用户来输入数字猜数。
     */
    private int v = 100;

    public String Guess(int index) {
        if(index > 100)
            return "你猜大了";
         else if(index < 100)
            return "你猜小了";
         else
            return "你猜对了";
    }

}
