package Trees.BST;

public class LCA {
    class Node{
        int data;
        Node right,left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    
    public Node LCA(Node root, Node p, Node q){
        if(root == null || root == p || root == q){
            return root;
        }

        Node left = LCA(root.left, p, q);
        Node right = LCA(root.right, p, q);

        if(left != null && right != null){
            return root;
        }

        return(left != null)? left : right;
    }   

    //BST optimized
    public Node LCA_BST(Node root, Node p, Node q) {
    if (root == null) return null;

    if (p.data < root.data && q.data < root.data) {
        return LCA_BST(root.left, p, q);
    } else if (p.data > root.data && q.data > root.data) {
        return LCA_BST(root.right, p, q);
    } else {
        return root; // Either split or equal (found LCA)
    }
}
}
