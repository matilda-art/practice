/**
 * @program: 给定一个链表，判断链表中是否有环
 * @description
 * @author: matilda
 * @create: 2020-04-27 14:35
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

    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        if (fast == null && fast.next == null) {
            return false;
        }
        return true;
    }
}
