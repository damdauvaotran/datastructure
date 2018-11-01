
public class BinarySearchTree {
    Node root;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public BinarySearchTree() {
        this.root = null;
    }

    private Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key <= root.getData()) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    void insert(int i) {
        this.root = insert(root, i);
    }


    private Node search(Node root, int key) {
        if (root == null || root.getData() == key) {
            return root;
        }

        if (key > root.getData()) {
            return search(root.right, key);
        }

        return search(root.left, key);
    }

    public boolean search(int key) {
        return search(this.root, key) != null;
    }

    public Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key > root.getData()) {
            root.right = delete(root.right, key);
        } else if (key < root.getData()) {
            root.left = delete(root.left, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.setData(minValue(root.right));


            root.right = delete(root.right, root.getData());

        }

        return root;
    }

    public void delete(int key) {
        this.root = delete(this.root, key);
    }


    int minValue(Node root) {
        int minv = root.getData();
        while (root.left != null) {
            minv = root.left.getData();
            root = root.left;
        }
        return minv;
    }

    private void printPreorder(Node n) {
        if (n == null) {
            return;
        }

        System.out.print(n.getData() + " ");
        printPreorder(n.left);
        printPreorder(n.right);
    }

    void printPreorder() {
        this.printPreorder(this.root);
    }


    private void printInorder(Node n) {
        if (n == null) {
            return;
        }
        printInorder(n.left);
        System.out.print(n.getData() + " ");
        printInorder(n.right);
    }

    public void printInorder() {
        this.printInorder(this.root);
    }


}
