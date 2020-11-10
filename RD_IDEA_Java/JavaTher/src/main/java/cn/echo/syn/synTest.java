package cn.echo.syn;

/**
 * @ClassName : synTest
 * @Author : Jiangnan
 * @Date: 2020/11/9 19:05
 * @Description :
 **/
public class synTest {
//    同步代码块
    /*public static void main(String[] args) {
//        此处结果是：数据同步，但是判断条件成立，输出结果不是指定结果。小明和爸爸都取到钱但是同样是100；其中有一个人应该显示余额不足提示
//        创建一个账户
        Account account = new Account(1,1100);
//        创建一个用户--小明
        GetMoney getMoney1 = new GetMoney(account);
        Thread th1 = new Thread(getMoney1, "小明");
//        创建第二个用户--爸爸
        GetMoney getMoney2 = new GetMoney(account);
        Thread th2 = new Thread(getMoney2, "爸爸");
        th1.start();
        th2.start();
    }*/

//    同步方法和同步代码块都适用----（同步代码块填this时只能使用此  只能有一个GetMoney对象）
    public static void main(String[] args) {
        Account account = new Account(2,1100);
//        只能创建一个getMoney this锁表示同一个对象
        GetMoney getMoney = new GetMoney(account);
//        开启两个线程
        Thread th1 = new Thread(getMoney, "小明");
        Thread th2 = new Thread(getMoney, "爸爸");
        th1.start();
        th2.start();
    }
}
