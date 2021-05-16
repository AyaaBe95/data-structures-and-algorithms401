package trees;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;



    public class BinaryTreeTest {
        BinaryTree tree = new BinaryTree();

        @Before
        public void setUp() throws Exception {
            //    1
            //   / |
            //  2  3
            // /  /|
            //4  5 6
            Node node5 = new Node(5, new Node(6), null);
            Node node2 = new Node(2, new Node(4), node5);
            Node rootNode = new Node(1, node2, new Node(3));
            tree = new BinaryTree();
            tree.root = rootNode;
        }

        @Test
        public void testTreeInit(){
            BinaryTree testTree = new BinaryTree();
            assertNull("Overall root should be null", testTree.root);
        }
        @Test
        public void testTreeWithOneNode(){
            Node root = new Node(1);
            BinaryTree testTree = new BinaryTree(root);
            ArrayList<Integer> goodAnswer = new ArrayList<>();
            goodAnswer.add(1);
            assertEquals("Value should be the same as root data", Integer.valueOf(1), testTree.root.data);
        }

        @Test
        public void testPreOrderTraversal() {

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);

            BinaryTree testTree = new BinaryTree(root);

            ArrayList<Integer> goodAnswer = new ArrayList<>();
            goodAnswer.add(1);
            goodAnswer.add(2);
            goodAnswer.add(3);

            assertArrayEquals(
                    "Should get [1, 2, 3]",
                    goodAnswer.toArray(),
                    testTree.preOrderTraversal().toArray()
            );
        }


        @Test
        public void inPreOrderTraversal() {

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);

            BinaryTree testTree = new BinaryTree(root);

            ArrayList<Integer> goodAnswer = new ArrayList<>();
            goodAnswer.add(1);
            goodAnswer.add(2);
            goodAnswer.add(3);

            assertArrayEquals(
                    "Should get [2, 1, 3]",
                    goodAnswer.toArray(),
                    testTree.preOrderTraversal().toArray()
            );
        }

        @Test
        public void testPostOrderTraversal() {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);

            BinaryTree testTree = new BinaryTree(root);

            ArrayList<Integer> goodAnswer = new ArrayList<>();
            goodAnswer.add(1);
            goodAnswer.add(2);
            goodAnswer.add(3);

            assertArrayEquals("Should get [2, 3, 1]", goodAnswer.toArray(),
                    testTree.postOrderTraversal().toArray());
        }



}
