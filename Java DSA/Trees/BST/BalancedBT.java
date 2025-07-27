package Trees.BST;

public class BalancedBT {
    class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public boolean isBalanced(Node root){
        return checkBalanced(root) != -1;
    }

    private int checkBalanced(Node root){
        if(root == null) return 0;

        int left = checkBalanced(root.left);
        if(left == -1) return -1;

        int right = checkBalanced(root.right);
        if(right == -1) return -1;

        if(Math.abs(left-right)>1) return -1;

        return Math.max(left,right) + 1;
    }

    public static void main(String[] args){
        BalancedBT tree = new BalancedBT();
        Node root = tree.new Node(10);
        root.left = tree.new Node(5);
        root.right = tree.new Node(15);
        root.left.left = tree.new Node(2);
        root.left.left.left = tree.new Node(1);

          System.out.println("Is tree balanced? " + tree.isBalanced(root));
    }
}
