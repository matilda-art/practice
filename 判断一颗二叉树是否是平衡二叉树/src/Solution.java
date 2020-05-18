/**
 * @program: 判断一颗二叉树是否是平衡二叉树
 * @description
 * @author: matilda
 * @create: 2020-05-18 11:29
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = height(root.left);
            int right = height(root.right);
            return (left > right ? left : right) + 1;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }
}
