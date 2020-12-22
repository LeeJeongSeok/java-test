package me.jeongseok.javatest;

public class Node {

    private Node left;
    private int value;
    private Node right;

    public Node(Node left, int value, Node right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
