package blog;

import java.util.ArrayList;

public class insertionSort {

    public static String sorting(int[] arr){

        ArrayList<Integer> data = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            data.add(arr[i]);
        }

        return data.toString();
    }
}
