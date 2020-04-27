/**
 * @program: 链表开始入环的第一个节点
 * @description
 * @author: matilda
 * @create: 2020-04-27 14:39
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

    public Node detectCycle(){
        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null){
            return null;
        }
        slow = this.head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
