package trees;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class breadthFirstTest {
    BinaryTree<Integer> testInt= new BinaryTree<>();

    @Test
    public void breadthFirst() {
        Node left = new Node(1, new Node(6), new Node(7));
        Node right = new Node(3, new Node(8), new Node(9));
        Node rootNode = new Node(2, left, right);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(3);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);

        testInt = new BinaryTree<>(rootNode);
        System.out.println(testInt.breadthFirstTraversal());
        assertEquals("Value should do breadth-first", expected, testInt.breadthFirstTraversal());
    }

    @Test
    public void breadthFirstEmptyTree() {
        Node left = new Node(null);
        Node right = new Node(null);
        Node rootNode = new Node(null,null,null);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(null);
        testInt = new BinaryTree<>(rootNode);
        System.out.println(testInt.breadthFirstTraversal());
        assertEquals("Value should do in-order", expected, testInt.breadthFirstTraversal());
    }

    @Test
    public void breadthFirstEmptyRight() {

        Node left = new Node(3);
        Node right = new Node(null);
        Node rootNode = new Node(2, left,null);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        testInt = new BinaryTree<>(rootNode);
        System.out.println(testInt.breadthFirstTraversal());
        assertEquals("Value should do in-order", expected, testInt.breadthFirstTraversal());
    }
    @Test
    public void breadthFirstEmptyLeft() {
        Node left = new Node(null);
        Node right = new Node(null);
        Node rootNode = new Node(2, null, null);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        testInt = new BinaryTree<>(rootNode);
        System.out.println(testInt.breadthFirstTraversal());
        assertEquals("Value should do in-order", expected, testInt.breadthFirstTraversal());
    }
}
