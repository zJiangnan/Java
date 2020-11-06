package cn.echo.jihe;

import java.util.ArrayList;

/**
 * @ClassName : ArrayList2
 * @Author : Jiangnan
 * @Date: 2020/10/23 16:21
 * @Description : 实例2
 **/
public class ArrayList2 {

    /**
     * 通过ArrayList创建集合对象
     * 存储自定义对象      默认容量为10
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add(1, "sss");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
