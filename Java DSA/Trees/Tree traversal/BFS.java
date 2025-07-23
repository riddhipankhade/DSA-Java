import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    void levelorder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.println(curr.data + " ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }

     public static void main(String[] args) {
        BFS tree = new BFS();

        // Create the following tree:
        //         1
        //       /   \
        //      2     3
        //     / \   /
        //    4   5 6

        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right.left = tree.new Node(6);

        System.out.print("Level Order (BFS): ");
        tree.levelorder(root);  // Output: 1 2 3 4 5 6
    }
    
}
