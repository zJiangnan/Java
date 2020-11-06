package cn.echo.zhan;

/**
 * @ClassName : MyStackLink
 * @Author : Jiangnan
 * @Date: 2020/10/26 20:08
 * @Description : 单链实现栈结构
 **/
public class MyStackLink {

    private LinkNode link;

    MyStackLink() {
        link = new LinkNode();
    }

    /**
     * 判空操作
     * @return
     */
    public boolean isEmpty() {
        return link.isEmpty();
    }

    /**
     * 入栈
     * @param data
     */
    public void push(Object data) {
        Node node = new Node(data);
        link.addNode(node);
    }

    /**
     * 出栈--不删除
     * @return
     */
    public Object pop() {
        return link.showNode();
    }

    /**
     * 出栈--删除
     * @return
     */
    public Object peek() {
        return link.showNode1();
    }

    /**
     * 栈大小
     */
    public void size() {
        link.size();
    }

    static class LinkNode {
        private Node head;
        private int size;
        public LinkNode() {
            this.head = null;
            this.size = 0;
        }

        /**
         * 判断是否为空
         * @return
         */
        public boolean isEmpty() {
            return size == 0 ? true : false;
        }

        /**
         * 头插入
         * @param data
         */
        public void addNode(Node data) {
            Node node = new Node(data);
//            如果head为空就说明是空表
            if(head == null) {
//                将新节点给head表示头
                head = node;
            } else {
//                将head的地址给新节点
                node.next = head;
//                将新节点地址给head表示新的头节点
                head = node;
            }
            size++;
        }

        /**
         * 返回头节点
         * @return
         */
        public Object showNode() {
//            如果表为空返回null
            if(head == null) {
                return null;
            }
//            将head头节点的data给obj并返回
            System.out.println(head.data);
            return head.data;
        }

        /**
         * 返回头节点并删除
         * @return
         */
        public Object showNode1() {
//            如果head为空，说明没有节点
            if(head == null) {
                return null;
            }
//            将头节点的数据给obj返回
            Object obj = head.data;
//            如果head.next 为空表示没有后继节点了
            if(head.next == null) {
                return null;
            } else {
//                否则将head指向下一个节点的地址给head，表示抛出原来的头节点
                head = head.next;
            }
            size--;
            return obj;
        }

        /**
         * 栈大小
         */
        public void size() {
            System.out.println(size);
        }
    }

    static class Node {
        Object data;
        Node next;
        public Node(Object data) {
            this.data = data;
        }
    }
}
