package stack.and.queue;

public class Node <T> {

    T data;
    Node next;


    Node(T data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
