package hashtable.tree;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T> {


    //Add node to the tree
    public void add(T data){
        this.root = add(root, data);
    }

    public boolean contains (T value){
        if(root == null){
            System.out.println("Tree is null");
            return false;
        }
        return contains(root, value);
    }

    //Helper for adding node
    private treeNode<T> add(treeNode<T> root, T value){
        if(root == null){
            root =  new treeNode<T>(value);
        } else{
            int compare = value.compareTo(root.data);
            if(compare > 0){
                root.right = add(root.right, value);
            } else if(compare < 0){
                root.left = add(root.left, value);
            }

        }

        return root;
    }

    private boolean contains(treeNode<T> root, T value){
        if(root == null){
            return false;
        } else{
            int compare =  value.compareTo(root.data);
            if(compare == 0){
                return true;
            } else if(compare < 0){
                return contains(root.left, value);
            } else{
                return contains(root.right, value);
            }
        }
    }



}
