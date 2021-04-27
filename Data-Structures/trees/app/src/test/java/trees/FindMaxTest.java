package trees;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class FindMaxTest {
//    @Test
//    public void testFindMaxValueOneNode() {
//        Node root = new Node(2);
//        BinaryTree testTree = new BinaryTree(root);
//        assertEquals("Expecting 2",
//                2,
//                testTree.findMaxValueWrapper());
//    }


//    @Test
//    public void testFindMaxValue1() {
//        Node root = new Node(2);
//        root.left = new Node(7);
//        root.right = new Node(5);
//        root.left.left = new Node(2);
//        root.left.right = new Node(6);
//        root.left.right.left = new Node(5);
//        root.left.right.right = new Node(11);
//        root.right.right = new Node(9);
//        root.right.right.left = new Node(4);
//
//        BinaryTree testTree = new BinaryTree(root);
//
//        assertEquals("Expecting 11",
//                11,
//                testTree.findMaxValueWrapper());
//    }

    @Test
    public void findMaximumValueTest(){

        BinarySearchTree test = new BinarySearchTree();
        test.add(2);
        test.add(19);
        test.add(0);
        test.add(3);
        assertEquals(19, test.findMax());
    }

    @Test
    public void findMaximumValueTestOneNode(){

        BinarySearchTree test = new BinarySearchTree();
        test.add(2);
        assertEquals(2, test.findMax());
    }

    @Test
    public void findMaximumValueOfNullRootTest(){

        BinarySearchTree test = new BinarySearchTree();
        assertEquals(0, test.findMax());
    }

    @Test
    public void findMaximumValueTestMinusValues(){

        BinarySearchTree test = new BinarySearchTree();
        test.add(-1);
        test.add(-10);
        test.add(-2);
        System.out.println(test.toString());
        System.out.println(test.findMax());
        assertEquals(-1, test.findMax());
    }

    }






