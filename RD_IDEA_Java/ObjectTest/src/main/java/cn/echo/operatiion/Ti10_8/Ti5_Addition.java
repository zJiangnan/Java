package cn.echo.operatiion.Ti10_8;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:Addition类
 * @Date:2020/10/8-20:22
 * 5、编写Addition类，该类中应包含一组实现两数相加运算的重载方法。
 *    实现加法运算的方法，应接受两个参数（即加数和被加数），方法将
 *    两个参数进行加法运算后，返回相加结果。考虑可能针对不同的数据类型进行计算，
 *    重载一组方法，包括整型、长整型、浮点型、双精度浮点型、还有字符串。
 *    在main方法中分别测试方法。
 */
public class Ti5_Addition {

    public int add(int a, int b) {
        return a + b;
    }
    public long add(long a, long b) {
        return a + b;
    }
    public float add(float a, float b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public String add(String a, String b) {
        return a + b;
    }
}
