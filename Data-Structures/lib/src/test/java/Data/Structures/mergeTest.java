package Data.Structures;

import org.junit.Test;
import static org.junit.Assert.*;


public class mergeTest {

    @Test
    public void mergeLists_oneLongTest() {
        LinkedList listOne = new LinkedList();
        listOne.insert(1);
        listOne.insert(2);
        listOne.insert(3);

        LinkedList listTwo = new LinkedList();
        listTwo.insert(6);
        listTwo.insert(7);

        LinkedList result = LinkedList.mergeLists(listOne, listTwo);

        assertEquals("merge lists",
                " {3} -> {7} -> {2} -> {6} -> {1} -> null",
                result.toString());
    }

    @Test
    public void mergeLists_twoLongTest() {
        LinkedList listOne = new LinkedList();
        listOne.insert(1);
        listOne.insert(2);
        listOne.insert(3);

        LinkedList listTwo = new LinkedList();
        listTwo.insert(8);
        listTwo.insert(5);
        listTwo.insert(6);
        listTwo.insert(7);

        LinkedList result = LinkedList.mergeLists(listOne, listTwo);

        assertEquals("merge lists",
                " {3} -> {7} -> {2} -> {6} -> {1} -> {5} -> {8} -> null",
                result.toString());
    }
}
