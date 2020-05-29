import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: 复制带随机指针的链表
 * @description
 * @author: matilda
 * @create: 2020-05-28 19:48
 **/
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return head;
        Node cur = head;

        Map<Node, Node> map = new HashMap<>();

        //处理新节点与老节点之间的映射关系（map）
        while (cur != null){
            Node node = new Node(cur.val);
            map.put(cur,node);
            cur = cur.next;
        }
        //说明：新的节点和老的节点的映射关系全部处理完成
        cur = head;
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
