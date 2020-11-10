package cn.echo.ti1109;

/**
 * @ClassName : Ti_Money
 * @Author : Jiangnan
 * @Date: 2020/11/9 19:31
 * @Description : 转账的业务
 **/
public class Ti_Money implements Runnable {

    //    创建一个账户并在创建转账业务对象时初始化该账户---此账户表示银行账户
    Ti1_Account account;
    public Ti_Money (Ti1_Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + "正在进行汇款操作。。。。");
                try {
                    Thread.sleep(500);
                    account.setMoney(account.getMoney() + 100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("汇款完成，余额：" + account.getMoney());
            }
        }
    }
}
