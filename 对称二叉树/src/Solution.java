/**
 * @program: 对称二叉树
 * @description
 * @author: matilda
 * @create: 2020-05-18 11:58
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {

    public boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree){
        if ((leftTree == null && rightTree != null) || (leftTree != null && rightTree == null)){
            return false;
        }
        if (leftTree == null && rightTree == null){
            return true;
        }
        if (leftTree.val != rightTree.val){
            return false;
        }
        return isSymmetricChild(leftTree.left,rightTree.right)&&isSymmetricChild(leftTree.right,rightTree.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }
}
