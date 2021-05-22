package hashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class hashtableTest {
    hashtable hashTable=new hashtable();
    @Test
    public void addHashTable(){
        hashTable.add("aya", 4);
        hashTable.add("aya", 5);
        hashTable.add("rania", 8);
        hashTable.add("assel", 8);
        hashTable.add("assel", 8);


        assertTrue("Should return 5",hashTable.size() == 5);
    }

    @Test
    public void getValueFromHashTable(){
        hashTable.add("Hello", 6);
        hashTable.add("Hello", 5);
        hashTable.add("test", "test1");

        assertTrue( hashTable.get("Hello").equals(6));
        assertTrue( hashTable.get("test").equals("test1"));
    }



    @Test
    public void testHashCode(){
        int expected = hashTable.hash("Horse");
        int actual = hashTable.hash("Horse");

        assertEquals("Should Equal 13", expected, actual);
    }
    @Test
    public void getNull(){
        hashTable.add("test", "test1");
        hashTable.add("test2", "test3");
        hashTable.add("test4", "test5");

        assertNull(hashTable.get("Hello"));
    }

    @Test
    public void testHashCodeNotSameHash(){
        int expected = hashTable.hash("Horse");
        int actual = hashTable.hash("Horses");

        assertNotEquals( expected, actual);
    }

    @Test
    public void testNotContains(){
        hashTable.hash("Aya");
        hashTable.hash("Rania");

        assertFalse( hashTable.contains("Assel"));
    }

    @Test
    public void testContains(){
        hashTable.hash("Aya");
        hashTable.hash("Rania");

        assertFalse("Should return ", hashTable.contains("Rania"));
    }


}
