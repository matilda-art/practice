/**
 * @program: 输入一个链表，输出该链表中倒数第k个结点
 * @description
 * @author: matilda
 * @create: 2020-04-26 11:57
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

    public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public Node FindKthToTail(int k) {
        Node fast = this.head;
        Node slow = this.head;
        if (k < 0 || k > this.size()){
            System.out.println("不合法");
            return null;
        }
        while (k-1 > 0){
            if (fast.next != null){
                fast = fast.next;
                k--;
            }else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
