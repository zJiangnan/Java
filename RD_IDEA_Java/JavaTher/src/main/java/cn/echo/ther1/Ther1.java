package cn.echo.ther1;

/**
 * @ClassName : Ther1
 * @Author : Jiangnan
 * @Date: 2020/11/4 16:15
 * @Description : 单线程
 **/
public class Ther1 {

    /**
     * 主线程
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("主线程开始");
        method1();
        System.out.println("主线程结束");
    }
    public static void method1() {
        System.out.println("method1开始");
        method2();
        System.out.println("method1结束");
    }
    public static void method2() {
        System.out.println("method2开始");
        method3();
        System.out.println("method2结束");
    }
    public static void method3() {
        System.out.println("method3开始");
        method4();
        System.out.println("method3结束");
    }
    public static void method4() {
        System.out.println("method4开始");
        System.out.println("method4结束");
    }
}
