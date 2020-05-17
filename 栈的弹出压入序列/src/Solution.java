import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: 栈的弹出压入序列
 * @description
 * @author: matilda
 * @create: 2020-05-17 10:08
 **/
public class Solution {
    public static boolean isPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length == 0){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.empty() && stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        boolean popOrder = isPopOrder(pushA,popA);
        System.out.println(popOrder);
    }
}
