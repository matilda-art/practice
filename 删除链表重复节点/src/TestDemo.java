/**
 * @program: 删除链表重复节点
 * @description
 * @author: matilda
 * @create: 2020-04-26 17:33
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

    public Node deleteDuplication(){
        Node newHead = new Node(-1);
        Node cur = this.head;
        Node tmp = newHead;

        while (cur != null){
            if (cur.next != null && cur.data == cur.next.data){
                while (cur.next != null && cur.data == cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;s
    }
}
