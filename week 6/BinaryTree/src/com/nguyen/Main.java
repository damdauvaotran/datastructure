package com.nguyen;

public class Main {

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        String in[] = new String[]{"D", "B", "E", "A", "F", "C"};
        String pre[] = new String[]{"A", "B", "D", "E", "C", "F"};
        int len = in.length;
        tree.buildTree(in, pre, len);

        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");

        tree.printInorder();
        System.out.println();
        tree.printPreorder();
    }
}
