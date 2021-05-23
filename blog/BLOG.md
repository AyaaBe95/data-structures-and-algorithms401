# Insertion Sort

## problem domain:
- it takes in an unsorted array and returns the array sorted using an insertion sort algorithm.

## How it works?:
- takes an element in the array (starting at the second element and moving right) and puts it into the correct position on the left side of the array. 

## Algorithm:

- At each array-position, it checks the value there against the largest value in the sorted list 
- If larger, it leaves the element in place and moves to the next. 
- If smaller, it finds the correct position within the sorted list, shifts all the larger values up to make a space, and inserts into that correct position.
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
  * The basic operation of this algorithm is comparison. This will happen n * (n-1) number of times...concluding the algorithm to be n squared.
- Space:O(1)
  * the space utilized is constant.
