package Data.Structures;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList l = new LinkedList();
    @Test public void testEmptyLinkedList(){
        String output = l.toString();
        assertEquals( "NULL",output);
    }

    @Test public void testInsertList(){
        l.insert(5);
        l.insert(3);
        l.insert(4);
        String output = l.toString();
        assertEquals( "{4} -> {3} -> {5} -> NULL",output);
    }

    @Test
    public void test_include_true() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(1);
        classUnderTest.insert(1);
        classUnderTest.insert(8);
        assertTrue(classUnderTest.Includes(8));
    }
    @Test
    public void test_include_false() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(3);
        classUnderTest.insert(3);
        classUnderTest.insert(3);
        assertFalse(classUnderTest.Includes(4));
    }
    @Test
    public void testAppend() {
        LinkedList l = new LinkedList();
        l.insert(6);
        l.append(9);
        String expicted = "{6} -> {9} -> NULL";
        assertEquals("the Output is", expicted, l.toString());

    }



    @Test
    public void testInsertAfter() {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(4);
        l.insert(9);
        l.insertAfter(6, 2);
        String expicted = "{5} -> {6} -> {2} -> {4} -> {9} -> NULL";
        assertEquals("the output is", expicted, l.toString());

    }
    @Test
    public void testInsertBefore() {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(4);
        l.insert(9);
        l.insertBefore(4, 1);
        String expicted = "{5} -> {6} -> {1} -> {4} -> {9} -> NULL";
        assertEquals("the Output is", expicted, l.toString());

    }



}