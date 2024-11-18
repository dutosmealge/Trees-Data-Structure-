public class BinaryTree{
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode createNewNode(int data) {
        return new TreeNode(data);
    }

    public static void main(String[] args) {
        TreeNode root = createNewNode(4);
        TreeNode nodeA = createNewNode(2);
        TreeNode nodeB = createNewNode(6);
        TreeNode nodeC = createNewNode(1);
        TreeNode nodeD = createNewNode(5);
        TreeNode nodeE = createNewNode(3);
        TreeNode nodeF = createNewNode(7);
        
        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;
        
        System.out.println("root.left.right.data: " + root.left.right.data);
    }
}