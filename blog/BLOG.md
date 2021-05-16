# Insertion Sort

## problem domain:
- it takes in an unsorted array and returns the array sorted using an insertion sort algorithm.

## How it works?:
- takes an element in the array (starting at the second element and moving right) and puts it into the correct position on the left side of the array. 

## Algorithm:

* it involves two loops.
  - The outer loop:it starts from the second element in the array (it  tracks the value that is being moved into its sorted position).
  - then enters the inner loop which it iterates leftwards to find the correct position for the sorted part of the array.

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
