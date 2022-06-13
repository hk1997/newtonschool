package trees;

public class BuildBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode c1 = new TreeNode(2);
        TreeNode c2 = new TreeNode(3);
        TreeNode c3 = new TreeNode(4);
        TreeNode c4 = new TreeNode(5);
        TreeNode c5 = new TreeNode(6);

        root.left = c1;
        c1.right = c2;
        c2.left = c3;
        c3.left = c4;
        c3.right = c5;

    }



    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int d){
            data = d;
            left = null;
            right = null;
        }
    }
}
