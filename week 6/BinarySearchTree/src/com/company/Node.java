
public class Node {
    private int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }

    public Node() {
        left = right = null;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
