package cn.echo.strings;

/**
 * @ClassName : StringBufferTest
 * @Author : Jiangnan
 * @Date: 2020/10/21 9:43
 * @Description : StringBuffer学习
 **/
public class StringBufferTest {

    public static void main(String[] args) {
//        创建字符串缓冲区
        StringBuffer sb = new StringBuffer("abc");

//        追加字符串
        sb.append("d");
//        将100自动转换成字符串
        sb.append(100);
        System.out.println(sb);
//        删除字符串
        sb.delete(4, 7);
        System.out.println(sb);
//        在指定下标插入字符串
        sb.insert(2,"hello");
        System.out.println(sb);
//        字符串反转
        System.out.println(sb.reverse());
//        清除字符串
        System.out.println("字符串：" + sb.delete(0, sb.length()));

//        获取字符串缓冲区的容量
        System.out.println(sb.capacity());
//        扩充容量    --最小容量要比之前的最大值大然后*2   只能扩充不能缩小
        sb.ensureCapacity(20);
        System.out.println(sb.capacity());
    }
}
