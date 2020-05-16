import java.util.ArrayList;
import java.util.List;

/**
 * @program: 二叉树的后序遍历
 * @description
 * @author: matilda
 * @create: 2020-05-16 20:24
 **/
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        List<Integer> left = postorderTraversal(root.left);
        list.addAll(left);
        List<Integer> right = postorderTraversal(root.right);
        list.addAll(right);
        System.out.println(root.val+" ");
        list.add(root.val);

        return list;
    }
}
