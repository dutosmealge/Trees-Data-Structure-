//Main Class
public class BinaryTree{
    public static class TreeNode {
//The properties of TreeNode Class
        int data;
        TreeNode left;
        TreeNode right;

//Constructor
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

//Method
    public static TreeNode createNewNode(int data) {
        return new TreeNode(data);
    }

//Main Method of the Tree
    public static void main(String[] args) {
        TreeNode root = createNewNode(4);
        TreeNode nodeA = createNewNode(2);
        TreeNode nodeB = createNewNode(6);
        TreeNode nodeC = createNewNode(1);
        TreeNode nodeD = createNewNode(5);
        TreeNode nodeE = createNewNode(3);
        TreeNode nodeF = createNewNode(7);
        
//Tree Structure 
        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;

//Output
        System.out.println("root.left.right.data: " + root.left.right.data);
    }
}
