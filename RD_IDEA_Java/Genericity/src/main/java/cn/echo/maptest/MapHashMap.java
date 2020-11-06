package cn.echo.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName : MapHashMap
 * @Author : Jiangnan
 * @Date: 2020/10/28 16:30
 * @Description : HashMap实例
 **/
public class MapHashMap {
    public static void main(String[] args) {
//    创建HashMap对象
        Map<Integer, String> map = new HashMap<>();
//    存储数据
        map.put(1,"红桃");
        map.put(2,"方块");
        map.put(3,"黑桃");
        map.put(4,"梅花");

//        获取指定元素
        System.out.println(map.get(3));
//        通过遍历所有的key输出所有的值
        System.out.println("输出所有值");
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            System.out.println(map.get(i) + "=======" + i);
        }

//        判断key是否存在，判断value是否存在
        System.out.println("----------判断key是否存在，判断value是否存在----------");
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("黑桃"));

//        获取所有value
        
        
//        获取所有的元素
        System.out.println("集合大小：" + map.size());
        
//        遍历map集合元素
        System.out.println("---------使用entrySet()方法遍历集合--------");
        Set<Map.Entry<Integer, String>> ent = map.entrySet();
        for (Map.Entry<Integer, String> en : ent) {
            System.out.println(en.getKey() + "=========" + en.getValue());
        }

//        删除元素
        System.out.println("删除4：" + map.remove(4));
//        清空集合
        map.clear();
        System.out.println("集合大小：" + map.size());
    }
}
