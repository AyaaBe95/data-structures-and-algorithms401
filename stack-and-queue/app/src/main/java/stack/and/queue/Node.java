package stack.and.queue;

public class Node <T> {

    public T data;
    public Node next;


    // constructor
    public Node(T d) {

        this.data = d;
        next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
