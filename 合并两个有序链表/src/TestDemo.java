/**
 * @program: 合并两个有序链表
 * @description
 * @author: matilda
 * @create: 2020-04-26 17:11
 **/
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class TestDemo {
    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (headA != null && headB != null){
            if (headA.val < headB.val){
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if (headA == null){
            tmp.next = headB;
        }else {
            tmp.next = headA;
        }
        return newHead.next;
    }
}
