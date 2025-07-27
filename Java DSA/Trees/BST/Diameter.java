package Trees.BST;

public class Diameter {
    class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    int maxDiameter = 0;

     public int diameter(Node root){
        height(root);
        return maxDiameter;
     }

    public int height(Node root){
        if(root == null) return -1;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int currDiameter = leftHeight + rightHeight + 2;
        maxDiameter = Math.max(maxDiameter, currDiameter);
        
        return Math.max(leftHeight,rightHeight) + 1;
    }

     public static void main(String[] args){
      Diameter tree = new Diameter();
        Node root = tree.new Node(10);
        root.left = tree.new Node(5);
        root.right = tree.new Node(15);
        root.left.left = tree.new Node(2);

        System.out.println("Diameter of tree: " + tree.diameter(root));
    }
}
