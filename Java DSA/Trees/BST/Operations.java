package Trees.BST;

public class Operations {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data == key) return true;
        else if(root.data < key) return search(root.right, key);
        else return search(root.left, key);
    }

    Node insert(Node root, int key){
        if(root == null) return new Node(key);
        if(key < root.data){
            root.left = insert(root.left, key);
        }else{
            root.right = insert(root.right,key);
        }
        return root;
    }

Node delete(Node root, int key){
    if(root == null) return null;

    if(key < root.data){
        root.left = delete(root.left, key);
    } else if(key > root.data){
        root.right = delete(root.right, key);
    } else {
        // Node found

        // Case 1: No children
        if(root.left == null && root.right == null){
            return null;
        }

        // Case 2: One child
        if(root.left == null){
            return root.right;
        } else if(root.right == null){
            return root.left;
        }

        // Case 3: Two children
        Node successor = findMin(root.right);
        root.data = successor.data;
        root.right = delete(root.right, successor.data);
    }

    return root;
}


    Node findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
    return root;
    }
}
