/**
 * @program: 根据一棵树的中序遍历与后序遍历构造二叉树
 * @description
 * @author: matilda
 * @create: 2020-05-21 09:47
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {

    public int postIndex = 0;
    public TreeNode buildTreeChild(int[] inorder, int[] postorder,int inBegin,int inEnd) {
        if (inBegin > inEnd) return null;
        TreeNode root = new TreeNode(postorder[postIndex]);
        int rootIndex = findIndexOfInorder(inorder,inBegin,inEnd,postorder[postIndex]);
        postIndex--;

        if (rootIndex == -1) return null;
        root.right = buildTreeChild(inorder,postorder,inBegin,rootIndex-1);
        root.left = buildTreeChild(inorder,postorder,rootIndex+1,inEnd);

        return root;
    }

    public int findIndexOfInorder(int[] inorder,int inBegin,int inEnd,int val){
        for (int i = inBegin; i <= inEnd; i++) {
            if (inorder[i] == val){
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null) return null;
        if (inorder.length <= 0 || postorder.length <= 0) return null;
        postIndex = postorder.length-1;
        return buildTreeChild(inorder,postorder,0,inorder.length-1);
    }
}