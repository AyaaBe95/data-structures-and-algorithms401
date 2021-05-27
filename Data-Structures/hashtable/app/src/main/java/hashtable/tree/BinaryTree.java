package hashtable.tree;

import java.util.ArrayList;


    public class BinaryTree<T> {

        // instance variable
        public treeNode<T> root;

        // constructors
        public BinaryTree() {
            root = null;
        }

        public BinaryTree(treeNode<T> root) {
            this.root = root;
        }


        // ====== PreOrder Traversal
        public ArrayList<T> preOrderTraversal() {
            ArrayList<T> valuesArr = new ArrayList<>();
            preOrderTraversalHelper(this.root, valuesArr);
            return valuesArr;
        }

        public ArrayList<T> preOrderTraversalHelper(treeNode<T> root, ArrayList<T> valuesArr) {
            if (root == null) {
                return valuesArr;
            }
            valuesArr.add((T) root.data);

            if (root.left != null) {
                valuesArr = preOrderTraversalHelper(root.left, valuesArr);
            }
            if (root.right != null) {
                valuesArr = preOrderTraversalHelper(root.right, valuesArr);
            }
            return valuesArr;
        }

        public ArrayList<T> inOrderTraversal(treeNode root) {
            ArrayList<T> valuesArr = new ArrayList<>();
            preOrderTraversalHelper(this.root, valuesArr);
            return valuesArr;
        }

        public ArrayList<T> inOrderTraversalHelper(treeNode<T> root, ArrayList<T> valuesArr) {
            if (root == null) {
                return valuesArr;
            }
            if (root.left != null) {
                valuesArr = preOrderTraversalHelper(root.left, valuesArr);
            }
            valuesArr.add((T) root.data);

            if (root.right != null) {
                valuesArr = preOrderTraversalHelper(root.right, valuesArr);
            }
            return valuesArr;
        }


        public ArrayList<T> postOrderTraversal() {
            ArrayList<T> valuesArr = new ArrayList<>();

            preOrderTraversalHelper(this.root, valuesArr);
            return valuesArr;
        }

        public ArrayList<T> postOrderTraversalHelper(treeNode<T> root, ArrayList<T> valuesArr) {
            if (root == null) {
                return valuesArr;
            }
            if (root.left != null) {
                valuesArr = preOrderTraversalHelper(root.left, valuesArr);
            }
            if (root.right != null) {
                valuesArr = preOrderTraversalHelper(root.right, valuesArr);
            }
            valuesArr.add((T) root.data);
            return valuesArr;
        }

        public int findMax() {
            if (this.root == null) {
                return 0;
            }
            ArrayList<T> valuesArr = new ArrayList<>();
            valuesArr = this.postOrderTraversal();
            int max = (Integer) this.root.data;
            for (Integer i = 0; i < valuesArr.size(); i++) {
                if (max < (Integer) valuesArr.get(i)) {
                    max = (Integer) valuesArr.get(i);
                }
            }
            return max;
        }


    }

