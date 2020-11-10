package cn.echo.ti1109;

/**
 * @ClassName : Ti1_Account
 * @Author : Jiangnan
 * @Date: 2020/11/9 19:29
 * @Description : 汇款账号
 **/
public class Ti1_Account {
    private int no;
    private double money;

    public Ti1_Account() {
    }

    public Ti1_Account(int no, double money) {
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
