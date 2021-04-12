package Data.Structures;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList test = new LinkedList();
    @Test public void testEmptyLinkedList(){
        String output = test.toString();
        assertEquals( "NULL",output);
    }

    @Test public void testInsertList(){
        test.insert(3);
        String output = test.toString();
        assertEquals( "{3} -> NULL",output);
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