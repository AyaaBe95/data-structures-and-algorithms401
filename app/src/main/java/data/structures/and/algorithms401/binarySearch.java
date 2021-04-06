package data.structures.and.algorithms401;

public class binarySearch {

    public static void main(String[] args) {

        int[] arr=  {4,8,15,16,23,42};
        int n=15;
        System.out.print(binary_search(arr,n));




    }

    public static int binary_search(int[] arr, int search_key) {
        int left = 0;
        int right = arr.length - 1;
        int middle;

        while (left <= right) {
            middle = left + (right - 1) / 2;

            if (arr[middle] == search_key) {
                return middle;
            }

            if (arr[middle] < search_key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }


        }

        return -1;

    }

}
