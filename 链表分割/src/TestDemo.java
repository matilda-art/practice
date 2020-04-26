/**
 * @program: 链表分割
 * @description
 * @author: matilda
 * @create: 2020-04-26 17:22
 **/
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class TestDemo {
    public ListNode partition(ListNode head, int x) {
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        while (head != null){
            if (head.val < x){
                if (bs == null){
                    bs = head;
                    be = head;
                }else {
                    be.next = head;
                    be = be.next;
                }
            }else {
                if (as == null){
                    as = head;
                    ae = head;
                }else {
                    ae.next = head;
                    ae = ae.next;
                }
            }
            head = head.next;
        }
        if (bs == null){
            return as;
        }
        be.next = as;
        if (ae != null){
            ae.next = null;
        }
        return bs;
    }
}
