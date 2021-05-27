package hashtable;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;


public class leftJoinTest {

    @Test
    public void emptyLeft() {
        HashMap<String, String> left = new HashMap<>();
        HashMap<String, String> right = new HashMap<>();
        right.put("test1", "test2");
        right.put("test3", "test4");
        assertEquals( "{}", leftJoin.leftJoin(left, right).toString());
        assertEquals(0, leftJoin.leftJoin(left,right).size());
    }
    @Test
    public void emptyRight() {
        HashMap<String, String> left = new HashMap<>();
        HashMap<String, String> right = new HashMap<>();
        left.put("test1", "test2");
        left.put("test3", "test4");
        assertEquals( "{test3=[test4, null], test1=[test2, null]}", leftJoin.leftJoin(left, right).toString());
        assertEquals(2, leftJoin.leftJoin(left,right).size());
    }

    @Test
    public void empty(){
        HashMap<String, String> left = new HashMap<>();
        HashMap<String, String> right = new HashMap<>();
        assertEquals("{}", leftJoin.leftJoin(left,right).toString());
        assertEquals(0, leftJoin.leftJoin(left,right).size());
    }

    @Test
    public void testLeftJoinMethodForNoSharedValuesOfTheHashMap(){
        HashMap<String, String> hashtableLeft = new HashMap<>();
        HashMap<String, String> hashtableRight = new HashMap<>();
        hashtableLeft.put("A","10");
        hashtableLeft.put("B","20");
        hashtableLeft.put("C","30");

        hashtableRight.put("E","1");
        hashtableRight.put("F","2");
        hashtableRight.put("G","3");

        assertEquals("{A=[10, null], B=[20, null], C=[30, null]}", leftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals(3, leftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void AllSharedValues(){
        HashMap<String, String> hashtableLeft = new HashMap<>();
        HashMap<String, String> hashtableRight = new HashMap<>();
        hashtableLeft.put("A","10");
        hashtableLeft.put("B","20");
        hashtableLeft.put("C","30");
        hashtableLeft.put("D","30");

        hashtableRight.put("A","1");
        hashtableRight.put("B","2");
        hashtableRight.put("C","3");
        hashtableRight.put("D","4");

        assertEquals("{A=[10, 1], B=[20, 2], C=[30, 3], D=[30, 4]}", leftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals(4, leftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void NotAllSharedValues(){
        HashMap<String, String> hashtableLeft = new HashMap<>();
        HashMap<String, String> hashtableRight = new HashMap<>();
        hashtableLeft.put("A","10");
        hashtableLeft.put("B","20");
        hashtableLeft.put("C","30");
        hashtableLeft.put("D","30");

        hashtableRight.put("A","1");
        hashtableRight.put("B","2");
        hashtableRight.put("C","3");
        hashtableRight.put("D","4");

        assertEquals("{A=[10, 1], B=[20, 2], C=[30, 3], D=[30, 4]}", leftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals(4, leftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }
}


