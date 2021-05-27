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

    public T getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String toString() {
        return this.key + ": " + this.value;
    }




}
