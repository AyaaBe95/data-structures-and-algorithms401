# Insertion Sort

## problem domain:
- it takes in an unsorted array and returns the array sorted using an insertion sort algorithm.

## How it works?:
- takes an element in the array (starting at the second element and moving right) and puts it into the correct position on the left side of the array. 

## Algorithm:

* it involves two loops.
*   - the outer loop: starts from the left and keeps track the array.
    - then enter the inner loop:which it starts from the second element in the array (compare the second element with first elment and add sorted elment to its position).

## Pseudocode:
InsertionSort(int[] arr)

    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp

## Big-O:
- Time:O(n²) 
  * it contains two loops in the worst case scenario.
- Space:O(1)
  * the space utilized is constant.
