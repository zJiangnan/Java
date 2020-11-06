package cn.echo.templatemethod;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/13-16:56
 */
public abstract class AbstractPerson {
    /*
    * 模板方法
    * */
    public void presonSchool() {
        getUp();
        dressing();
        eat();
    }

    public abstract void getUp();
    public abstract void dressing();
    public abstract void eat();
}
