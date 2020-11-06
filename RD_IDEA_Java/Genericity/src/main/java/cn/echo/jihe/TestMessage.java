package cn.echo.jihe;

import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName : TestMessage
 * @Author : Jiangnan
 * @Date: 2020/10/26 10:44
 * @Description : 测试留言
 **/
public class TestMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MessageManager mm = new MessageManager();
        do{
            int type = sc.nextInt();
            if(type == 1) {
                System.out.println("添加:id、姓名、留言内容");
                Message m = new Message();
                m.setId(sc.nextInt());
                m.setName(sc.next());
                m.setContent(sc.next());
                m.setDate(new Date());
                mm.add(m);
            } else if(type == 2) {
                System.out.println("删除：删除下标");
                int index = sc.nextInt();
                mm.delete(index);
            } else if(type == 3) {
                System.out.println("查看");
                mm.show();
            } else {
                System.exit(0);
            }
        } while (true);
    }
}
