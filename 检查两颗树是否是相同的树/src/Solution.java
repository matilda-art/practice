/**
 * @program: 检查两颗树是否是相同的树
 * @description
 * @author: matilda
 * @create: 2020-05-18 11:46
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (q == null && p == null){
            return true;
        }
        if ((p != null && q == null) || (p == null && q != null)) {
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left)&&isSameTree(p.right,q.right);
    }
}
