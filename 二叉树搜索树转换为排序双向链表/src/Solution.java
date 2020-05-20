/**
 * @program: 二叉树搜索树转换为排序双向链表
 * @description
 * @author: matilda
 * @create: 2020-05-20 16:42
 **/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public TreeNode prev = null;

    public void ConvertChild(TreeNode pCur) {
        if (pCur == null) return;
        ConvertChild(pCur.left);
        pCur.left = prev;
        if (prev != null) {
            prev.right = pCur;
        }
        prev = pCur;
        ConvertChild(pCur.right);
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        ConvertChild(pRootOfTree);
        TreeNode head = pRootOfTree;
        while (head.left != null) {
            head = head.left;
        }
        return head;
    }
}
