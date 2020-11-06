package cn.echo.computer;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:电脑的工厂类-这个工厂实现台式机类和笔记本类--静态
 * @Date:2020/10/13-11:31
 */
public class ComputerFactory2 {

    public static Computer pro(String type) {
        Computer com = null;
        if (type.equals("p"))
            com = new Person();
        else if(type.equals("w"))
            com = new Work();
        else
            System.out.println("你傻啊");
        return com;
    }
}
