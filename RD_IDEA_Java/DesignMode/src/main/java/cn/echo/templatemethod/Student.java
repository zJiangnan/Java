package cn.echo.templatemethod;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/13-16:59
 */
public class Student extends AbstractPerson {
    @Override
    public void getUp() {
        System.out.println("学生起床");
    }

    @Override
    public void dressing() {
        System.out.println("学生穿衣服");
    }

    @Override
    public void eat() {
        System.out.println("学生吃早餐");
    }
}
