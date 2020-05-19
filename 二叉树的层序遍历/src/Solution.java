import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: 二叉树的层序遍历
 * @description
 * @author: matilda
 * @create: 2020-05-19 10:50
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    //把每一层的数据放到一个list，然后将这些list放到一个大的list里面
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<>();
        if (root == null) return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //每一次进入这个循环，就相当于是每一层的数据
        while (!queue.isEmpty()) {
            //求当前队列的大小 size
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            //while（size>0) 控制当前每一层的数据个数
            while (size > 0) {
                TreeNode cur = queue.poll();
                if (cur != null) {
                    list.add(cur.val);
                    if (cur.left != null) {
                        queue.offer(root.left);
                    }
                    if (cur.right != null) {
                        queue.offer(root.right);
                    }
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }
}
