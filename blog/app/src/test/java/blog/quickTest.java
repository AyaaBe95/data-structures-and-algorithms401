package blog;

import org.junit.Test;
import static org.junit.Assert.*;


public class quickTest {
    quickSort quickSort = new quickSort();

    // odd array
    @Test
    public void quickSort() {
        int[] actual = {5, 7, 8, 2, 1};
        int[] expected = {1, 2, 5, 7, 8};
        quickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void quickSort2() {
        int[] actual = {3};
        int[] expected = {3};
        quickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

    // even array
    @Test
    public void quickSort3() {

        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};
        quickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

    //descending array
    @Test
    public void quickSort4() {
        int[] actual = {6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};
        quickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

    // negative numbers
    @Test
    public void quickSort5() {
        int[] actual = {-3, 7, 3, -1, -2};
        int[] expected = {-3, -2, -1, 3, 7};
        quickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }
}
