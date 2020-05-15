import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: 用队列实现栈
 * @description
 * @author: matilda
 * @create: 2020-05-15 15:31
 **/
 public class MyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (!queue2.isEmpty()){
            queue2.offer(x);
        }
        queue1.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (empty()){
            return -1;
        }
        int data = 0;
        int q1 = queue1.size();
        int q2 = queue2.size();
        if (!queue1.isEmpty()){
            for (int i = 0; i < q1-1; i++) {
                queue2.offer(queue1.poll());
            }
            data = queue1.poll();
        }else {
            for (int i = 0; i < q2-1; i++) {
                queue1.offer(queue2.poll());
            }
            data = queue2.poll();
        }
        return data;
    }

    /** Get the top element. */
    public int top() {
        if (empty()){
            return -1;
        }
        int data = 0;
        int q1 = queue1.size();
        int q2 = queue2.size();
        if (!queue1.isEmpty()){
            for (int i = 0; i < q1; i++) {
                data = queue1.poll();
                queue2.offer(data);
            }
        }else {
            for (int i = 0; i < q2; i++) {
                data = queue2.poll();
                queue1.offer(data);
            }
        }
        return data;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (queue1.isEmpty() && queue2.isEmpty()){
            return true;
        }
        return false;
    }
}