package blog;

import org.junit.Test;
import static org.junit.Assert.*;


public class mergeTest {

    @Test
    public void mergeSort() {
        int[] actual = {2, 6, 5, 3, 4, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};
        mergeSort.mergeSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSort2() {
        int[] actual = {6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};
        mergeSort.mergeSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSort3() {
        int[] actual = {7, -3, 5, 0};
        int[] expected = {-3, 0, 5, 7};
        mergeSort.mergeSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSort4() {

        int[] actual = {2};
        int[] expected = {2};
        mergeSort.mergeSort(actual);
        assertArrayEquals(expected, actual);
    }
}
