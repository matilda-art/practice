import java.util.ArrayList;
import java.util.List;

/**
 * @program: 二叉树中序遍历
 * @description
 * @author: matilda
 * @create: 2020-05-16 20:22
 **/
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        List<Integer> left = inorderTraversal(root.left);
        list.addAll(left);
        System.out.println(root.val+" ");
        list.add(root.val);
        List<Integer> right = inorderTraversal(root.right);
        list.addAll(right);

        return list;
    }
}
