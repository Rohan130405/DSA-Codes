class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    int getData() {
        return data;
    }

    void setData(int data) {
        this.data = data;
    }

    Node getLeft() {
        return left;
    }

    void setLeft(Node left) {
        this.left = left;
    }

    Node getRight() {
        return right;
    }

    void setRight(Node right) {
        this.right = right;
    }
}

public class BinaryTree {

    public static void main(String[] args) {
        Node obj1 = new Node(1);
        obj1.setLeft(new Node(2));
        obj1.setRight(new Node(3));
        obj1.setLeft(new Node(4));
    }

}
