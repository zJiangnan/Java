package cn.echo.templatemethod;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/13-17:00
 */
public class Teacher extends AbstractPerson {
    @Override
    public void getUp() {
        System.out.println("老师起床");
    }

    @Override
    public void dressing() {
        System.out.println("老师穿衣服");
    }

    @Override
    public void eat() {
        System.out.println("老师吃早餐");
    }
}
