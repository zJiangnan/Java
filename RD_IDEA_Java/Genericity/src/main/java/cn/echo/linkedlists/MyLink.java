package cn.echo.linkedlists;

/**
 * @ClassName : MyLink
 * @Author : Jiangnan
 * @Date: 2020/10/26 14:32
 * @Description : 链表
 **/
public class MyLink {

    Node head = null;

    /**
     * 尾插入数据
     * @param d
     */
    public void addNode(int d) {
//        实例化一个节点--将插入的数据给node表示新插入的数据节点
        Node node = new Node(d);
//        如果head为null就表明单链表没有数据，将数据给head
        if(head == null) {
            head = node;
            return;
        }
//        head不为空说明有数据，将头给tmp
        Node tmp = head;
//        遍历tmp的next域查找next为空的--为空就表示最后一个元素
//        就从头开始遍历将不为空的next给tmp知道循环结束，也就是将最后一个元素的前一个next给了tmp
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    /**
     * 字节长度
     * @return  返回字节长度
     */
    public int length() {
//        创建初始长度为0
        int length = 0;
//        将头结点给tmp--表示当前节点
        Node tmp = head;
//        当tmp等于null时就表明链表到头了
        while (tmp != null) {
//            如果tmp不等于null表明此节点是有数据的，将长度+1
            length++;
//            挪动当前节点--遍历长度
            tmp = tmp.next;
        }
        return length;
    }

    /**
     * 输出链表所有元素
     */
    public void show() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "\t");
//            向后挪动节点
            node = node.next;
        }
        System.out.println();
    }

    /**
     * 指定下标插入
     * @param d
     * @param index
     */
    public void add(int d, int index){
//        创建插入的节点对象
        Node node = new Node(d);
        Node tmp = head;
//        验证index的范围
        if (index < 0 || index >= this.length()) {
            throw  new IllegalArgumentException("下标越界");
        }
//        查找index -1 的节点，index-1的节点地址在index-2的的next里所以需要-2 --（index-2里面的next就是index-1的下标）
        for (int i = 0; i < index - 2; i++) {
            tmp = tmp.next;
        }
//        将index-1里next的存放的地址给插入的节点
        node.next = tmp.next;
//        将插入的节点地址给index-1的next完成插入操作
        tmp.next = node;
    }

    /**
     * 删除头节点
     */
    public void delete() {
        head = head.next;
        System.out.println("头结点已删除");
    }

    /**
     * 删除指定下标节点
     * @param index
     */
    public void delete1(int index) {
        if (index < 0 || index >= this.length()) {
            throw  new IllegalArgumentException("下标越界");
        }
//        因为本身就是第一节点所以不需要遍历第一个节点直接从第二个节点遍历
        int i = 1;
//        表示当前节点
        Node node = head;
//        表示下一个节点
        Node cur = node.next;
//        循环到cur不等于null
        while(cur != null) {
            if(i == index) {
//                如果i == index表示找到指定下标节点，将下一个节点地址给当前节点，就将index节点排除
                node.next = cur.next;
                System.out.println("删除指定节点。。。。");
            }
//            当前节点的遍历，将cur(下一个节点)给node(当前节点)
            node = cur;
//            遍历节点，将下下个节点地址给cur，让它始终保持下一个节点
            cur = cur.next;
            i++;
        }
    }

    /**
     * 单链表
     */
    static class Node {
        Node next;// 节点的引用，指向下一个节点
        int data;// 节点的对象，即内容

        public Node(int data) {
            this.data = data;
        }
    }
}
