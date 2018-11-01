package com.nguyen;

class BinaryTree {
    Node root;


    private Node buildTree(String in[], String pre[], int inStrt, int inEnd,  Index preIndex) {
        if (inStrt > inEnd)
            return null; 
  

        Node tNode = new Node(pre[preIndex.getIndex()]);
        preIndex.plusPlus();

        if (inStrt == inEnd)
            return tNode;


        int inIndex = search(in, inStrt, inEnd, tNode.getData());
        tNode.setLeft(buildTree(in, pre, inStrt, inIndex - 1, preIndex));
        tNode.setRight(buildTree(in, pre, inIndex + 1, inEnd, preIndex));

        return tNode;
    }

    public void buildTree(String in[], String pre[], int len){
        this.root =  this.buildTree(in, pre, 0, len-1, new Index(0));
    }

    int search(String arr[], int strt, int end, String value) {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i].equals(value))
                return i;
        }
        return i;
    }

    void printInorder(Node node) {
        if (node == null)
            return;


        printInorder(node.getLeft());


        System.out.print(node.getData() + " ");


        printInorder(node.getRight());
    }

    void printInorder(){
        this.printInorder(this.root);
    }

    void printPreorder(Node node){
        if (node == null)
        return;


        System.out.print(node.getData() + " ");

        printPreorder(node.getLeft());

        printPreorder(node.getRight());
    }

    void printPreorder(){
        this.printPreorder(this.root);
    }

} 
  