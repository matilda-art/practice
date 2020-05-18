/**
 * @program: 另一颗树的子树
 * @description
 * @author: matilda
 * @create: 2020-05-18 10:52
 **/

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q != null) || (p != null && q== null) )
            return false;
        if(p == null && q == null)
            return true;
        if(p.val != q.val)
            return false;

        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);

    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
         if (s == null && t == null)return false;
         if (isSameTree(s, t))return true;
         //t是否是s的左树
         if (isSubtree(s.left,t))return true;
         //t是否为s的右树
         if (isSubtree(s.right,t))return true;
         return false;
    }
}
