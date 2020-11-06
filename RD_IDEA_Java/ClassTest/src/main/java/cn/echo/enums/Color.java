package cn.echo.enums;

/**
 * @ClassName : Color
 * @Author : Jiangnan
 * @Date: 2020/10/21 13:52
 * @Description : 颜色枚举类
 **/
public enum Color {

    /**
     * 枚举的诞生：
     *          在JDK5之前，定义常量需要使用public final static单独定义，如果有一组常量，需要定义一组final修饰的类型，这样会很繁琐
     *          JDK5后推出枚举类型，可以将一组常量定义一个自定义类，使用时通过该类型直接方法。
     * 语法：
     *      public enum 枚举类名{
     *          值1,
     *          值2,
     *          值3,
     *      }
     * 规范：定义英文常量时使用大写，如果定义颜色RED这样
     */

    RED,
    BLUE,
    YELLOW,
}
