package cn.echo.maptest;

import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName : MapTreeMap
 * @Author : Jiangnan
 * @Date: 2020/10/29 13:46
 * @Description : TreeMap学习
 **/
public class MapTreeMap {
    public static void main(String[] args) {
//        创建Map的TreeMap的对象
        Map<Integer, Integer> map = new TreeMap();
//        添加属性
        map.put(1, 101);
        map.put(2, 102);
        map.put(3, 103);
        map.put(4, 104);
//        输出
        for (Integer k : map.keySet()) {
            System.out.println(k + "=" + map.get(k));
        }
    }
}
