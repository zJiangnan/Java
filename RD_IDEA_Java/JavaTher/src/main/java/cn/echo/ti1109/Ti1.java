package cn.echo.ti1109;

/**
 * @ClassName : Ti1
 * @Author : Jiangnan
 * @Date: 2020/11/9 19:28
 * @Description : 1、假设某家银行可接受顾客的汇款，每进行一步汇款，便可计算出汇款总额。现有两名顾客，
 * 每人都分3次.每次100元将钱汇入。试编写一个程序，来模拟顾客的汇款操作。 （假如是往同一个账号中汇入 ）
 **/
public class Ti1 {
    public static void main(String[] args) {
//        创建转账业务的对象
        Ti_Money money = new Ti_Money(new Ti1_Account(1, 0));
//        创建两个人
        Thread th1 = new Thread(money, "张三");
        Thread th2 = new Thread(money, "李四");
        System.out.println("--------开始向银行汇款--------");
        th1.start();
        th2.start();
    }
}
