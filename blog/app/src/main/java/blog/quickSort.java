package blog;

public class quickSort {
    public int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int position = Partition(arr, left, right);
            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
        }

        return arr;

    }


    public int Partition(int[] arr, int left, int right) {

        int pivot = arr[right];
        int low = left - 1;

        for (int i = left; i < right; i++) {
            if(arr[i] <= pivot) {
                low++;
                Swap(arr, i, low);
            }
        }

        Swap(arr, right, low + 1);

        return low + 1;
    }

    public void Swap(int[] arr, int i, int low) {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

    }
}
