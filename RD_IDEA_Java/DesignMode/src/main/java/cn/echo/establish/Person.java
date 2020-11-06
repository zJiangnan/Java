package cn.echo.establish;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:懒汉式单例
 * @Date:2020/10/13-10:18
 */
public class Person {
    // 为了不让其他类直接访问该成员
    private static Person person = null;
    //1、将构造器私有化
    private Person() {
    }
    //2 提供一个静态的方法，并可返回该类的对象
    public static Person getInstance() {
        if (person == null) { // 第一次访问
            person = new Person();
        }
        return person;
    }
}
