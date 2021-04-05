package data.structures.and.algorithms401;

import java.util.Arrays;

public class shiftArray {

    public static void main(String[] args) {
        int [] array = {2,4,6,9,1};
        int num=5;

        insertShiftArray(array,num);


    }

    public static int[] insertShiftArray(int[] inputArray, int num) {

        int middle;
        int save;

        if (inputArray.length % 2 == 0) {
            middle = inputArray.length / 2;
        } else {
            middle = inputArray.length / 2 + 1;
        }

        int[] newArr = new int[inputArray.length+1];
        int index1 = 0;

        for(int i = 0; i < inputArray.length; i++) {

            if(i == middle) {
                newArr[middle] = num;
                index1++;
            }
                newArr[index1]=inputArray[i];
                index1++;
            }

        System.out.print(Arrays.toString(newArr));

        return newArr;
    }

    }
