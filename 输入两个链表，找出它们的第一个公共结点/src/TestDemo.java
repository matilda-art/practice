/**
 * @program: 输入两个链表，找出它们的第一个公共结点
 * @description
 * @author: matilda
 * @create: 2020-04-27 14:44
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
    public static Node getIntersectionNode(Node headA, Node headB) {
        //1、求长度，走差值步
        Node pl = headA;
        Node ps = headB;
        Node cur = headA;
        int lenA = 0;
        int lenB = 0;
        while (cur != null) {
            lenA++;
            pl = pl.next;
        }
        while (ps != null){
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if (len < 0){
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        for (int i = 0;i < len;i++){
            pl = pl.next;
        }
        while (ps != pl && pl != null && ps != null){
            ps = ps.next;
            pl = pl.next;
        }
        if (pl == ps && pl != null){
            return pl;
        }
        return null;
    }
}
