import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: 二叉树的完全性检验
 * @description
 * 给定一个二叉树，确定它是否是一个完全二叉树。
 * @author: matilda
 * @create: 2020-05-21 16:19
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null)return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (cur != null){
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else {
                break;
            }
        }

        while (!queue.isEmpty()){
            TreeNode cur1 = queue.peek();
            if (cur1 != null){
                return false;
            }
            queue.poll();
        }
        return true;
    }
}
