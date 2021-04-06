package data.structures.and.algorithms401;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Library {


    @Test
    public void testinsertShiftArrayMethodEven(){

        int[] inputArr = new int[]{1,1,1,1};
        int[] outputArr = new int[]{1,1,2,1};

        assertArrayEquals("even length" ,outputArr,shiftArray.insertShiftArray(inputArr,2));



    }

    @Test
    public void testinsertShiftArrayMethodOdd(){

        int[] inputArr = new int[]{1,1,1,1,1};
        int[] outputArr = new int[]{1,1,1,2,1,1};

        assertArrayEquals("odd length" ,outputArr,shiftArray.insertShiftArray(inputArr,2));



    }

    @Test
    public void binarySearchTest(){


        int[] arr = new int[]{1,1,3,1,1};
        int value=3;
        int output=2;

        assertEquals("It should return the index of the search key",output,binarySearch.binary_search(arr,value));






    }

    @Test
    public void binary_search() {
        assertEquals("It should return the index of the search key",0,
                binarySearch.binary_search(new int[] {15, 1, 2}, 15));
        assertEquals("It should return -1 for search key not found in the array",-1,binarySearch.binary_search(new int[]{1, 2, 3}, 15));

    }



}
