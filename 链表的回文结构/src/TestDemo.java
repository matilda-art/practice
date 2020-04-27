/**
 * @program: 链表的回文结构
 * @description
 * @author: matilda
 * @create: 2020-04-27 12:03
 **/
class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class TestDemo {
    public Node head;

    public boolean chkPalindrome(){
        if (this.head == null){
            return false;
        }
        if (this.head.next == null){
            return true;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node cur = slow.next;
        while (cur != null){
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while (slow != this.head){
            if (slow.data != this.head.data){
                return false;
            }
            if (this.head.next == slow){
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }
}
