# Insertion Sort

## problem domain:
- it takes in an unsorted array and returns the array sorted using an insertion sort algorithm.

## How it works?:
- takes an element in the array (starting at the second element and moving right) and puts it into the correct position on the left side of the array. 

## Algorithm:

* it involves two loops.
  - The outer loop: keeps track of  value that  is being moved into its sorted position, starting with the second element in the array. 
  - The inner loop  iterates leftwards in order to find the correct position for that element.
## Pseudocode:
InsertionSort(int[] arr)

    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp

## Diagram:
![](https://github.com/AyaaBe95/data-structures-and-algorithms401/blob/main/assests/blog.jpeg)



## Big-O:
- Time:O(n²) 
  * it contains two loops in the worst case scenario.
- Space:O(1)
  * the space utilized is constant.
