package cn.echo.linkedlists;

/**
 * @ClassName : TestNode
 * @Author : Jiangnan
 * @Date: 2020/10/26 14:34
 * @Description : 实现链表
 **/
public class TestNode {

    public static void main(String[] args) {
        MyLink link = new MyLink();
        link.addNode(0);
        link.addNode(1);
        link.addNode(2);
        link.addNode(3);
        link.addNode(4);
        System.out.println("链表长度为：" + link.length());
        System.out.print("输出链表所有元素：");
        link.show();
        System.out.println("--------------------------------");
        System.out.println("指定下标插入");
        try {
            link.add(100, 3);
            System.out.println("链表长度为：" + link.length());
            System.out.print("输出链表所有元素：");
            link.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------------");
        System.out.println("删除头结点：");
        link.delete();
        System.out.println("链表长度为：" + link.length());
        System.out.print("输出链表所有元素：");
        link.show();
        System.out.println("--------------------------------");
        System.out.println("删除指定下标结点：");
        link.delete1(1);
        System.out.println("链表长度为：" + link.length());
        System.out.print("输出链表所有元素：");
        link.show();

    }
}
