import java.util.Scanner;

/**
 * @program: 二叉树遍历
 * @description
 * @author: matilda
 * @create: 2020-05-19 17:56
 **/
class TreeNode{
    char val;
    TreeNode left;
    TreeNode right;
    public TreeNode(char val){
        this.val = val;
    }
}

public class Main{
    public static int i = 0;
    public static TreeNode buildTree(String str){
        TreeNode root = null;
        if (str.charAt(i) != '#'){
            root = new TreeNode(str.charAt(i));
            i++;
            root.left = buildTree(str);
            root.right = buildTree(str);
        }else {
            i++;
        }
        return root;
    }

    public static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        TreeNode root = buildTree(str);
        inOrderTraversal(root);
    }
}
