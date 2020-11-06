package cn.echo.establish;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:饿汉式单例
 * @Date:2020/10/13-10:34
 */
public class Studen {
//    恶汉单例-在类加载时创建一个对象
    private static Studen stu = new Studen();
    public Studen() { }
    public static Studen getInstance() {
        if (stu != null)
            return stu;
        return null;
    }
}
