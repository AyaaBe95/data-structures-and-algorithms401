package utilities;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTreeTest<T> {
    private FizzBuzzTree<Integer> testInt= new FizzBuzzTree<>();
    
    @Test
    public void testFizzBuzz() {
        Node left = new Node(1, new Node(6), new Node(7));
        Node right = new Node(5, new Node(15), new Node(9));
        Node root = new Node(2, left, right);

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(6);
        array.add(7);
        array.add(1);
        array.add(15);
        array.add(9);
        array.add(5);
        array.add(2);

        ArrayList<T> expected = new ArrayList<T>();
        expected.add((T) "2");
        expected.add((T) "1");
        expected.add((T) "Fizz");
        expected.add((T) "7");
        expected.add((T) "Buzz");
        expected.add((T) "FizzBuzz");
        expected.add((T) "Fizz");

        testInt = new FizzBuzzTree<>(root);
        System.out.println(testInt.preOrder());
        System.out.println(testInt.fizzBuzz(array));
        assertEquals( expected, testInt.fizzBuzz(array));
    }

    @Test
    public void testFizzBuzzOneNode() {
        Node left = new Node(null);
        Node right = new Node(null);
        Node root = new Node(2);

        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);

        ArrayList<T> expected = new ArrayList<T>();
        expected.add((T) "2");

        testInt = new FizzBuzzTree<>(root);
        System.out.println(testInt.preOrder());
        System.out.println(testInt.fizzBuzz(array));
        assertEquals( expected, testInt.fizzBuzz(array));
    }

    @Test
    public void testFizzBuzzNoNodeDivide() {
        Node left = new Node(1, new Node(4), new Node(7));
        Node right = new Node(8, new Node(11), new Node(13));
        Node root = new Node(2, left, right);

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(4);
        array.add(7);
        array.add(1);
        array.add(11);
        array.add(8);
        array.add(13);
        array.add(2);

        ArrayList<T> expected = new ArrayList<T>();
        expected.add((T) "2");
        expected.add((T) "1");
        expected.add((T) "4");
        expected.add((T) "7");
        expected.add((T) "8");
        expected.add((T) "11");
        expected.add((T) "13");

        testInt = new FizzBuzzTree<>(root);
        System.out.println(testInt.preOrder());
        System.out.println(testInt.fizzBuzz(array));
        assertEquals( expected, testInt.fizzBuzz(array));
    }

}