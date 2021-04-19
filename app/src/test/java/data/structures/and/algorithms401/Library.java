package data.structures.and.algorithms401;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Library {


    @Test
    public void testinsertShiftArrayMethodEven() {

        int[] inputArr = new int[]{1, 1, 1, 1};
        int[] outputArr = new int[]{1, 1, 2, 1};

        assertArrayEquals("even length", outputArr, shiftArray.insertShiftArray(inputArr, 2));


    }

    @Test
    public void testinsertShiftArrayMethodOdd() {

        int[] inputArr = new int[]{1, 1, 1, 1, 1};
        int[] outputArr = new int[]{1, 1, 1, 2, 1, 1};

        assertArrayEquals("odd length", outputArr, shiftArray.insertShiftArray(inputArr, 2));


    }

}
