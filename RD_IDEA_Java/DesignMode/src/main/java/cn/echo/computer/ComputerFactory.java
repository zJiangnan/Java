package cn.echo.computer;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:电脑的工厂类-这个工厂实现台式机类和笔记本类
 * @Date:2020/10/13-11:17
 */
public class ComputerFactory {

    public Computer produce(String type) {
        Computer com = null;
//        如果想调用笔记本类传入的值与此值相等就将笔记本类对象给电脑接口
        if (type.equals("person")) {
            com = new Person();
//        如果想调用台式机类传入的值与此值相等就将台式机类对象给电脑接口
        }else if (type.equals("work")) {
            com = new Work();
//            如果都不等于就说明没有要调用的方法
        }else
            System.out.println("不能生产其他玩意儿！");
//        返回相应的对象
        return com;
    }
}
