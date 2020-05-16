import java.util.ArrayList;
import java.util.List;

/**
 * @program: 二叉树的前序遍历
 * @description
 * @author: matilda
 * @create: 2020-05-16 20:20
 **/
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) {
            return list;
        }
        System.out.println(root.val+" ");
        list.add(root.val);
        List<Integer> left = preorderTraversal(root.left);
        list.addAll(left);
        List<Integer> right = preorderTraversal(root.right);
        list.addAll(right);

        return list;
    }
}
