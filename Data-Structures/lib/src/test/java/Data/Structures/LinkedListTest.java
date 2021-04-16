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

}