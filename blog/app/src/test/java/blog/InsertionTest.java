package blog;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertionTest {

    @Test
    public void testSorting1() {
        int[] arr = new int[] {8,4,23,42,16,15};
        assertEquals("[4, 8, 15, 16, 23, 42]", insertionSort.sorting(arr));
    }

    @Test public void testSorting2() {
        int[] arr = new int[] {20,18,12,8,5,-2};
        assertEquals("[-2, 5, 8, 12, 18, 20]", insertionSort.sorting(arr));
    }

    @Test public void testSorting3() {
        int[] arr = new int[] {2,3,5,7,13,11};
        assertEquals("[2, 3, 5, 7, 11, 13]", insertionSort.sorting(arr));
    }

    @Test public void testSorting4() {
        int[] arr = new int[] {5,12,7,5,5,7};
        assertEquals("[5, 5, 5, 7, 7, 12]", insertionSort.sorting(arr));
    }


}
