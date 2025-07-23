

public class DFS {

    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null; 
        }
    }

    //three types
    //1. Inorder - left, root, right
    void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    //2. preorder - root, left, right
    void preorder(Node root){
        if(root == null) return;
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //3. postorder - left, right, root
    void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }



public static void main(String[] args) {
        DFS tree = new DFS();  // create outer class object to access inner Node class

        // Create sample tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5

        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        System.out.print("Inorder: ");
        tree.inorder(root);    // Output: 4 2 5 1 3
        System.out.println();

        System.out.print("Preorder: ");
        tree.preorder(root);   // Output: 1 2 4 5 3
        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(root);  // Output: 4 5 2 3 1
        System.out.println();
    }
}