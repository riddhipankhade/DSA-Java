package Trees.BST;

public class height {
    class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int height(Node root){
        if(root == null) return -1;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight,rightHeight);
    }

    public static void main(String[] args){
       height tree = new height();
        Node root = tree.new Node(10);
        root.left = tree.new Node(5);
        root.right = tree.new Node(15);
        root.left.left = tree.new Node(2);

        System.out.println("Height of tree: " + tree.height(root));
    }
}
