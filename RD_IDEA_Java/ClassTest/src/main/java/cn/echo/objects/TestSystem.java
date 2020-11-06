package cn.echo.objects;

/**
 * ClassName: TestSystem
 * Description:
 * date: 2020/10/20 11:54
 *
 * @author wuyafeng
 * @version 1.0   softeem.com
 */
public class TestSystem {
    public static void main(String[] args) {
        // System 属于系统类
       //  System.out; // 获取控制台的打印流
        // 设置JVM运行时 系统参数
        System.setProperty("encoding","UTF-8");
        System.out.println("获取："+System.getProperty("encoding"));
        // 时间从 1970-01-01
        System.out.println("获取当前系统的时间毫秒数："+ System.currentTimeMillis());

        System.exit(0); // 0 ： 表示JVM正常退出    -1 表示非正常退出

    }
}
