package cn.echo.ti1029;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : Ti_4
 * @Author : Jiangnan
 * @Date: 2020/10/29 20:43
 * @Description :4：Map集合的使用（二）
 *                  一、有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
 *                  第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，将第一个数组元素作为key，
 *                  第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
 **/
public class Ti_4 {
    public static void main(String[] args) {
        String[] str1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] str2 = {"哈尔滨","杭州","南昌","广州","福州"};
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < str1.length; i++) {
            map.put(str1[i], str2[i]);
        }
        for (String s : map.keySet()) {
            System.out.println(s + "=" + map.get(s));
        }
    }
}
