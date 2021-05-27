package hashtable;


import hashtable.tree.BinarySearchTree;
import hashtable.tree.treeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class treeIntersection {

    public static Set<Integer> treeIntersection(treeNode root1, treeNode root2) {
        HashSet<Integer> values = new HashSet<>();
        HashMap<Integer, Boolean> valuesFromRoot1 = new HashMap<>();
        LinkedList<treeNode> nodes = new LinkedList<>();

        nodes.add(root1);
        while(!nodes.isEmpty()) {
            treeNode current = nodes.removeFirst();
            valuesFromRoot1.put((Integer) current.data, null);


            if (current.left != null) {
                nodes.add(current.left);
            }
            if (current.right != null) {
                nodes.add(current.right);
            }
        }
        nodes.add(root2);

        while(!nodes.isEmpty()) {
            treeNode current = nodes.removeFirst();
            if(valuesFromRoot1.containsKey(current.data)) {
                values.add((Integer) current.data);
            }
            if (current.left != null) {
                nodes.add(current.left);
            }
            if (current.right != null) {
                nodes.add(current.right);
            }
        }
        return values;
    }
}
