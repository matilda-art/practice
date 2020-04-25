/**
 * @program: 删除链表中等于给定值 val 的所有节点
 * @description
 * @author: matilda
 * @create: 2020-04-25 16:40
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

    public void removeElements(int val) {
        if(head == null) {
               return null;
        }
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null){
           if (cur.data == val){
               prev.next = cur.next;
               cur = cur.next;
            }
            prev = cur;
            cur = cur.next;
        }
        if (this.head.data == val){
            this.head = this.head.next;
        }
    }
}
