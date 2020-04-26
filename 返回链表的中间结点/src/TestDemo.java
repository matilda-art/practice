/**
 * @program: 返回链表的中间结点
 * @description
 * @author: matilda
 * @create: 2020-04-25 20:19
 **/
class Node {
    public int data;//0
    public Node next;//null

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TestDemo {
    public Node head;

    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
