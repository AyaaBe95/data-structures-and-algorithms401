package utilities;

public class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;
    Node(T value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node (T value,  Node<T> left,  Node<T> right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
