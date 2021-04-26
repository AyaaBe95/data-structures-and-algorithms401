package trees;

import java.util.ArrayList;


public class BinaryTree<T> {

    // instance variable
    public Node<T> root;

    // constructors
    public BinaryTree() {
        root = null;
    }

    public BinaryTree(Node<T> root) {
        this.root = root;
    }


    // ====== PreOrder Traversal
    public ArrayList<T> preOrderTraversal() {
        ArrayList<T> valuesArr = new ArrayList<>();
        preOrderTraversalHelper(this.root, valuesArr);
        return valuesArr;
    }

    private ArrayList<T> preOrderTraversalHelper(Node<T> root, ArrayList<T> valuesArr) {
        if(root == null) {
            return valuesArr;
        }
        valuesArr.add((T) root.data);

        if(root.left != null){
            valuesArr = preOrderTraversalHelper(root.left, valuesArr);
        }
        if(root.right != null){
            valuesArr = preOrderTraversalHelper(root.right, valuesArr);
        }
        return valuesArr;
    }

    public ArrayList<T> inOrderTraversal() {
        ArrayList<T> valuesArr = new ArrayList<>();
        preOrderTraversalHelper(this.root, valuesArr);
        return valuesArr;
    }
    private ArrayList<T> inOrderTraversalHelper(Node<T> root, ArrayList<T> valuesArr) {
        if(root == null) {
            return valuesArr;
        }
        if(root.left != null){
            valuesArr = preOrderTraversalHelper(root.left, valuesArr);
        }
        valuesArr.add((T) root.data);

        if(root.right != null){
            valuesArr = preOrderTraversalHelper(root.right, valuesArr);
        }
        return valuesArr;
    }


    public ArrayList<T> postOrderTraversal() {
        ArrayList<T> valuesArr = new ArrayList<>();

        preOrderTraversalHelper(this.root, valuesArr);
        return valuesArr;
    }

    private ArrayList<T> postOrderTraversalHelper(Node<T> root, ArrayList<T> valuesArr) {
        if(root == null) {
            return valuesArr;
        }
        if(root.left != null){
            valuesArr = preOrderTraversalHelper(root.left, valuesArr);
        }
        if(root.right != null){
            valuesArr = preOrderTraversalHelper(root.right, valuesArr);
        }
        valuesArr.add((T) root.data);
        return valuesArr;
    }

}





