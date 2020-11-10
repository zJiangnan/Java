package cn.echo.syn;

/**
 * @ClassName : GetMoney
 * @Author : Jiangnan
 * @Date: 2020/11/9 18:58
 * @Description : 取钱
 **/
public class GetMoney implements Runnable {

//    由于账户是同一个
    Account account;
    public GetMoney(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("取钱");
//        增加互斥锁，协同步伐，这个锁必须是公有的对象
//        两个getMoney对象时，填this对象输出有问题，填account没问题
//        如果只有一个getMoney对象时，this就表示当前对象，不会出错
        synchronized (this) {
//            先判断战虎余额是否足够
            if(account.getMoney() >= 1000) {
                System.out.println(Thread.currentThread().getName() + "可以取钱");
                System.out.println(Thread.currentThread().getName() + "正在取钱");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                更新账户余额
                account.setMoney(account.getMoney() - 1000);
                System.out.println(Thread.currentThread().getName() + "已取钱，余额：" + account.getMoney());
            }else {
                System.out.println("余额不足");
            }
        }
//        get();
    }

    /**
     * 同步代码块或同步方法执行流程：线程A、线程B同时执行到该方法时，互抢一把锁，谁先抢到谁先执行
     * 另一个线程则必须等待，只有当抢到锁的一方长执行完代码后释放锁对象，另一方才可以拿到锁再执行代码块
     */
    public synchronized void get() {
//        先判断战虎月是否足够
        if (account.getMoney() >= 1000) {
            System.out.println(Thread.currentThread().getName() + "可以取钱");
            System.out.println(Thread.currentThread().getName() + "正在取钱");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.setMoney(account.getMoney() - 1000);
            System.out.println(Thread.currentThread().getName() + "已取钱，余额：" + account.getMoney());
        }else {
            System.out.println("余额不足");
        }
    }
}
