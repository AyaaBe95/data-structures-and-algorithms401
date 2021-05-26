package hashtable;

import java.util.*;
import Data-Structures.tree.BinaryTree;


public class treeInsertion {



    public static Set<Integer> treeIntersection(Node binaryTree1, Node binaryTree2) {
        HashSet<Integer> commonValues = new HashSet<>();

        // Hashtable valuesFromBinaryTree1 = new Hashtable();
        HashMap<Integer, Boolean> valuesFromBinaryTree1 = new HashMap<>();
        LinkedList<Node> nodesToProcess = new LinkedList<>();

        nodesToProcess.add(binaryTree1);

        while(!nodesToProcess.isEmpty()) {
            // Set current to the first node removed from nodesToProcess:
            Node current = nodesToProcess.removeFirst();
            valuesFromBinaryTree1.put((Integer) current.getValue(), null);

            // Add node's children to the list of nodes to process
            // Use breadth-first traversal (Adds to end of linked list, removes from start -> acts like a queue
            if (current.getLeftChild() != null) {
                nodesToProcess.add(current.getLeftChild());
            }
            if (current.getRightChild() != null) {
                nodesToProcess.add(current.getRightChild());
            }
        }

        // Start assessing second binary tree
        nodesToProcess.add(binaryTree2);

        while(!nodesToProcess.isEmpty()) {
            Node current = nodesToProcess.removeFirst();
            if(valuesFromBinaryTree1.containsKey(current.getValue())) {
                commonValues.add((Integer) current.getValue());
            }
            // Traverse through the second tree
            if (current.getLeftChild() != null) {
                nodesToProcess.add(current.getLeftChild());
            }
            if (current.getRightChild() != null) {
                nodesToProcess.add(current.getRightChild());
            }
        }
        return commonValues;
    }

}
