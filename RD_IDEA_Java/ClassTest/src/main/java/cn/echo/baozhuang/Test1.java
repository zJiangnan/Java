package cn.echo.baozhuang;

/**
 * ClassName: Test1
 * Description:
 * date: 2020/10/20 9:13
 *
 * @author wuyafeng
 * @version 1.0   softeem.com
 */
public class Test1 {

    public static void main(String[] args) {
        // 1、byte 的包装类   Byte
        // 创建包装类的对象
        byte b=123;
        Byte obj1 = new Byte(b);
        //1、 包装类 转字符串   包装类对象.toString()
        String s1 = obj1.toString();

        //2、字符串转包装类      new 包装类(s) 或者   包装类.valueOf(s)
        String s2="100";
        Byte obj2 = new Byte(s2);
        // 或者
        Byte obj3 = Byte.valueOf(s2);



        //3  获取包装类的数值，包装类转基本数据类型  Byte  - >  byte
        //  包装类.valueOf(基本数据类型) 或者 byteValue()
        byte b2 = obj2;  // 包装类可以直接复制给基本数据类型  ，这个过程 “拆箱”过程
        byte b3 = Byte.valueOf(obj2);

        // 4、字符串转 基本类型     包装类.paseByte(s)
        byte b4 = Byte.parseByte(s2);


        byte b5=122;
        String s5 = new Byte(b5).toString();


    }


}
