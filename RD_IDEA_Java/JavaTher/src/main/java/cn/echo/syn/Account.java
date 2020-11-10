package cn.echo.syn;

/**
 * @ClassName : Account
 * @Author : Jiangnan
 * @Date: 2020/11/9 18:57
 * @Description : 账户类
 **/
public class Account {
    private int no;
    private double money;

    public Account() {
    }

    public Account(int no, double money) {
        this.no = no;
        this.money = money;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "no=" + no +
                ", money=" + money +
                '}';
    }
}
