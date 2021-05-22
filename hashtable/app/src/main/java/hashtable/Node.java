package hashtable;

public class Node<T>{

public T key;
    public T value;
    public Node next;

    public Node() {
    }

    public Node(T key, T value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return this.key + ": " + this.value;
    }




}
