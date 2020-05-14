import java.util.Stack;

/**
 * @program: 括号匹配问题
 * @description
 * @author: matilda
 * @create: 2020-05-14 11:58
 **/
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else {
                //判断栈是否为空
                if(stack.empty()){
                    System.out.println("右括号多");
                    return false;
                }
                //拿到栈顶元素的符号
                char ch2 = stack.peek();
                if (ch2 == '(' && ch == ')' || ch2 == '[' && ch == ']' || ch2 == '{' && ch == '}' ){
                    stack.pop();
                }else {
                    System.out.println("左右符号不匹配");
                    return false;
                }
            }
        }
        if (!stack.empty()){
            System.out.println("左括号多");
            return false;
        }
        return true;
    }
}
