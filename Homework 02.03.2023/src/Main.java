class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void fixBST() {
        root = fixBSTRec(root);
    }

    Node fixBSTRec(Node root) {
        if (root == null) {
            return null;
        }

        root.left = fixBSTRec(root.left);

        if (prev != null && root.key < prev.key) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }
        prev = root;

        root.right = fixBSTRec(root.right);

        return root;
    }

    Node prev = null, first = null, second = null;

}

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(8);
        tree.insert(2);
        tree.insert(20);
        tree.insert(15);
        tree.insert(30);

        System.out.println("Inorder traversal of the original tree:");
        tree.inorder();

        tree.fixBST();

        System.out.println("\nInorder traversal of the fixed tree:");
        tree.inorder();
    }
}