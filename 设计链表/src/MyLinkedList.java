import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import javax.xml.soap.Node;

/**
 * @program: 设计链表
 * @description
 * @author: matilda
 * @create: 2020-05-13 16:51
 **/
class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class MyLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 ||index >= size){
            return -1;
        }
        ListNode cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode node = new ListNode(-1);
        if (this.head == null){
            this.head = node;
            this.tail = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode node = new ListNode(-1);
        if (this.tail == null){
            this.tail = node;
            this.head = this.tail;
        }else {
            tail.next = node;
            this.tail = node;
        }
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > this.size){
            return;
        }
        if (index == size){
            addAtTail(val);
            return;
        }
        if (index <= 0){
            addAtHead(val);
            return;
        }
        ListNode node = new ListNode(val);
        ListNode cur = this.head;

        for (int i = 0; i < index-1; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index<0||index>=size){
            return;
        }

        if (index==0){
            head=head.next;
            size--;
            return;
        }

        ListNode cur=head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        if (index==size-1){
            tail=cur;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
