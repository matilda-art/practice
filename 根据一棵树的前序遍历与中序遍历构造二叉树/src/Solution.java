/**
 * @program: 根据一棵树的前序遍历与中序遍历构造二叉树
 * @description
 * @author: matilda
 * @create: 2020-05-20 21:34
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {

    public int preIndex = 0;
    public TreeNode buildTreeChild(int[] preorder, int[] inorder,int inBegin,int inEnd) {
        if (inBegin > inEnd) return null;//没有节点
        TreeNode root = new TreeNode(preorder[preIndex]);
        //找到当前节点在中序遍历中的位置
        int rootIndex = findIndexOfInorder(inorder,inBegin,inEnd,preorder[preIndex]);
        preIndex++;

        if (rootIndex == -1) return null;

        root.left = buildTreeChild(preorder,inorder,inBegin,rootIndex-1);
        root.right = buildTreeChild(preorder,inorder,rootIndex+1,inEnd);

        return root;
    }

    public int findIndexOfInorder(int[] inorder,int inBegin,int inEnd,int val){
        for (int i = inBegin; i < inEnd-1; i++) {
            if (inorder[i] == val){
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) return null;
        if (preorder.length <= 0 || inorder.length <= 0) return null;
        return buildTreeChild(preorder,inorder,0,preorder.length-1);
    }
}
