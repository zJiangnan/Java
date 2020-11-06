package cn.echo.duilie;

/**
 * @ClassName : MyQueue
 * @Author : Jiangnan
 * @Date: 2020/10/26 16:41
 * @Description : 队列
 **/
public class MyQueue {

//    头
    private Node front;
//    尾
    private Node tail;
//    大小
    private int size;

    public MyQueue() {
        this.front = this.tail = null;
    }

    /**
     * 入队
     */
    public void put(Object obj) {
        Node node = new Node(obj);
//        判断是否为空
        if (isEmpty()) {
//            如果为空让头和尾指向新加入的node节点
            this.front = this.tail = node;
            return;
        }
//        让尾部节点指向新加入的节点地址
        this.tail.next = node;
//        新节点成为尾部节点
        this.tail = node;
//        将队列大小+1
        this.size++;
    }

    /**
     * 出队
     */
    public Object pop() {
        if(isEmpty()) {
            throw new IllegalArgumentException("没有弹出的节点");
        }
//        移除头部节点
        Node node = this.front;
//        设置下一个节点为新的头节点
        this.front = node.next;
//        将弹出的元素next置空-- 与队列脱离关系，回收内存
        node.next = null;
//        删除一个元素减一个值
        this.size--;
//        如果没有节点就将头节点和尾节点置空
        if(size < 0) {
            this.front = this.tail = null;
        }
        return node.getData();
    }

    /**
     * 判断空
     * @return
     */
    public boolean isEmpty() {
        if(this.front == null && this.tail == null) {
            return true;
        }
        return false;
    }


    static class Node{
        private Object data;
        private Node next;
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
