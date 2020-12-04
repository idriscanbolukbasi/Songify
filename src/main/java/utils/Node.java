package utils;

public abstract class Node<T> {
    String name;
    int data = 0;
    T next;

    public Node(String name) {
        this.name = name;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void swapData(Node<T> node) {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
