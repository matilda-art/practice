/**
 * @program: 反转一个单链表
 * @description
 * @author: matilda
 * @create: 2020-04-25 17:40
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
    public Node reverseList(Node head) {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while (cur != null){
            Node curNext = cur.next;
            if (curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
}
