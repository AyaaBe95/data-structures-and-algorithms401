package hashtable.tree;

public class treeNode<T> {
    public T data;
    public treeNode<T> left;
    public treeNode<T> right;

    //Constructors
    public treeNode (T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public treeNode (T data,  treeNode left,  treeNode right){
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
