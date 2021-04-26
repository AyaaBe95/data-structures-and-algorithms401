package trees;

public class Node <T> {
    public T data;
    public Node<T> left;
    public Node<T> right;

    //Constructors
    public Node (T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node (T data,  Node left,  Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
