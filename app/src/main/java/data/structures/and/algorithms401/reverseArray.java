package data.structures.and.algorithms401;

import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {

        int[] arr=  {1, 2, 3, 4, 5, 6};

        reverseArray(arr);


    }

    public static int[] reverseArray (int[] arr){


        for(int i=0;i<arr.length/2;i++){
            int test = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = test;

        }
        System.out.println( Arrays.toString(arr) );



        return arr;

    }





}
