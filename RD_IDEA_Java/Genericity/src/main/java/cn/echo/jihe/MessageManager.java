package cn.echo.jihe;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName : MessageManager
 * @Author : Jiangnan
 * @Date: 2020/10/26 10:37
 * @Description : 留言实现
 **/
public class MessageManager {

//    存放留言的集合类
    List<Message> list = new ArrayList<>();

    /**
     * 添加留言
     * @param message
     */
    public void add(Message message) {
        list.add(message);
    }

    /**
     * 删除留言
     * @param index
     */
    public void delete(int index) {
//        是否在指定区间
        if (index < 0 || index >= list.size()) {
            System.out.println("删除下标越界！0-" + list.size());
            return;
        }
        list.remove(index);
    }

    public void show() {
        System.out.println("留言id\t留言姓名\t留言内容\t留言时间");
        for(Message m : list) {
            System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getContent() + "\t" + m.getDate());
        }
    }
}
